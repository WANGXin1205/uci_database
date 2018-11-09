package com.growlithe.uci.mysql.database.seeds.dao.mapper

import com.growlithe.uci.mysql.database.record.dao.domain.RecordLinkageComparisonPatternsDO
import com.growlithe.uci.mysql.database.seeds.dao.domain.SeedsDO


interface SeedsMapper {
    /**
     * 查询所有的 种子数据集
     *
     * @return
     */
    fun listAll(): List<SeedsDO>
}