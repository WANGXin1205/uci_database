package com.growlithe.uci.mysql.database.record.dao.mapper

import com.growlithe.uci.mysql.database.primary.dao.domain.PrimaryTumorDO
import com.growlithe.uci.mysql.database.record.dao.domain.RecordLinkageComparisonPatternsDO


interface RecordLinkageComparisonPatternsMapper {
    /**
     * 查询所有的 记录比较模式数据集
     *
     * @return
     */
    fun listAll(): List<RecordLinkageComparisonPatternsDO>
}