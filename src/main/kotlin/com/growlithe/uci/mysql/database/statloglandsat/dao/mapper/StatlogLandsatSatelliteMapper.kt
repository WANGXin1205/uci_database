package com.growlithe.uci.mysql.database.statloglandsat.dao.mapper

import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO
import com.growlithe.uci.mysql.database.statloglandsat.dao.domain.StatlogLandsatSatelliteDO


interface StatlogLandsatSatelliteMapper {
    /**
     * 查询所有的 陆地卫星数据集
     *
     * @return
     */
    fun listAll(): List<StatlogLandsatSatelliteDO>
}