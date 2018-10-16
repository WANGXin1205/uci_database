package com.growlithe.uci.mysql.excel.utils

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午8:07
 * @Description
 */
object ExcelDataConfigure{

    /**
     * 默认工作表
     */
    val DEFAULT_SHEET = 0
    /**
     * 默认开始行
     */
    val DEFAULT_BEGIN_ROW_INDEX = 0

    /**
     * 鲍鱼数据集 名称
     */
    val ABALONE_DATA_NAME = arrayOf("sex","length","diameter","height","wholeWeight",
            "shuckedWeight","visceraWeight","shellWeight","rings")
    /**
     * 鲍鱼数据集 方法
     */
    val ABALONE_DATA_METHOD = arrayOf("getSex","getLength","getDiameter","getHeight",
            "getWholeWeight", "getShuckedWeight","getVisceraWeight","getShellWeight","getRings")
    /**
     * 鲍鱼数据集 性别位置
     */
    val ABALONE_DATA_SEX_INDEX = 0
    /**
     * 鲍鱼数据集 长度位置
     */
    val ABALONE_DATA_LENGTH_INDEX = 1
    /**
     * 鲍鱼数据集 直径位置
     */
    val ABALONE_DATA_DIAMETER_INDEX = 2
    /**
     * 鲍鱼数据集 高度位置
     */
    val ABALONE_DATA_HEIGHT_INDEX = 3
    /**
     * 鲍鱼数据集 全重位置
     */
    val ABALONE_DATA_WHOLE_WEIGHT_INDEX = 4
    /**
     * 鲍鱼数据集 去壳重量位置
     */
    val ABALONE_DATA_SHUCKED_WEIGHT_INDEX = 5
    /**
     * 鲍鱼数据集 内脏重量位置
     */
    val ABALONE_DATA_VISCERA_WEIGHT_INDEX = 6
    /**
     * 鲍鱼数据集 壳重位置
     */
    val ABALONE_DATA_SHELL_WEIGHT_INDEX = 7
    /**
     * 鲍鱼数据集 年龄年份位置
     */
    val ABALONE_DATA_RINGS_INDEX = 8


    /**
     * 旷工数据集 名称
     */
    val ABSENTEEISM_DATA_NAME = arrayOf("id","originId","reasonForAbsence","monthOfAbsence",
            "dayOfWeek","seasons","transportationExpense","distanceFromResidenceToWork","serviceTime",
            "age","workLoadAverageOfDay","hitTarget","disciplinaryFailure","education","son",
            "socialDrinker","socialSmoker","pet","weight","height","bodyMassIndex","absenteeismTimeInHours")
    /**
     * 旷工数据集 方法
     */
    val ABSENTEEISM_DATA_METHOD = arrayOf("getId","getOriginId","getReasonForAbsence","getMonthOfAbsence",
            "getDayOfWeek","getSeasons","getTransportationExpense","getDistanceFromResidenceToWork","getServiceTime",
            "getAge","getWorkLoadAverageOfDay","getHitTarget","getDisciplinaryFailure","getEducation","getSon",
            "getSocialDrinker","getSocialSmoker","getPet","getWeight","getHeight","getBodyMassIndex","getAbsenteeismTimeInHours")

    /**
     * 旷工数据集 原始id
     */
    val ABSENTEEISM_ORIGIN_ID_INDEX = 0

    /**
     * 旷工数据集 缺席原因
     */
    val ABSENTEEISM_REASON_FOR_ABSENCE_INDEX = 1

    /**
     * 旷工数据集 缺席月份
     */
    val ABSENTEEISM_MONTH_OF_ABSENCE_INDEX = 2

    /**
     * 旷工数据集 礼拜
     */
    val ABSENTEEISM_DAY_OF_WEEK_INDEX = 3

    /**
     * 旷工数据集 季节
     */
    val ABSENTEEISM_SEASONS_INDEX = 4

    /**
     * 旷工数据集 运输费用
     */
    val ABSENTEEISM_TRANSPORTATION_EXPENSE_INDEX = 5

    /**
     * 旷工数据集 从住宅到工作地的距离
     */
    val ABSENTEEISM_DISTANCE_FROM_RESIDENCE_TO_WORK_INDEX = 6

    /**
     * 旷工数据集 服务时间
     */
    val ABSENTEEISM_SERVICE_TIME_INDEX = 7

    /**
     * 旷工数据集 年龄
     */
    val ABSENTEEISM_AGE_INDEX = 8

    /**
     * 旷工数据集 平均日工作量
     */
    val ABSENTEEISM_WORK_LOAD_AVERAGE_OF_DAY_INDEX = 9

    /**
     * 旷工数据集 命中目标
     */
    val ABSENTEEISM_HITTARGET_INDEX = 10

    /**
     * 旷工数据集 纪律失败
     */
    val ABSENTEEISM_DISCIPLINARY_FAILURE_INDEX = 11

    /**
     * 旷工数据集 教育
     */
    val ABSENTEEISM_EDUCATION_INDEX = 12


    /**
     * 旷工数据集 儿子
     */
    val ABSENTEEISM_SON_INDEX = 13


    /**
     * 旷工数据集 饮酒者
     */
    val ABSENTEEISM_SOCIAL_DRINKER_INDEX = 14


    /**
     * 旷工数据集 吸烟者
     */
    val ABSENTEEISM_SOCIAL_SOMKER_INDEX = 15


    /**
     * 旷工数据集 宠物
     */
    val ABSENTEEISM_PET_INDEX = 16


    /**
     * 旷工数据集 宽
     */
    val ABSENTEEISM_WEIGHT_INDEX = 17


    /**
     * 旷工数据集 高
     */
    val ABSENTEEISM_HEIGHT_INDEX = 18


    /**
     * 旷工数据集 身体质量指数
     */
    val ABSENTEEISM_BODY_MASS_INDEX_INDEX = 19


    /**
     * 旷工数据集 矿工时间
     */
    val ABSENTEEISM_TIME_IN_HOURS_INDEX = 20

}
