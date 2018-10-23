package com.growlithe.uci.mysql.database.adult.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/16 下午11:13
 * @Description 人口
 */
data class AdultDO(

        /**
         * id 主键
         */
        var id: Long? = null,

        /**
         * 年龄
         */
        var age: Int? = null,

        /**
         * 雇主的单位类型 存在缺失值
         */
        var workclass: String? = null,

        /**
         * 人口普查员的ID，可以考虑去除
         */
        var fnlwgt: Int? = null,

        /**
         * 教育程度 可以考虑去除
         */
        var education: String? = null,

        /**
         * 最高教育水平数字表示
         */
        var educationNum: Int? = null,

        /**
         * 婚姻状态
         */
        var maritalStatus: String? = null,

        /**
         * 工作类型 存在缺失值
         */
        var occupation: String? = null,

        /**
         * 家庭关系
         */
        var relationship: String? = null,

        /**
         * 种族
         */
        var race: String? = null,

        /**
         * 性别
         */
        var sex: String? = null,

        /**
         * 资本收益记录
         */
        var capitalGain: Int? = null,

        /**
         * 资本损失记录
         */
        var capitalLoss: Int? = null,

        /**
         * 一周工作时长
         */
        var hoursPerWeek: Int? = null,

        /**
         * 国籍 存在缺失值
         */
        var nativeCountry: String? = null,

        /**
         * 收入高低属性 存在缺失值
         */
        var incomeAttributes:String ? = null,

        /**
         * 数据类别 1 训练，2 检测  0 未定
         */
        var dataType:Int ? = null,

        /**
         * 数据状态
         */
        var status:Int? = null

) {
    override fun toString(): String {
        return "AdultDO(id=$id, age=$age, workclass=$workclass, fnlwgt=$fnlwgt, education=$education, educationNum=$educationNum, " +
                "maritalStatus=$maritalStatus, occupation=$occupation, relationship=$relationship, race=$race, sex=$sex," +
                " capitalGain=$capitalGain, capitalLoss=$capitalLoss, hoursPerWeek=$hoursPerWeek, nativeCountry=$nativeCountry, " +
                "incomeAttributes=$incomeAttributes, dataType=$dataType, status=$status)\n"
    }
}
