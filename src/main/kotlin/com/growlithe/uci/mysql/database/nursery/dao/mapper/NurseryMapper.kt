package com.growlithe.uci.mysql.database.nursery.dao.mapper

import com.growlithe.uci.mysql.database.mushroom.dao.domain.MushroomDO
import com.growlithe.uci.mysql.database.nursery.dao.domain.NurseryDO

interface NurseryMapper {
    /**
     * 查询所有的 幼儿园数据集
     *
     * @return
     */
    fun listAll(): List<NurseryDO>
}