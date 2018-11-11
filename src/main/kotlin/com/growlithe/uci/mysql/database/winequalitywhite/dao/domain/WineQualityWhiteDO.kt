package com.growlithe.uci.mysql.database.winequalitywhite.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 白葡萄酒数据集
 */
data class WineQualityWhiteDO (
        /**
         * id 主键
         */
    var id: Int? = null,
        /**
         * 固定酸
         */
    var fixedAcidity: BigDecimal? = null,
        /**
         * 挥发性酸度
         */
    var volatileAcidity: BigDecimal? = null,
        /**
         * 柠檬酸
         */
    var citricAcid: BigDecimal? = null,
        /**
         * 残糖
         */
    var residualSugar: BigDecimal? = null,
        /**
         * 氯化物
         */
    var chlorides: BigDecimal? = null,
        /**
         * 游离二氧化硫
         */
    var freeSulfurDioxide: BigDecimal? = null,
        /**
         * 总二氧化硫
         */
    var totalSulfurDioxide: BigDecimal? = null,
        /**
         * 密度
         */
    var density: BigDecimal? = null,
        /**
         * ph值
         */
    var ph: BigDecimal? = null,
        /**
         * 硫酸盐
         */
    var sulphates: BigDecimal? = null,
        /**
         * 酒精
         */
    var alcohol: BigDecimal? = null,
        /**
         * 品质
         */
    var quality: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
    var status: Int? = null

) {
    override fun toString(): String {
        return "WineQualityWhiteDO(id=$id, fixedAcidity=$fixedAcidity, volatileAcidity=$volatileAcidity, citricAcid=$citricAcid, " +
                "residualSugar=$residualSugar, chlorides=$chlorides, freeSulfurDioxide=$freeSulfurDioxide, totalSulfurDioxide=$totalSulfurDioxide, " +
                "density=$density, ph=$ph, sulphates=$sulphates, alcohol=$alcohol, quality=$quality, status=$status)\n"
    }
}