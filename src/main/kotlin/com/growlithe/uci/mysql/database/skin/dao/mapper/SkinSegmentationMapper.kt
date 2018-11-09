package com.growlithe.uci.mysql.database.skin.dao.mapper

import com.growlithe.uci.mysql.database.seeds.dao.domain.SeedsDO
import com.growlithe.uci.mysql.database.skin.dao.domain.SkinSegmentationDO


interface SkinSegmentationMapper {
    /**
     * 查询所有的 肤色分割数据集
     *
     * @return
     */
    fun listAll(): List<SkinSegmentationDO>
}