package com.growlithe.uci.mysql.database.mammographic.dao.mapper

import com.growlithe.uci.mysql.database.mammographic.dao.domain.MammographicMassDO


interface MammographicMassMapper {
    /**
     * 查询所有的 神奇的伽马射线数据集
     *
     * @return
     */
    fun listAll(): List<MammographicMassDO>
}