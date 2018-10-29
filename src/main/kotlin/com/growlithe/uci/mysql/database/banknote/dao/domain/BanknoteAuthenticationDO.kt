package com.growlithe.uci.mysql.database.banknote.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 钞票认证数据集数据
 */
data class BanknoteAuthenticationDO (
    /**
     * 主键id
     */
    var id: Long? = null,
    /**
     * 小波变换图像的变化（连续）
     */
    var variance: BigDecimal? = null,
    /**
     * 小波的偏斜变换图像（连续）
     */
    var skewness: BigDecimal? = null,
    /**
     * 小波的变形图像（连续）
     */
    var curtosis: BigDecimal? = null,
    /**
     * 图像的熵（连续）
     */
    var entropy: BigDecimal? = null,
    /**
     * 分类数 0 1
     */
    var className: Int? = null,
    /**
     * 状态 1 有效 0 失效
     */
    var status: Int? = null

) {
    override fun toString(): String {
        return "BanknoteAuthenticationDO(id=$id, variance=$variance, skewness=$skewness, curtosis=$curtosis, entropy=$entropy, className=$className, status=$status)\n"
    }
}