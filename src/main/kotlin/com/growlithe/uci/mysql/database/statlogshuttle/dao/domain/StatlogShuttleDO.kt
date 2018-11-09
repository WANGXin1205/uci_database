package com.growlithe.uci.mysql.database.statlogshuttle.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  航天飞机数据集
 */
data class StatlogShuttleDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 保密属性
         */
        var a: Int? = null,

        var b: Int? = null,

        var c: Int? = null,

        var d: Int? = null,

        var e: Int? = null,

        var f: Int? = null,

        var g: Int? = null,

        var h: Int? = null,

        var i: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         *  数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "StatlogShuttleDO(id=$id, a=$a, b=$b, c=$c, d=$d, e=$e, f=$f, g=$g, h=$h, i=$i, className=$className, " +
                "status=$status)\n"
    }
}