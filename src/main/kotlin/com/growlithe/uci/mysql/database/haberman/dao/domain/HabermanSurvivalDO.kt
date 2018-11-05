package com.growlithe.uci.mysql.database.haberman.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 哈伯曼生存数据集
 */
data class HabermanSurvivalDO(
        /**
         *  ID 主键
         */
        var id: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 病人年
         */
        var operationYear: Int? = null,
        /**
         * 检验结果
         */
        var positiveAxillaryNodesNumber: Int? = null,
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
        return "HabermanSurvivalDO(id=$id, age=$age, operationYear=$operationYear, positiveAxillaryNodesNumber=$positiveAxillaryNodesNumber, className=$className, status=$status)\n"
    }
}