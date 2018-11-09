package com.growlithe.uci.mysql.database.nursery.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  幼儿园数据集
 */
data class NurseryDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 双亲
         */
        var parents: String? = null,
        /**
         * 孩子的幼儿园
         */
        var hasNurs: String? = null,
        /**
         * 家庭结构
         */
        var form: String? = null,
        /**
         * 孩子情况
         */
        var children: String? = null,
        /**
         * 房屋
         */
        var housing: String? = null,
        /**
         * 财务
         */
        var finance: String? = null,
        /**
         * 社会
         */
        var social: String? = null,
        /**
         * 健康
         */
        var health: String? = null,
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
        return "NurseryDO(id=$id, parents=$parents, hasNurs=$hasNurs, form=$form, children=$children, housing=$housing, " +
                "finance=$finance, social=$social, health=$health, className=$className, status=$status)\n"
    }
}