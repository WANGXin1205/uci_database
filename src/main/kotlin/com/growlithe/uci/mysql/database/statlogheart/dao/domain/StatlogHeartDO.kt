package com.growlithe.uci.mysql.database.statlogheart.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  心脏数据集
 */
data class StatlogHeartDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 性别
         */
        var sex: Int? = null,
        /**
         * 胸痛
         */
        var chestPainType: Int? = null,
        /**
         * 静脉血压
         */
        var restingBloodPressure: Int? = null,
        /**
         * 血清类固醇
         */
        var serum: Int? = null,
        /**
         * 血糖
         */
        var fastingBloodSugar: Int? = null,
        /**
         * 静息心电图结果
         */
        var restingElectrocardiographic: Int? = null,
        /**
         * 最大心率
         */
        var maximumHeartRate: Int? = null,
        /**
         * 心绞痛
         */
        var exercise: Int? = null,
        /**
         * 运动诱因
         */
        var oldpeak: BigDecimal? = null,
        /**
         * ST段的斜率
         */
        var peakExercise: Int? = null,
        /**
         * 主要血管数
         */
        var majorVessels: Int? = null,
        /**
         * 患者
         */
        var thal: Int? = null,
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
        return "StatlogHeartDO(id=$id, age=$age, sex=$sex, chestPainType=$chestPainType, restingBloodPressure=$restingBloodPressure, " +
                "serum=$serum, fastingBloodSugar=$fastingBloodSugar, restingElectrocardiographic=$restingElectrocardiographic, " +
                "maximumHeartRate=$maximumHeartRate, exercise=$exercise, oldpeak=$oldpeak, peakExercise=$peakExercise, " +
                "majorVessels=$majorVessels, thal=$thal, className=$className, status=$status)\n"
    }
}