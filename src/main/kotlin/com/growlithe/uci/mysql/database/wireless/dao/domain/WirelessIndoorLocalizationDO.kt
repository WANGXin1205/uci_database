package com.growlithe.uci.mysql.database.wireless.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description wifi信号确定室内场所数据集
 */
data class WirelessIndoorLocalizationDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * wifi信号a
         */
        var wifiSignalA: Int? = null,
        /**
         * wifi信号b
         */
        var wifiSignalB: Int? = null,
        /**
         * wifi信号c
         */
        var wifiSignalC: Int? = null,
        /**
         * wifi信号d
         */
        var wifiSignalD: Int? = null,
        /**
         * wifi信号e
         */
        var wifiSignalE: Int? = null,
        /**
         * wifi信号f
         */
        var wifiSignalF: Int? = null,
        /**
         * wifi信号g
         */
        var wifiSignalG: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据类型 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "WirelessIndoorLocalizationDO(id=$id, wifiSignalA=$wifiSignalA, wifiSignalB=$wifiSignalB, " +
                "wifiSignalC=$wifiSignalC, wifiSignalD=$wifiSignalD, wifiSignalE=$wifiSignalE, wifiSignalF=$wifiSignalF, " +
                "wifiSignalG=$wifiSignalG, className=$className, status=$status)\n"
    }
}