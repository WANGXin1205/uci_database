package com.growlithe.uci.mysql.database.statlogaustralian.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  信贷审批数据集
 */
data class StatlogAustralianCreditApprovalDO (
    /**
     * id 主键
     */
    var id: Int? = null,
    /**
     * 以下属性没有实际意义
     */
    var aa: Int? = null,

    var ab: BigDecimal? = null,

    var ac: BigDecimal? = null,

    var ad: Int? = null,

    var ae: Int? = null,

    var af: Int? = null,

    var ag: BigDecimal? = null,

    var ah: Int? = null,

    var ai: Int? = null,

    var aj: Int? = null,

    var ak: Int? = null,

    var al: Int? = null,

    var am: Int? = null,

    var an: Int? = null,
    /**
     * 类别
     */
    var className: Int? = null,
    /**
     * 状态
     */
    var status: Int? = null
)