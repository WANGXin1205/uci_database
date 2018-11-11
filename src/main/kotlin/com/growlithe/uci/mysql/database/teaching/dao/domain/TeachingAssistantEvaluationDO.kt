package com.growlithe.uci.mysql.database.teaching.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 教学辅助评价数据集
 */
class TeachingAssistantEvaluationDO {
    /**
     * id 主键
     */
    var id: Int? = null
    /**
     * 是否英语为母语
     */
    var nativeEnglishSpeaker: Int? = null
    /**
     * 课程讲师
     */
    var courseInstructor: Int? = null
    /**
     * 课程
     */
    var course: Int? = null
    /**
     * 学期
     */
    var semester: Int? = null
    /**
     * 班级大小
     */
    var classSize: Int? = null
    /**
     * 类别名称
     */
    var className: Int? = null
    /**
     * 数据状态
     */
    var status: Int? = null

    override fun toString(): String {
        return "TeachingAssistantEvaluationDO(id=$id, nativeEnglishSpeaker=$nativeEnglishSpeaker, courseInstructor=$courseInstructor, " +
                "course=$course, semester=$semester, classSize=$classSize, className=$className, status=$status)\n"
    }

}