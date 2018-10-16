/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      SheetBean.java
 * 类名:        SheetBean
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package com.growlithe.uci.common.bean

import java.io.Serializable
import java.util.Arrays

/**
 * 类名:		SheetBean
 * 描述:		Excel sheet（支持excel多表显示bean）
 * @author    shuangdai
 */
class SheetBean
/**
 * SheetBean构造函数
 *
 * @param sheetName
 * @param beginRowIndex
 * @param beginColIndex
 * @param vals
 */
(var sheetName: String?, var beginRowIndex: Int, var beginColIndex: Int, vals: Array<Array<String>>?) : Serializable {

    private var vals: Array<Array<String>>? = null

    init {
        this.vals = if (vals != null) Arrays.copyOf(vals, vals.size) else null
    }

    fun getVals(): Array<Array<String>>? {
        return vals
    }

    fun setVals(vals: Array<Array<String>>?) {
        this.vals = if (vals != null) Arrays.copyOf(vals, vals.size) else null
    }

    companion object {

        private const val serialVersionUID = 1L
    }

}
