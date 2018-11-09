package com.growlithe.uci.mysql.database.statloggerman.dao.mapper

import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO


interface StatlogGermanCreditMapper {
    /**
     * 查询所有的 德国的信贷数据集
     *
     * @return
     */
    fun listAll(): List<StatlogGermanCreditDO>
}