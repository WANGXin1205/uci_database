package com.growlithe.uci.mysql.database.wholesale.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 客户批发数据集
 */
data class WholesaleCustomersDO (
        /**
         * id 主键
         */
    var id: Int? = null,
        /**
         * 新鲜度
         */
    var fresh: Int? = null,
        /**
         * 牛奶
         */
    var milk: Int? = null,
        /**
         * 食品
         */
    var grocery: Int? = null,
        /**
         * 冷冻
         */
    var frozen: Int? = null,
        /**
         * 洗涤用品和纸制品
         */
    var detergentsPaper: Int? = null,
        /**
         * 熟食
         */
    var delicassen: Int? = null,
        /**
         * 渠道
         */
    var channel: Int? = null,
        /**
         * 区域
         */
    var region: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
    var status: Int? = null

) {
    override fun toString(): String {
        return "WholesaleCustomersDO(id=$id, fresh=$fresh, milk=$milk, grocery=$grocery, frozen=$frozen, detergentsPaper=$detergentsPaper, " +
                "delicassen=$delicassen, channel=$channel, region=$region, status=$status)\n"
    }
}