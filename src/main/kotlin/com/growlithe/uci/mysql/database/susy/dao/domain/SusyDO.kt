package com.growlithe.uci.mysql.database.susy.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 深度学习的奇异粒子数据集
 */
data class SusyDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 类别
         */
        var className: Int? = null,

        var aA: BigDecimal? = null,

        var aB: BigDecimal? = null,

        var aC: BigDecimal? = null,

        var aD: BigDecimal? = null,

        var aE: BigDecimal? = null,

        var aF: BigDecimal? = null,

        var aG: BigDecimal? = null,

        var aH: BigDecimal? = null,

        var bA: BigDecimal? = null,

        var bB: BigDecimal? = null,

        var bC: BigDecimal? = null,

        var bD: BigDecimal? = null,

        var bE: BigDecimal? = null,

        var bF: BigDecimal? = null,

        var bG: BigDecimal? = null,

        var bH: BigDecimal? = null,

        var bI: BigDecimal? = null,

        var bJ: BigDecimal? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "SusyDO(id=$id, className=$className, aA=$aA, aB=$aB, aC=$aC, aD=$aD, aE=$aE, aF=$aF, aG=$aG, aH=$aH, " +
                "bA=$bA, bB=$bB, bC=$bC, bD=$bD, bE=$bE, bF=$bF, bG=$bG, bH=$bH, bI=$bI, bJ=$bJ, status=$status)\n"
    }
}