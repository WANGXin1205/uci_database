package com.growlithe.uci.mysql.database.abalone.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 上午10:50
 * @Description 鲍鱼数据集
 */
data class AbaloneDO(

    /**
     * id 主键
     */
    var id: Int? = null,

    /**
     * 性别 M，F和I（婴儿）
     */
    var sex: String? = null,

    /**
     * 长度 最长外壳尺寸
     */
    var length: BigDecimal? = null,

    /**
     * 直径 垂直长度
     */
    var diameter: BigDecimal? = null,

    /**
     * 高度 带壳内的肉
     */
    var height: BigDecimal? = null,

    /**
     * 全重 整个鲍鱼
     */
    var wholeWeight: BigDecimal? = null,

    /**
     * 去壳重量 重量肉
     */
    var shuckedWeight: BigDecimal? = null,

    /**
     * 内脏重量 肠重量（出血后）
     */
    var visceraWeight: BigDecimal? = null,

    /**
     * 壳重 干燥后
     */
    var shellWeight: BigDecimal? = null,

    /**
     * 年龄年份
     */
    var rings: Int? = null,

    /**
     * 数据状态
     */
    var status:Int? = null


) {
    override fun toString(): String {
        return "AbaloneDO(id=$id, sex=$sex, length=$length, diameter=$diameter, height=$height, wholeWeight=$wholeWeight, shuckedWeight=$shuckedWeight, visceraWeight=$visceraWeight, shellWeight=$shellWeight, rings=$rings, status=$status)\n"
    }
}
