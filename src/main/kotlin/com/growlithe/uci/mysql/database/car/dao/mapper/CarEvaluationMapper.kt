package com.growlithe.uci.mysql.database.car.dao.mapper

import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO


interface CarEvaluationMapper{
    /**
     * 查询所有的 汽车评估数据集
     *
     * @return
     */
    fun listAll(): List<CarEvaluationDO>
}