package com.growlithe.uci.mysql.database.occupancy.dao.domain

import java.math.BigDecimal
import java.util.Date

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  占有率数据集
 */
data class OccupancyDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 日期
         */
        var date: Date? = null,
        /**
         * 温度
         */
        var temperature: BigDecimal? = null,
        /**
         * 湿度
         */
        var humidity: BigDecimal? = null,
        /**
         * 亮度
         */
        var light: BigDecimal? = null,
        /**
         * 二氧化碳
         */
        var carbonDioxide: BigDecimal? = null,
        /**
         * 湿度比
         */
        var humidityRatio: BigDecimal? = null,
        /**
         * 入住
         */
        var occupancy: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "OccupancyDO(id=$id, date=$date, temperature=$temperature, humidity=$humidity, light=$light, carbonDioxide=$carbonDioxide, " +
                "humidityRatio=$humidityRatio, occupancy=$occupancy, status=$status)\n"
    }
}