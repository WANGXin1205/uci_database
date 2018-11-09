package com.growlithe.uci.mysql.database.poker.dao.mapper

import com.growlithe.uci.mysql.database.page.dao.domain.PageBlocksDO
import com.growlithe.uci.mysql.database.poker.dao.domain.PokeHandDO


interface PokeHandMapper {
    /**
     * 查询所有的 扑克数据集
     *
     * @return
     */
    fun listAll(): List<PokeHandDO>
}