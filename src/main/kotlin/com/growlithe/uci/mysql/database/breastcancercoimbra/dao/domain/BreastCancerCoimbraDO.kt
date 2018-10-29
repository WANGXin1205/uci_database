package com.growlithe.uci.mysql.database.breastcancercoimbra.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 乳腺癌科英布拉数据集
 */
data class BreastCancerCoimbraDO (

     val id: Long? = null,

     val age: Int? = null,

     val bmi: BigDecimal? = null,

     val glucose: Int? = null,

     val insulin: BigDecimal? = null,

     val homa: BigDecimal? = null,

     val leptin: BigDecimal? = null,

     val adiponectin: BigDecimal? = null,

     val resistin: BigDecimal? = null,

     val mcp: BigDecimal? = null,

     val classification: Int? = null,

     val status: Int? = null


) {
    override fun toString(): String {
        return "BreastCancerCoimbraDO(id=$id, age=$age, bmi=$bmi, glucose=$glucose, insulin=$insulin, homa=$homa, " +
                "leptin=$leptin, adiponectin=$adiponectin, resistin=$resistin, mcp=$mcp, classification=$classification, status=$status)\n"
    }
}