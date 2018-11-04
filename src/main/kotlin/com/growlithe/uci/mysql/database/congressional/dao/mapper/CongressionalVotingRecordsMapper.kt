package com.growlithe.uci.mysql.database.congressional.dao.mapper

import com.growlithe.uci.mysql.database.congressional.dao.domain.CongressionalVotingRecordsDO


interface CongressionalVotingRecordsMapper{
    /**
     * 查询所有的 国会投票记录数据集
     *
     * @return
     */
    fun listAll(): List<CongressionalVotingRecordsDO>
}