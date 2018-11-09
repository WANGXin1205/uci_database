package com.growlithe.uci.mysql.database.localization.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  人员活动定位数据集
 */
data class LocalizationDataForPersonActivityDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 序列名称
         */
        var sequenceName: String? = null,
        /**
         * 标签识别器
         */
        var tagIdentificatorm: String? = null,
        /**
         * 时间戳
         */
        var timestamp: Long? = null,
        /**
         * 日期
         */
        var dateFormat: String? = null,
        /**
         * 标签x的坐标
         */
        var xCoordinateOfTheTag: BigDecimal? = null,
        /**
         * 标签y的坐标
         */
        var yCoordinateOfTheTag: BigDecimal? = null,
        /**
         * 标签z的坐标
         */
        var zCoordinateOfTheTag: BigDecimal? = null,
        /**
         * 活动
         */
        var activity: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "LocalizationDataForPersonActivityDO(id=$id, sequenceName=$sequenceName, tagIdentificatorm=$tagIdentificatorm, " +
                "timestamp=$timestamp, dateFormat=$dateFormat, xCoordinateOfTheTag=$xCoordinateOfTheTag, " +
                "yCoordinateOfTheTag=$yCoordinateOfTheTag, zCoordinateOfTheTag=$zCoordinateOfTheTag, activity=$activity, " +
                "status=$status)\n"
    }
}