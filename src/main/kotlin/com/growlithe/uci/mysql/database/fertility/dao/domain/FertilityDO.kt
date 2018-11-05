package com.growlithe.uci.mysql.database.fertility.dao.domain

import java.math.BigDecimal
/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 生育率数据集
 */
data class FertilityDO (
        /**
         * id 主键
         */
    var id: Int? = null,
        /**
         * 原因
         */
    var season: BigDecimal? = null,
        /**
         * 年龄
         */
    var age: BigDecimal? = null,
        /**
         * 幼年的疾病
         */
    var childishDiseases: Int? = null,
        /**
         * 事故
         */
    var accident: Int? = null,
        /**
         * 手术治疗
         */
    var surgical: Int? = null,
        /**
         * 大发烧
         */
    var highFevers: Int? = null,
        /**
         * 饮酒频率
         */
    var alcholFrequency: BigDecimal? = null,
        /**
         * 吸烟习惯
         */
    var smokingHabit: String? = null,
        /**
         * 每天坐数量 小时
         */
    var sitingNumber: BigDecimal? = null,
        /**
         * 类别
         */
    var className: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
    var status: Int? = null

) {
    override fun toString(): String {
        return "FertilityDO(id=$id, season=$season, age=$age, childishDiseases=$childishDiseases, accident=$accident, " +
                "surgical=$surgical, highFevers=$highFevers, alcholFrequency=$alcholFrequency, smokingHabit=$smokingHabit, " +
                "sitingNumber=$sitingNumber, className=$className, status=$status)\n"
    }
}