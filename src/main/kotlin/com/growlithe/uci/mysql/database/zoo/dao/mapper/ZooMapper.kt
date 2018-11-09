package com.growlithe.uci.mysql.database.zoo.dao.mapper

import com.growlithe.uci.mysql.database.htru.dao.domain.HtruDO
import com.growlithe.uci.mysql.database.zoo.dao.domain.ZooDO

interface ZooMapper {
    /**
     * 查询所有的 动物园数据集
     *
     * @return
     */
    fun listAll(): List<ZooDO>
}