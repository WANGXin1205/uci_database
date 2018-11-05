package com.growlithe.uci.mysql.database.covertype.dao.mapper

import com.growlithe.uci.mysql.database.connect.dao.domain.ConnectDO
import com.growlithe.uci.mysql.database.covertype.dao.domain.CovertypeDO


interface CovertypeMapper{
    /**
     * 查询所有的 植被覆盖数据集
     *
     * @return
     */
    fun listAll(): List<CovertypeDO>
}