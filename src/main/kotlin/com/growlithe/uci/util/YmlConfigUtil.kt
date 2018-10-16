package com.growlithe.uci.util


/**
 * Created by WANGXin on 2017/11/1
 * @Description:    kotlin无法使用@Value获取配置文件中的值，手动读取配置
 * @Date:           Created in 下午4:06 2017/10/16
 */
object YmlConfigUtil {

    /**
     * yml加载生成的map
     */
    private var activeProps:Map<*,*>

    /**
     * 加载配置文件
     */
    init {
        //application文件
        var appProps = YmlUtil.ymlToLineMap("application.yml")
        //profile文件
        var active = appProps["spring.profiles.active"]
        //active配置
        activeProps = YmlUtil.ymlToLineMap("application-$active.yml")
    }

    /**
     * 获取Yml中的配置，根据key获取value
     * @param   key
     * @return  value
     */
    fun getYmlValue(key: String):String {
        return activeProps[key].toString()
    }





}


