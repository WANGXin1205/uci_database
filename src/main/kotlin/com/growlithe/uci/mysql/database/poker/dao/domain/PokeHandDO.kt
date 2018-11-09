package com.growlithe.uci.mysql.database.poker.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  扑克数据集
 */
data class PokeHandDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 下列属性没有实际意义
         */
        var sa: Int? = null,
        /**
         *
         */
        var ca: Int? = null,
        /**
         *
         */
        var sb: Int? = null,
        /**
         *
         */
        var cb: Int? = null,
        /**
         *
         */
        var sc: Int? = null,
        /**
         *
         */
        var cc: Int? = null,
        /**
         *
         */
        var sd: Int? = null,
        /**
         *
         */
        var cd: Int? = null,
        /**
         *
         */
        var se: Int? = null,
        /**
         *
         */
        var ce: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据有效性 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "PokeHandDO(id=$id, sa=$sa, ca=$ca, sb=$sb, cb=$cb, sc=$sc, cc=$cc, sd=$sd, cd=$cd, se=$se, ce=$ce, " +
                "className=$className, status=$status)\n"
    }
}