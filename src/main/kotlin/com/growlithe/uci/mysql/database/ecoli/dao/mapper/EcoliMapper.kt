package com.growlithe.uci.mysql.database.ecoli.dao.mapper

import com.growlithe.uci.mysql.database.defaultcredit.dao.domain.DefaultOfCreditCardClientsDO
import com.growlithe.uci.mysql.database.ecoli.dao.domain.EcoliDO


interface EcoliMapper {
    /**
     * 查询所有的 大肠杆菌数据集
     *
     * @return
     */
    fun listAll(): List<EcoliDO>
}