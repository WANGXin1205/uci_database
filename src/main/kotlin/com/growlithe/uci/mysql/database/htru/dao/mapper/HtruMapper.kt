package com.growlithe.uci.mysql.database.htru.dao.mapper

import com.growlithe.uci.mysql.database.hepatitis.dao.domain.HepatitisDO
import com.growlithe.uci.mysql.database.htru.dao.domain.HtruDO


interface HtruMapper {
    /**
     * 查询所有的 脉冲星数据集
     *
     * @return
     */
    fun listAll(): List<HtruDO>
}