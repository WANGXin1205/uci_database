package com.growlithe.uci.mysql.database.hayes.dao.mapper

import com.growlithe.uci.mysql.database.haberman.dao.domain.HabermanSurvivalDO
import com.growlithe.uci.mysql.database.hayes.dao.domain.HayesRothDO


interface HayesRothMapper {
    /**
     * 查询所有的 海因斯罗斯数据集
     *
     * @return
     */
    fun listAll(): List<HayesRothDO>
}