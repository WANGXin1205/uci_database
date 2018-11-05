package com.growlithe.uci.mysql.database.glass.dao.mapper

import com.growlithe.uci.mysql.database.fertility.dao.domain.FertilityDO
import com.growlithe.uci.mysql.database.glass.dao.domain.GlassIdentificationDO


interface GlassIdentificationMapper{
    /**
     * 查询所有的 玻璃识别数据集
     *
     * @return
     */
    fun listAll(): List<GlassIdentificationDO>
}