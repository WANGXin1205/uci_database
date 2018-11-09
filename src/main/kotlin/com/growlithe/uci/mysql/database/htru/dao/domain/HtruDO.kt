package com.growlithe.uci.mysql.database.htru.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 脉冲星数据集
 */
data class HtruDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 综合剖面平均值
         */
        var integratedProfileMean: BigDecimal? = null,
        /**
         * 综合剖面的标准偏差
         */
        var integratedProfileStandardDeviation: BigDecimal? = null,
        /**
         * 轮廓尖峰
         */
        var integratedProfileExcessKurtosis: BigDecimal? = null,
        /**
         * 分布偏度
         */
        var integratedProfileSkewness: BigDecimal? = null,
        /**
         * dm-snr曲线平均值
         */
        var curveMean: BigDecimal? = null,
        /**
         * dm-snr曲线的标准偏差
         */
        var curveStandardDeviation: BigDecimal? = null,
        /**
         * dm-snr曲线的峰度
         */
        var curveExcessKurtosis: BigDecimal? = null,
        /**
         * dm-snr曲线的斜度
         */
        var curveSkewness: BigDecimal? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null
)