package com.growlithe.uci.mysql.database.wine.dao.mapper

import com.growlithe.uci.mysql.database.wine.dao.domain.WineDO


interface WineMapper {
    /**
     * 查询所有的 葡萄酒数据集
     *
     * @return
     */
    fun listAll(): List<WineDO>
}