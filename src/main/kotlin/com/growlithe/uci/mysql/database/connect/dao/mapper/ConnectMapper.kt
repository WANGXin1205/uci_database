package com.growlithe.uci.mysql.database.connect.dao.mapper

import com.growlithe.uci.mysql.database.congressional.dao.domain.CongressionalVotingRecordsDO
import com.growlithe.uci.mysql.database.connect.dao.domain.ConnectDO


interface ConnectMapper{
    /**
     * 查询所有的 连接数据集
     *
     * @return
     */
    fun listAll(): List<ConnectDO>
}