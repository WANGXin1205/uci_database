package com.growlithe.uci.mysql.database.user.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 用户知识模型数据集
 */
data class UserKnowledgeModelingDO (
        /**
         * id 主键
         */
    var id: Int? = null,
        /**
         * 目标对象材料的研究时间的程度
         */
    var stg: BigDecimal? = null,
        /**
         * 对目标材料用户重复数度
         */
    var scg: BigDecimal? = null,
        /**
         * 目标对象相关对象的用户学习时间
         */
    var str: BigDecimal? = null,
        /**
         * 对目标对象相关的对象用户的考试成绩
         */
    var lpr: BigDecimal? = null,
        /**
         * 为目标对象的用户的考试成绩
         */
    var peg: BigDecimal? = null,
        /**
         * 用户的知识水平
         */
    var uns: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
    var status: Int? = null

) {
    override fun toString(): String {
        return "UserKnowledgeModelingDO(id=$id, stg=$stg, scg=$scg, str=$str, lpr=$lpr, peg=$peg, uns=$uns, status=$status)\n"
    }
}