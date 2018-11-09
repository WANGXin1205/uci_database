package com.growlithe.uci.mysql.database.occupancy.dao.mapper


import com.growlithe.uci.mysql.database.occupancy.dao.domain.OccupancyDO


interface OccupancyMapper {
    /**
     * 查询所有的 居住率数据集
     *
     * @return
     */
    fun listAll(): List<OccupancyDO>
}