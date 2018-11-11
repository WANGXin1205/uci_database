package com.growlithe.uci.mysql.database.winequalitywhite.dao.mapper

import com.growlithe.uci.mysql.database.wine.dao.domain.WineDO
import com.growlithe.uci.mysql.database.winequalitywhite.dao.domain.WineQualityWhiteDO


interface WineQualityWhiteMapper {
    /**
     * 查询所有的 白葡萄酒品质数据集
     *
     * @return
     */
    fun listAll(): List<WineQualityWhiteDO>
}