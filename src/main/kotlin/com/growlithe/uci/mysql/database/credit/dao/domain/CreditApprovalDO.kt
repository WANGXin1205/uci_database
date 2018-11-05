package com.growlithe.uci.mysql.database.credit.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 信用审计数据集
 */
data class CreditApprovalDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 以下数据属性 为机密
         */
        var secretA: String? = null,

        var secretB: BigDecimal? = null,

        var secretC: BigDecimal? = null,

        var secretD: String? = null,

        var secretE: String? = null,

        var secretF: String? = null,

        var secretG: String? = null,

        var secretH: BigDecimal? = null,

        var secretI: String? = null,

        var secretJ: String? = null,

        var secretK: Int? = null,

        var secretL: String? = null,

        var secretM: String? = null,

        var secretN: Int? = null,

        var secretO: Int? = null,
        /**
         * 分类名称
         */
        var className: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "CreditApprovalDO(id=$id, secretA=$secretA, secretB=$secretB, secretC=$secretC, secretD=$secretD, secretE=$secretE," +
                "secretF=$secretF, secretG=$secretG, secretH=$secretH, secretI=$secretI, secretJ=$secretJ, secretK=$secretK, " +
                "secretL=$secretL, secretM=$secretM, secretN=$secretN, secretO=$secretO, className=$className, status=$status)\n"
    }
}