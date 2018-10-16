package com.growlithe.uci.utils;

import com.growlithe.uci.excepetion.TransactionException;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.convert.converter.Converter;

import java.beans.PropertyDescriptor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 对象工具类
 * @date 2013-6-13 上午10:26:13 
 * @author wangk
 * @Description:
 * @project isag
 */
public class ObjectUtil {
	private static final Log LOGGER = LogFactory.getLog(ObjectUtil.class);
	/** 类型转换器集合 */
	public static final List<Converter<String, ? extends Object>> CONVERTERS = 
			new ArrayList<Converter<String, ? extends Object>>();
	
	private static final Map<String, Converter<String, ? extends Object>> CONVERTER_MAP;
	private static final ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<>();
	/**
	 * 初始化类型转换器集合
	 */
	static {
		CONVERTER_MAP = getConverterMap();
	}
	
	/**
	 * 获取Converter的map
	 * @Date:2013-7-31
	 * @author wangk
	 * @return
	 * @Description:
	 * @return Map<String,Converter<String,? extends Object>>
	 */
	private static Map<String, Converter<String, ? extends Object>> getConverterMap(){
		Map<String, Converter<String, ? extends Object>> map = new HashMap<String, Converter<String,? extends Object>>();
		for (Converter<String, ? extends Object> converter : CONVERTERS) {
			String type = ((Class<?>)((ParameterizedType)converter.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[1]).getName();
			Converter<String, ? extends Object> tempConverter = map.get(type);
			if(tempConverter == null){
				map.put(type, converter);
			}
		}
		return map;
	}
	
	/**
	 * 获取一个Converter
	 * @Date:2013-7-31
	 * @author wangk
	 * @param type
	 * @return
	 * @Description:
	 * @return Converter<String,? extends Object>
	 */
	private static Converter<String, ? extends Object> getConverter(Type type){
		return CONVERTER_MAP.get(((Class<?>)type).getName());
	}

	/**
	 * 判断clazz是否是superClass或其子类
	 * @Date:2013-6-13
	 * @author wangk
	 * @param clazz
	 * @param superClass
	 * @return
	 * @Description:
	 * @return boolean
	 */
	public static boolean isExtends(Class<?> clazz, Class<?> superClass) {
		if(clazz == superClass) {
			return true;
		}
		Class<?> _class = clazz.getSuperclass();
		while (_class != null) {
			if(_class == superClass) {
				return true;
			}
			_class = _class.getSuperclass();
		}
		return false;
	}
	
	/**
	 * 判断clazz是否实现或继承interfaceClass
	 * @Date:2013-6-13
	 * @author wangk
	 * @param clazz
	 * @param interfaceClass
	 * @return
	 * @Description:
	 * @return boolean
	 */
	public static boolean isImplement(Class<?> clazz, Class<?> interfaceClass) {
		if(!interfaceClass.isInterface()) {
			return false;
		}
		if(clazz == interfaceClass) {
			return true;
		}
		List<Class<?>> interfaces = new ArrayList<Class<?>>();
		if(clazz.isInterface()) {
			interfaces.addAll(getSuperInterfaces(clazz));
		} else {
			interfaces.addAll(getClassInterfaces(clazz));
		}
		return interfaces.contains(interfaceClass);
	}
	
	/**
	 * 获得类的所有属性
	 * @Date:2013-6-13
	 * @author wangk
	 * @param clazz
	 * @return
	 * @Description:
	 * @return List<Field>
	 */
	public static List<Field> getAllField(Class<?> clazz) {
		List<Field> list = new ArrayList<Field>();
		for (Field field : clazz.getDeclaredFields()) {
			list.add(field);
		}
		Class<?> _clazz = clazz.getSuperclass();
		while(_clazz != null) {
			list.addAll(getAllField(_clazz));
			_clazz = _clazz.getSuperclass();
		}
		return list;
	}
	
	/**
	 * 获取当前类的所有字段
	 * @Date:2013-8-13
	 * @author wangk
	 * @param clazz
	 * @return
	 * @Description:
	 * @return List<Field>
	 */
	public static List<Field> getAllDeclareFields(Class<?> clazz){
		List<Field> list = new ArrayList<Field>();
		for (Field field : clazz.getDeclaredFields()) {
			list.add(field);
		}
		return list;
	}
	
	/**
	 * 获得类的所有标注了指定的atClass类型注解的属性
	 * @Date:2013-6-13
	 * @author wangk
	 * @param clazz
	 * @param atClass
	 * @return
	 * @Description:
	 * @return List<Field>
	 */
	public static List<Field> getFieldsByAnnotation(Class<?> clazz, Class<? extends Annotation> atClass) {
		List<Field> list = getAllField(clazz);
		List<Field> ret = new ArrayList<Field>();
		for (Field field : list) {
			if(field.getAnnotation(atClass) != null) {
				ret.add(field);
			}
		}
		return ret;
	}

	/**
	 * 获得类的属性和读方法的映射关系
	 * @Date:2013-6-13
	 * @author wangk
	 * @param clazz
	 * @return
	 * @Description:
	 * @return Map<String,Method>
	 */
	public static Map<String, Method> getReadMethodMapping(Class<?> clazz) {
		Map<String, Method> getLowerMapping = new HashMap<String, Method>();
		Map<String, Method> getUpperMapping = new HashMap<String, Method>();
		Map<String, Method> isLowerMapping = new HashMap<String, Method>();
		Map<String, Method> isUpperMapping = new HashMap<String, Method>();
		for (Method method : clazz.getMethods()) {
			if(method.getParameterTypes().length > 0) {
				continue;
			}
			String methodName = method.getName();
			if(method.getReturnType() == boolean.class && methodName.startsWith("is")) {
				if(methodName.matches("^is[a-z_].*$")) {
					isLowerMapping.put(methodName.substring(2), method);
				} else if(methodName.matches("^is[A-Z].*$")) {
					isUpperMapping.put(methodName.substring(2, 3).toLowerCase() + methodName.substring(3), method);
				}
			} else {
				if(methodName.matches("^get[a-z_].*$")) {
					getLowerMapping.put(methodName.substring(3), method);
				} else if(methodName.matches("^get[A-Z].*$")) {
					getUpperMapping.put(methodName.substring(3, 4).toLowerCase() + methodName.substring(4), method);
				}
			}
		}
		for (String field : getUpperMapping.keySet()) {
			getLowerMapping.put(field, getUpperMapping.get(field));
		}
		for (String field : isLowerMapping.keySet()) {
			getLowerMapping.put(field, isLowerMapping.get(field));
		}
		for (String field : isUpperMapping.keySet()) {
			getLowerMapping.put(field, isUpperMapping.get(field));
		}
		return getLowerMapping;
	}
	
	/**
	 * 序列化对象
	 * @Date:2013-6-13
	 * @author wangk
	 * @param obj
	 * @return
	 * @Description:
	 * @return byte[]
	 */
	public static byte[] serialize(Object obj) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
		    oos.flush();
		    oos.close();
		    return baos.toByteArray();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	    
	}

	/**
	 * 反序列化方法
	 * @Date:2013-6-13
	 * @author wangk
	 * @param bytes
	 * @return
	 * @Description:
	 * @return Object
	 */
	public static Object unSerialize(byte[] bytes) {
		Object obj = null;
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);	
		try {
			ObjectInputStream ois = new ObjectInputStream(bais);
			obj = ois.readObject();
			return obj;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}		 
	}
	
	/**
	 * 对象的深层复制，obj的实例类型必须实现序列化接口，否则将抛出异常
	 * @Date:2013-6-13
	 * @author wangk
	 * @param obj
	 * @return
	 * @Description:
	 * @return T
	 */
	public static <T> T clone(T obj) {
		@SuppressWarnings("unchecked")
		T ret = (T) unSerialize(serialize(obj));
		return ret; 
	}

	/**
	 * 获得指定类型的转换器，不存在返回null
	 * @Date:2013-6-13
	 * @author wangk
	 * @param type
	 * @return
	 * @Description:
	 * @return Converter<String,? extends Object>
	 */
	public static Converter<String, ? extends Object> getConverter(Class<? extends Object> type) {
		for (Converter<String, ? extends Object> converter : CONVERTERS) {
			ParameterizedType parameterizedType = 
				(ParameterizedType)converter.getClass().getGenericInterfaces()[0];
			Type[] params = parameterizedType.getActualTypeArguments();
			@SuppressWarnings("unchecked")
			Class<? extends Object> _type = (Class<? extends Object>)params[1];
			if(isExtends(type, _type)) {
				return converter;
			}
		}
		return null;
	}
	
	/**
	 * 递归获取类的实现接口
	 * @Date:2013-6-13
	 * @author wangk
	 * @param clazz
	 * @return
	 * @Description:
	 * @return List<Class<?>>
	 */
	private static List<Class<?>> getClassInterfaces(
			Class<?> clazz) {
		List<Class<?>> interfaces = new ArrayList<Class<?>>();
		for (Class<?> interface0 : clazz.getInterfaces()) {
			interfaces.addAll(getSuperInterfaces(interface0));
		}
		Class<?> class0 = clazz.getSuperclass();
		while (class0 != null) {
			interfaces.addAll(getClassInterfaces(class0));
			class0 = class0.getSuperclass();
		}
		return interfaces;
	}

	/**
	 * 递归获取指定接口及其继承的接口
	 * @Date:2013-6-13
	 * @author wangk
	 * @param interface0 指定接口
	 * @return
	 * @Description:
	 * @return List<Class<?>>
	 */
	private static List<Class<?>> getSuperInterfaces(
			Class<?> interface0) {
		List<Class<?>> interfaces = new ArrayList<Class<?>>();
		interfaces.add(interface0);
		for (Class<?> interface1 : interface0.getInterfaces()) {
			interfaces.addAll(getSuperInterfaces(interface1));
		}
		return interfaces;
	}
	
	/**
	 * 获取一个Class对象的所有字段名
	 * @Date:2013-7-30
	 * @author wangk
	 * @param clazz
	 * @return
	 * @Description:
	 * @return List<String>
	 */
	public static List<String> getAllFieldNames(Class<?> clazz){
		List<String> list = new ArrayList<String>();
		List<Field> fields = getAllDeclareFields(clazz);
		for (Field field : fields) {
			list.add(field.getName());
		}
		return list;
	}
	
	/**
	 * 反射获取字段值
	 * @Date:2015年10月13日
	 * @author wangk
	 * @param fieldName
	 * @param obj
	 * @return
	 * @Description:
	 */
	public static Object getValue(String fieldName,Object obj){
		Object value = null;
		try {
			Method getMethod = new PropertyDescriptor(fieldName,obj.getClass()).getReadMethod();
			if(getMethod == null){
				Field field = obj.getClass().getField(fieldName);
				field.setAccessible(true);
				value = field.get(obj);
			}else{
				value = getMethod.invoke(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * 反射设值
	 * @Date:2015年10月14日
	 * @author wangk
	 * @param fieldName
	 * @param value
	 * @param obj
	 * @throws Exception 
	 * @Description:
	 */
	public static void setValue(String fieldName,Object value,Object obj) {
		try {
			String key = obj.getClass().getName()+fieldName;
			Object cacheValue = cache.get(key);
			if(cacheValue == null){
				Map<String, Object> map = new HashMap<>();
				map.put(fieldName+"setMethod", new PropertyDescriptor(fieldName,obj.getClass()).getWriteMethod());
				List<Field> fields = getAllField(obj.getClass());
				Field field = null;
				for (Field tempField : fields) {
					if(fieldName.equals(tempField.getName())){
						field = tempField;
						break;
					}
				}
				if(field == null){
					throw new TransactionException(obj.getClass().getName()+"类中没有名称为"+fieldName+"的字段！！！");
				}
				map.put(fieldName+"field", field);
				cache.put(key, map);
			}
			@SuppressWarnings("unchecked")
			Map<String, Object> classMap = (Map<String, Object>) cache.get(key);
			Method setMethod = (Method) classMap.get(fieldName+"setMethod");
			Field field = (Field) classMap.get(fieldName+"field");
			if(value == null || setMethod == null){
				field.setAccessible(true);
				field.set(obj, value);
			}else{
				Object realValue = value;
				if(value instanceof String){
					String tempValue = (String) value;
					if(Date.class.isAssignableFrom(field.getType())){
						if(!isDate(tempValue)){
							throw new TransactionException("请输入一个有效日期，格式:yyyy-MM、yyyyMM、yyyy-MM-dd！！！");
						}
						realValue = getConverter(Date.class).convert(tempValue);
					}else if(isWrapClass(field.getType()) || BigDecimal.class.isAssignableFrom(field.getType())){
						tempValue = tempValue.replaceAll(",","");
						if(BigDecimal.class.isAssignableFrom(field.getType()) && !isValidNum(tempValue)){
							throw new TransactionException("请输入一个整数部分不大于10位，小数部分最多2位的数！！！");
						}else if(Long.class.isAssignableFrom(field.getType()) && !isValidLong(tempValue)){
							throw new TransactionException("请输入一个正整数！！！");
						}
						Constructor<?> constructor = field.getType().getDeclaredConstructor(String.class);
						if(constructor == null){
							throw new TransactionException(field.getType().getName() + "无String类型的构造方法!!!");
						}
						realValue = constructor.newInstance(tempValue);
					}
				}
				setMethod.invoke(obj,realValue);
			}
		} catch (Exception e) {
			LOGGER.warn("异常", e);
			if(TransactionException.class.isInstance(e)){
				throw (TransactionException)e;
			}else{
				throw new TransactionException("值类型转换异常,请输入一个有效的值！！");
			}
		}
	}
	
	private static boolean isValidNum(String num){
		return num.matches("^\\d{1,10}\\.?\\d{0,2}$");
	}
	
	private static boolean isValidLong(String value){
		return value.matches("^[1-9]\\d*$");
	}
	
	public static boolean isDate(String value){
		return value.matches("(^(\\d{4})/(0\\d{1}|1[0-2])/(0\\d{1}|[12]\\d{1}|3[01])\\s{1}(0\\d{1}|1[0-9]|2[0-4]):(0\\d{1}|[1-5][0-9]):(0\\d{1}|[1-5][0-9])$)"
				+ "|(^(\\d{4})-(0\\d{1}|1[0-2])-(0\\d{1}|[12]\\d{1}|3[01])\\s{1}(0\\d{1}|1[0-9]|2[0-4]):(0\\d{1}|[1-5][0-9]):(0\\d{1}|[1-5][0-9])$)");
        
	
	}
	
	public static boolean isWrapClass(Class<?> clz) { 
        try { 
           return ((Class<?>) clz.getField("TYPE").get(null)).isPrimitive();
        } catch (Exception e) { 
            return false; 
        } 
    } 

}
