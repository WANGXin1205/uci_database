package com.growlithe.uci.util

import org.yaml.snakeyaml.Yaml
import java.io.FileInputStream
import java.util.*

/**
 * Created by WANGXin on 2017/11/1
 */
object YmlUtil {

    /**
     * yml转为行结构list, 可以转换文件使用
     * @param   ymlFileName
     * @return  Map
     */
    fun ymlToProperties(ymlFileName: String): List<String> {
        return ymlToLineMap(ymlFileName).map { "${it.key}=${it.value}" }.toList()
    }

    /**
     * 行结构转为树结构, 可以转换文件使用
     * @param   propertiesFileName
     * @return  Map
     */
    fun propertiesToYml(propertiesFileName: String): Map<*, *> {
        var props = this::class.java.classLoader.getResource(propertiesFileName)
        var pps = Properties()
        pps.load(FileInputStream(props.file))
        val enum = pps.propertyNames()//得到配置文件的名字
        var propMap = mutableMapOf<String, String>()
        while (enum.hasMoreElements()) {
            val strKey = enum.nextElement() as String
            val strValue = pps.getProperty(strKey)
            propMap.put(strKey, strValue)
        }
        return lineToTree(propMap)

    }

    /**
     * yml转为行结构map
     * @param   ymlFileName
     * @return  Map
     */
    fun ymlToLineMap(ymlFileName: String): Map<*, *> {
        var ymlMap = loadYmlToMap(ymlFileName)
        return treeToLine(ymlMap)
    }

    /**
     * 配置文件转为Map
     * @param   ymlFileName
     * @return  Map
     */
    private fun loadYmlToMap(ymlFileName: String): Map<*, *> {
        val yml = this::class.java.classLoader.getResource(ymlFileName)
        var ymlMap = Yaml().load(FileInputStream(yml.file)) as Map<*, *>
        return ymlMap
    }

    /**
     *  树形结构转为行结构
     * @param
     * @return
     */
    private fun treeToLine(map: Map<*, *>): Map<*, *> {
        var mutableMap = mutableMapOf<Any?, Any?>()
        var existMap = false
        map.map {
            var p = it
            var k = p.key
            var v = p.value
            if (v is Map<*, *>) {
                v.map {
                    mutableMap.put("$k.${it.key}", it.value)
                }
                existMap = true
            } else {
                mutableMap.put(k, v)
            }
        }
        return if (existMap) treeToLine(mutableMap) else mutableMap
    }

    /**
     *  树形结构转为行结构
     * @param
     * @return
     */
    private fun lineToTree(map: Map<*, *>): Map<*, *> {
        var mutableMap = mutableMapOf<Any?, Any?>()
        var existDot = false
        map.map {
            var p = it
            var k = p.key.toString()
            var v = p.value
            if (k.contains(".")) {
                var keys = k.split(".")
                var firstKey = keys.slice(0..keys.size - 2).joinToString(".")
                var subKey = keys[keys.size - 1]
                var subMap = mutableMap[firstKey]
                if (Objects.isNull(subMap)) {
                    subMap = mutableMapOf(subKey to v)
                } else {
                    var subMap = subMap as MutableMap<Any?, Any?>
                    subMap.put(subKey, v)
                }
                mutableMap.put(firstKey, subMap)
                existDot = true
            } else {
                mutableMap.put(k, v)
            }
        }
        return if (existDot) lineToTree(mutableMap) else mutableMap
    }

    /**
     * map中根据key获取值
     * Map类增加扩展方法
     * @param  key
     * @return value
     */
    @Deprecated("使用ymlToLineMap()")
    private fun Map<*, *>.getValueByKeys(key: String): String {
        if (!key.contains(".")) {
            return this[key].toString()
        }
        var keys = key.split(".")
        var v = this[keys[0]] as Map<*, *>
        var k = keys.drop(1).joinToString(".")
        return v.getValueByKeys(k)
    }
}