package com.growlithe.uci.mysql.database.blood.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 输血服务中心数据集
 */
data class BloodTransfusionServiceCenterDO(
        /**
         *
         */
        val id: Long? = null,
        /**
         * 新近度 - 自上次捐赠以来的数月
         */
        val recency: String? = null,
        /**
         * 频率 - 捐赠总数
         */
        val frequency: String? = null,
        /**
         * 货币 - 以cc为单位捐赠的总血液
         */
        val monetary: String? = null,
        /**
         * 时间 - 首次捐赠后的月份
         */
        val time: String? = null,
        /**
         * 类别名称
         */
        val className: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        val status: Int? = null


) {
    override fun toString(): String {
        return "BloodTransfusionServiceCenterDO(id=$id, recency=$recency, frequency=$frequency, monetary=$monetary, time=$time, className=$className, status=$status)\n"
    }
}