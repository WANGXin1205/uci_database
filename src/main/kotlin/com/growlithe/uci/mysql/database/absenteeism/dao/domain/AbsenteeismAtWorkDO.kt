package com.growlithe.uci.mysql.database.absenteeism.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午11:31
 * @Description 旷工数据集
 */
data class AbsenteeismAtWorkDO(
        /**
         * id 主键
         */
        var id: Long? = null,

        /**
         * 原始id
         */
        var originId: Int? = null,

        /**
         * 缺席原因
         */
        var reasonForAbsence: Int? = null,

        /**
         * 缺席月份
         */
        var monthOfAbsence: Int? = null,

        /**
         * 礼拜
         */
        var dayOfWeek: Int? = null,

        /**
         * 季节
         */
        var seasons: Int? = null,
        /**
         * 运输费用
         */
        var transportationExpense: Int? = null,
        /**
         * 从住宅到工作地的距离
         */
        var distanceFromResidenceToWork: Int? = null,
        /**
         * 服务时间
         */
        var serviceTime: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 平均日工作量
         */
        var workLoadAverageOfDay: Int? = null,
        /**
         * 命中目标
         */
        var hitTarget : Int? = null,
        /**
         * 纪律失败
         */
        var disciplinaryFailure : Int ? = null,
        /**
         * 教育
         */
        var education:Int ? = null,
        /**
         * 儿子
         */
        var son:Int ? =null,
        /**
         * 饮酒者
         */
        var socialDrinker:Int ? = null,
        /**
         * 吸烟者
         */
        var socialSmoker: Int ? = null,
        /**
         * 宠物
         */
        var pet:Int? =null,
        /**
         * 宽
         */
        var weight:Int ? = null,
        /**
         * 高
         */
        var height:Int ? = null,
        /**
         * 身体质量指数
         */
        var bodyMassIndex:Int ? = null,
        /**
         * 矿工时间
         */
        var	absenteeismTimeInHours :Int? = null,
        /**
         * 数据状态
         */
        var status:Int? = null


) {
    override fun toString(): String {
        return "AbsenteeismAtWorkDO(id=$id, originId=$originId, reasonForAbsence=$reasonForAbsence, " +
                "monthOfAbsence=$monthOfAbsence, dayOfWeek=$dayOfWeek, seasons=$seasons, " +
                "transportationExpense=$transportationExpense, distanceFromResidenceToWork=$distanceFromResidenceToWork," +
                "serviceTime=$serviceTime, age=$age, workLoadAverageOfDay=$workLoadAverageOfDay, hitTarget=$hitTarget," +
                "disciplinaryFailure=$disciplinaryFailure, education=$education, son=$son, socialDrinker=$socialDrinker, " +
                "socialSmoker=$socialSmoker, pet=$pet, weight=$weight, height=$height, bodyMassIndex=$bodyMassIndex, " +
                "absenteeismTimeInHours=$absenteeismTimeInHours, status=$status)\n"
    }
}