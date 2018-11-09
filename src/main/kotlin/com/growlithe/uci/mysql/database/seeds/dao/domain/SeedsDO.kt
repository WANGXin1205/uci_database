package com.growlithe.uci.mysql.database.seeds.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  种子数据集
 */
data class SeedsDO (
        /**
         * id 主键
         */
    var id: Int? = null,
        /**
         * 区域
         */
    var area: BigDecimal? = null,
        /**
         * 周长
         */
    var perimeter: BigDecimal? = null,
        /**
         * 压实度
         */
    var compactness: BigDecimal? = null,
        /**
         * 核的长
         */
    var lengthOfKernel: BigDecimal? = null,
        /**
         * 核的宽
         */
    var widthOfKernel: BigDecimal? = null,
        /**
         * 不对称系数
         */
    var asymmetryCoefficient: BigDecimal? = null,
        /**
         * 核槽长度
         */
    var lengthOfKernelGroove: BigDecimal? = null,
        /**
         * 类别
         */
    var className: Int? = null,
        /**
         * 数据有效 1 有效 0 无效
         */
    var status: Int? = null


) {
    override fun toString(): String {
        return "SeedsDO(id=$id, area=$area, perimeter=$perimeter, compactness=$compactness, lengthOfKernel=$lengthOfKernel, " +
                "widthOfKernel=$widthOfKernel, asymmetryCoefficient=$asymmetryCoefficient, lengthOfKernelGroove=$lengthOfKernelGroove, " +
                "className=$className, status=$status)\n"
    }
}