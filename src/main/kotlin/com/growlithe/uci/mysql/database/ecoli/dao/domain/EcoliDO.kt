package com.growlithe.uci.mysql.database.ecoli.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 大肠杆菌数据集
 */
data class EcoliDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 序列名称
         */
        var sequenceName: String? = null,
        /**
         * MCG：信号序列识别McGeoch的方法
         */
        var mcg: BigDecimal? = null,
        /**
         * GVH：信号序列识别·Heijne的方法
         */
        var gvh: BigDecimal? = null,
        /**
         * 唇：冯海涅的信号肽酶II序列得分。
         */
        var lip: BigDecimal? = null,
        /**
         * 充电：充电对脂蛋白的N端存在预测
         */
        var chg: BigDecimal? = null,
        /**
         * AAC：评分判别分析的氨基酸含量的外膜和周质蛋白
         */
        var aac: BigDecimal? = null,
        /**
         * ALM1：的ALOM跨膜区预测评分
         */
        var almA: BigDecimal? = null,
        /**
         * ALM2：包括假定的裂解信号区域的序列后ALOM节目配乐
         */
        var almB: BigDecimal? = null,
        /**
         * 分类名称
         */
        var className: String? = null,
        /**
         * 数据有效性 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "EcoliDO(id=$id, sequenceName=$sequenceName, mcg=$mcg, gvh=$gvh, lip=$lip, chg=$chg, aac=$aac, " +
                "almA=$almA, almB=$almB, className=$className, status=$status)\n"
    }
}