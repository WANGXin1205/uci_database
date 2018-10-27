package com.growlithe.uci.mysql.database.balance.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/25 上午12:21
 * @Description
 */
data class BalanceScaleDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 类名称
         */
        var className: String? = null,
        /**
         * 左重
         */
        var leftWeight: Long? = null,
        /**
         * 左距离
         */
        var leftDistance: Long? = null,
        /**
         * 右重
         */
        var rightWeight: Long? = null,
        /**
         * 右距离
         */
        var rightDistance: Long? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "BalanceScaleDO(id=$id, className=$className, left_weight=$leftWeight, left_Distance=$leftDistance," +
                " right_Weight=$rightWeight, right_Distance=$rightDistance, status=$status)\n"
    }
}