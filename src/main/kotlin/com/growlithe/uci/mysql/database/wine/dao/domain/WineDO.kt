package com.growlithe.uci.mysql.database.wine.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 葡萄酒数据集
 */
data class WineDO(
        /**
         * id 主键
         */
    var id: Int? = null,
        /**
         * 类别名称
         */
    var className: Int? = null,
        /**
         * 酒精
         */
    var alcohol: BigDecimal? = null,
        /**
         * 苹果酸
         */
    var malicAcid: BigDecimal? = null,
        /**
         * 灰尘
         */
    var ash: BigDecimal? = null,
        /**
         * 灰分碱度
         */
    var alcalinityOfAsh: BigDecimal? = null,
        /**
         * 镁
         */
    var magnesium: Int? = null,
        /**
         * 总酚
         */
    var totalPhenols: BigDecimal? = null,
        /**
         * 黄酮类化合物
         */
    var flavanoids: BigDecimal? = null,
        /**
         * 非黄酮类化合物
         */
    var nonflavanoidPhenols: BigDecimal? = null,
        /**
         * 原花青素
         */
    var proanthocyanins: BigDecimal? = null,
        /**
         * 颜色强度
         */
    var colorIntensity: BigDecimal? = null,
        /**
         * 色调
         */
    var hue: BigDecimal? = null,
        /**
         * 提取的葡萄酒
         */
    var dilutedWines: BigDecimal? = null,
        /**
         * 脯氨酸
         */
    var proline: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
    var status: Int? = null

) {
    override fun toString(): String {
        return "Wine(id=$id, className=$className, alcohol=$alcohol, malicAcid=$malicAcid, ash=$ash, " +
                "alcalinityOfAsh=$alcalinityOfAsh, magnesium=$magnesium, totalPhenols=$totalPhenols, flavanoids=$flavanoids, " +
                "nonflavanoidPhenols=$nonflavanoidPhenols, proanthocyanins=$proanthocyanins, colorIntensity=$colorIntensity, " +
                "hue=$hue, dilutedWines=$dilutedWines, proline=$proline, status=$status)\n"
    }
}