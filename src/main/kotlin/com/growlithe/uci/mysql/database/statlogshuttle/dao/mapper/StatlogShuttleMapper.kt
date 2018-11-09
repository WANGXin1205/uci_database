package com.growlithe.uci.mysql.database.statlogshuttle.dao.mapper

import com.growlithe.uci.mysql.database.statloglandsat.dao.domain.StatlogLandsatSatelliteDO
import com.growlithe.uci.mysql.database.statlogshuttle.dao.domain.StatlogShuttleDO

interface StatlogShuttleMapper {
    /**
     * 查询所有的 航天飞机数据集
     *
     * @return
     */
    fun listAll(): List<StatlogShuttleDO>
}