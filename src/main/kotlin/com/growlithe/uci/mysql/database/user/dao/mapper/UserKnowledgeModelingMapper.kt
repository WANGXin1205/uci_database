package com.growlithe.uci.mysql.database.user.dao.mapper

import com.growlithe.uci.mysql.database.user.dao.domain.UserKnowledgeModelingDO
import com.growlithe.uci.mysql.database.wholesale.dao.domain.WholesaleCustomersDO


interface UserKnowledgeModelingMapper {

    /**
     * 查询所有的 用户知识模型数据集
     *
     * @return
     */
    fun listAll(): List<UserKnowledgeModelingDO>

}