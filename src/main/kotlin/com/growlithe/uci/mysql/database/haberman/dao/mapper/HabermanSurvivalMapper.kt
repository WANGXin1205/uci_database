package com.growlithe.uci.mysql.database.haberman.dao.mapper

import com.growlithe.uci.mysql.database.glass.dao.domain.GlassIdentificationDO
import com.growlithe.uci.mysql.database.haberman.dao.domain.HabermanSurvivalDO


interface HabermanSurvivalMapper {
    /**
     * 查询所有的 哈伯曼生存数据集
     *
     * @return
     */
    fun listAll(): List<HabermanSurvivalDO>
}