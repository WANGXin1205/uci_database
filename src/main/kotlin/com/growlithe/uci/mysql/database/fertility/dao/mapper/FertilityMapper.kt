package com.growlithe.uci.mysql.database.fertility.dao.mapper

import com.growlithe.uci.mysql.database.ecoli.dao.domain.EcoliDO
import com.growlithe.uci.mysql.database.fertility.dao.domain.FertilityDO


interface FertilityMapper {
    /**
     * 查询所有的 生育率数据集
     *
     * @return
     */
    fun listAll(): List<FertilityDO>
}