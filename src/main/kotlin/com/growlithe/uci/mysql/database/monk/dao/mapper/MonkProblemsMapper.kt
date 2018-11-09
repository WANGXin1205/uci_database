package com.growlithe.uci.mysql.database.monk.dao.mapper

import com.growlithe.uci.mysql.database.mammographic.dao.domain.MammographicMassDO
import com.growlithe.uci.mysql.database.monk.dao.domain.MonkProblemsDO


interface MonkProblemsMapper {
    /**
     * 查询所有的 修道士问题数据集
     *
     * @return
     */
    fun listAll(): List<MonkProblemsDO>
}