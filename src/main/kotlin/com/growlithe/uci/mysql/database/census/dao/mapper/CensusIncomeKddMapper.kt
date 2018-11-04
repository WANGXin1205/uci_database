package com.growlithe.uci.mysql.database.census.dao.mapper

import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO
import com.growlithe.uci.mysql.database.census.dao.domain.CensusIncomeKddDO


interface CensusIncomeKddMapper{
    /**
     * 查询所有的 汽车评估数据集
     *
     * @return
     */
    fun listAll(): List<CensusIncomeKddDO>
}