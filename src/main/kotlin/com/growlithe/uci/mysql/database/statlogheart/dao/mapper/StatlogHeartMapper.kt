package com.growlithe.uci.mysql.database.statlogheart.dao.mapper

import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO


interface StatlogHeartMapper {
    /**
     * 查询所有的 心脏数据集
     *
     * @return
     */
    fun listAll(): List<StatlogHeartDO>
}