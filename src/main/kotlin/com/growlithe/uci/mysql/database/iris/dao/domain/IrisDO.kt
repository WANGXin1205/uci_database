package com.growlithe.uci.mysql.database.iris.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 鸢尾花数据集
 */
data class IrisDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 萼片长度
         */
        var sepalLength: BigDecimal? = null,
        /**
         * 萼片宽度
         */
        var sepalWidth: BigDecimal? = null,
        /**
         * 花瓣长度
         */
        var petalLength: BigDecimal? = null,
        /**
         * 花瓣宽度
         */
        var petalWidth: BigDecimal? = null,
        /**
         * 类别名称
         */
        var className: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "IrisDO(id=$id, sepalLength=$sepalLength, sepalWidth=$sepalWidth, petalLength=$petalLength, petalWidth=$petalWidth, className=$className, status=$status)\n"
    }
}