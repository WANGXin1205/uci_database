package com.growlithe.uci.mysql.database.skin.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  肤色分割数据集
 */
data class SkinSegmentationDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * b
         */
        var b: Int? = null,
        /**
         * g
         */
        var g: Int? = null,
        /**
         * r
         */
        var r: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "SkinSegmentationDO(id=$id, b=$b, g=$g, r=$r, className=$className, status=$status)\n"
    }
}