package com.growlithe.uci.mysql.database.yeast.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 酵母数据集
 */
data class YeastDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 序列名称
         */
        var sequenceName: String? = null,
        /**
         * MCG：信号序列识别McGeoch的方法。
         */
        var mcg: BigDecimal? = null,
        /**
         * GVH：信号序列识别·Heijne的方法。
         */
        var gvh: BigDecimal? = null,
        /**
         * 目的：对ALOM跨膜区预测评分。
         */
        var alm: BigDecimal? = null,
        /**
         * Mit:对氨基末端的氨基酸含量判别分析评分（20个残基长）线粒体和非线粒体蛋白。
         */
        var mit: BigDecimal? = null,
        /**
         * ERL:存在“HDEL”子串（认为作为在内质网腔保留信号）。二进制属性。
         */
        var erl: BigDecimal? = null,
        /**
         * 痘：过氧化物酶体定位信号在C端。
         */
        var pox: BigDecimal? = null,
        /**
         * 伏：评分判别分析氨基酸含量的液泡和胞外蛋白。
         */
        var vac: BigDecimal? = null,
        /**
         * 校正：对核与非核蛋白的核定位信号判别分析评分。
         */
        var nuc: BigDecimal? = null,
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
        return "YeastDO(id=$id, sequenceName=$sequenceName, mcg=$mcg, gvh=$gvh, alm=$alm, mit=$mit, erl=$erl, pox=$pox, " +
                "vac=$vac, nuc=$nuc, className=$className, status=$status)\n"
    }
}