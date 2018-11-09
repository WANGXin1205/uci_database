package com.growlithe.uci.mysql.database.yeast.dao.mapper

import com.growlithe.uci.mysql.database.yeast.dao.domain.YeastDO


interface YeastMapper {
    /**
     * 查询所有的 酵母数据集
     *
     * @return
     */
    fun listAll(): List<YeastDO>
}