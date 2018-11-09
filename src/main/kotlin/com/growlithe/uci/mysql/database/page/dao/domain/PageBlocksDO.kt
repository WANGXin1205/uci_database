package com.growlithe.uci.mysql.database.page.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  页面模块分类数据集
 */
data class PageBlocksDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 高度
         */
        var height: Int? = null,
        /**
         * 长度
         */
        var lenght: Int? = null,
        /**
         * 面积
         */
        var area: Int? = null,
        /**
         * 偏心距
         */
        var eccen: BigDecimal? = null,
        /**
         * pBlack
         */
        var pBlack: BigDecimal? = null,
        /**
         * pAnd
         */
        var pAnd: BigDecimal? = null,
        /**
         * meanTr
         */
        var meanTr: BigDecimal? = null,
        /**
         * blackpix
         */
        var blackpix: Int? = null,
        /**
         * 黑色
         */
        var blackand: Int? = null,
        /**
         * wbTrans
         */
        var wbTrans: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据类型 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "PageBlocksDO(id=$id, height=$height, lenght=$lenght, area=$area, eccen=$eccen, pBlack=$pBlack, pAnd=$pAnd, " +
                "meanTr=$meanTr, blackpix=$blackpix, blackand=$blackand, wbTrans=$wbTrans, className=$className, status=$status)\n"
    }
}