package com.growlithe.uci.mysql.database.hepatitis.dao.mapper

import com.growlithe.uci.mysql.database.hayes.dao.domain.HayesRothDO
import com.growlithe.uci.mysql.database.hepatitis.dao.domain.HepatitisDO

interface HepatitisMapper {
    /**
     * 查询所有的 肝炎数据集
     *
     * @return
     */
    fun listAll(): List<HepatitisDO>
}