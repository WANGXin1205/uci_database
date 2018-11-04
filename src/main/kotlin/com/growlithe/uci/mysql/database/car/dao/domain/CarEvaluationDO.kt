package com.growlithe.uci.mysql.database.car.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 汽车评估数据集
 */
data class CarEvaluationDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 购买 vhigh，high，med，low
         */
        var buying: String? = null,
        /**
         * maint：vhigh，high，med，low
         */
        var maint: String? = null,
        /**
         * 门：2,3,4,5更多
         */
        var doors: String? = null,
        /**
         * 人：2,4，更多
         */
        var persons: String? = null,
        /**
         * lug_boot：小，中，大
         */
        var lugBoot: String? = null,
        /**
         * 安全：低，中，高
         */
        var safety: String? = null,
        /**
         * 类名称：unacc，acc，good，vgood
         */
        var className: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "CarEvaluationDO(id=$id, buying=$buying, maint=$maint, doors=$doors, persons=$persons, lugBoot=$lugBoot," +
                " safety=$safety, className=$className, status=$status)\n"
    }
}