package com.growlithe.uci.mysql.database.magic.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  神奇的伽马射线数据集
 */
data class MagicGammaTelescopeDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * fLength: continuous # major axis of ellipse [mm]
         */
        var fLength: BigDecimal? = null,
        /**
         * fWidth: continuous # minor axis of ellipse [mm]
         */
        var fWidth: BigDecimal? = null,
        /**
         * fSize: continuous # 10-log of sum of content of all pixels [in #phot]
         */
        var fSize: BigDecimal? = null,
        /**
         * fConc: continuous # ratio of sum of two highest pixels over fSize [ratio]
         */
        var fConc: BigDecimal? = null,
        /**
         * fConc1: continuous # ratio of highest pixel over fSize [ratio]
         */
        var fConcA: BigDecimal? = null,
        /**
         * fAsym: continuous # distance from highest pixel to center, projected onto major axis [mm]
         */
        var fAsym: BigDecimal? = null,
        /**
         * fM3Long: continuous # 3rd root of third moment along major axis [mm]
         */
        var fmLong: BigDecimal? = null,
        /**
         * fM3Trans: continuous # 3rd root of third moment along minor axis [mm]
         */
        var fmTrans: BigDecimal? = null,
        /**
         * fAlpha: continuous # angle of major axis with vector to origin [deg]
         */
        var fAlpha: BigDecimal? = null,
        /**
         * fDist: continuous # distance from origin to center of ellipse [mm]
         */
        var fDist: BigDecimal? = null,
        /**
         * 类别
         */
        var className: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "MagicGammaTelescopeDO(id=$id, fLength=$fLength, fWidth=$fWidth, fSize=$fSize, fConc=$fConc, fConcA=$fConcA, " +
                "fAsym=$fAsym, fmLong=$fmLong, fmTrans=$fmTrans, fAlpha=$fAlpha, fDist=$fDist, className=$className, " +
                "status=$status)\n"
    }
}