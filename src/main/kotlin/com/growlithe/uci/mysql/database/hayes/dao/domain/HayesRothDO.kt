package com.growlithe.uci.mysql.database.hayes.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 海因斯罗斯数据集
 */
data class HayesRothDO (
    /**
     * id 主键
     */
    var id: Int? = null,
    /**
     * 名称
     */
    var name: Int? = null,
    /**
     * 爱好
     */
    var hobby: Int? = null,
    /**
     * 年龄
     */
    var age: Int? = null,
    /**
     * 教育水平
     */
    var educationalLevel: Int? = null,
    /**
     * 婚姻状态
     */
    var maritalStatus: Int? = null,
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
        return "HayesRothDO(id=$id, name=$name, hobby=$hobby, age=$age, educationalLevel=$educationalLevel, " +
                "maritalStatus=$maritalStatus, className=$className, status=$status)\n"
    }
}