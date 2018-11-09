package com.growlithe.uci.mysql.database.page.dao.mapper

import com.growlithe.uci.mysql.database.occupancy.dao.domain.OccupancyDO
import com.growlithe.uci.mysql.database.page.dao.domain.PageBlocksDO


interface PageBlocksMapper {
    /**
     * 查询所有的 页面模块分类数据集
     *
     * @return
     */
    fun listAll(): List<PageBlocksDO>
}