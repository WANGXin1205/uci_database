package com.growlithe.uci.mysql.database.anuran.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/18 下午2:54
 * @Description 无尾目类动物叫声数据集
 */
data class AnuranCallsDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * MFCCs_1 系数
         */
        var mfccsA: BigDecimal? = null,
        /**
         * MFCCs_2 系数
         */
        var mfccsB: BigDecimal? = null,
        /**
         * MFCCs_3 系数
         */
        var mfccsC: BigDecimal? = null,
        /**
         * MFCCs_4 系数
         */
        var mfccsD: BigDecimal? = null,
        /**
         * MFCCs_5 系数
         */
        var mfccsE: BigDecimal? = null,
        /**
         * MFCCs_6 系数
         */
        var mfccsF: BigDecimal? = null,
        /**
         * MFCCs_7 系数
         */
        var mfccsG: BigDecimal? = null,
        /**
         * MFCCs_8 系数
         */
        var mfccsH: BigDecimal? = null,
        /**
         * MFCCs_9 系数
         */
        var mfccsI: BigDecimal? = null,
        /**
         * MFCCs_10 系数
         */
        var mfccsJ: BigDecimal? = null,
        /**
         * MFCCs_11 系数
         */
        var mfccsK: BigDecimal? = null,
        /**
         * MFCCs_12 系数
         */
        var mfccsL: BigDecimal? = null,
        /**
         * MFCCs_13 系数
         */
        var mfccsM: BigDecimal? = null,
        /**
         * MFCCs_14 系数
         */
        var mfccsN: BigDecimal? = null,
        /**
         * MFCCs_15 系数
         */
        var mfccsO: BigDecimal? = null,
        /**
         * MFCCs_16 系数
         */
        var mfccsP: BigDecimal? = null,
        /**
         * MFCCs_17 系数
         */
        var mfccsQ: BigDecimal? = null,
        /**
         * MFCCs_18 系数
         */
        var mfccsR: BigDecimal? = null,
        /**
         * MFCCs_19 系数
         */
        var mfccsS: BigDecimal? = null,
        /**
         * MFCCs_20 系数
         */
        var mfccsT: BigDecimal? = null,
        /**
         * MFCCs_21 系数
         */
        var mfccsU: BigDecimal? = null,
        /**
         * MFCCs_22 系数
         */
        var mfccsV: BigDecimal? = null,
        /**
         * 家庭
         */
        var family: String? = null,
        /**
         * 种类
         */
        var genus: String? = null,
        /**
         * 物种
         */
        var species: String? = null,
        /**
         * 记录id
         */
        var recordId: Int? = null,
        /**
         * 状态
         */
        var status:Int? = null

) {
    override fun toString(): String {
        return "AnuranCallsDO(id=$id, mfccsA=$mfccsA, mfccsB=$mfccsB, mfccsC=$mfccsC, mfccsD=$mfccsD, mfccsE=$mfccsE," +
                "mfccsF=$mfccsF, mfccsG=$mfccsG, mfccsH=$mfccsH, mfccsI=$mfccsI, mfccsJ=$mfccsJ, mfccsK=$mfccsK, " +
                "mfccsL=$mfccsL, mfccsM=$mfccsM, mfccsN=$mfccsN, mfccsO=$mfccsO, mfccsP=$mfccsP, mfccsQ=$mfccsQ, " +
                "mfccsR=$mfccsR, mfccsS=$mfccsS, mfccsT=$mfccsT, mfccsU=$mfccsU, mfccsV=$mfccsV, family=$family, " +
                "genus=$genus, species=$species, recordId=$recordId, status=$status)\n"
    }
}
