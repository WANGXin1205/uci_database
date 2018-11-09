package com.growlithe.uci.mysql.database.mushroom.dao.mapper

import com.growlithe.uci.mysql.database.monk.dao.domain.MonkProblemsDO
import com.growlithe.uci.mysql.database.mushroom.dao.domain.MushroomDO


interface MushroomMapper {
    /**
     * 查询所有的 蘑菇数据集
     *
     * @return
     */
    fun listAll(): List<MushroomDO>
}