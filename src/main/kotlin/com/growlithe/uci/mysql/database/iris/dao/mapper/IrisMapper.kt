package com.growlithe.uci.mysql.database.iris.dao.mapper

import com.growlithe.uci.mysql.database.htru.dao.domain.HtruDO
import com.growlithe.uci.mysql.database.iris.dao.domain.IrisDO


interface IrisMapper {
    /**
     * 查询所有的 鸢尾花数据集
     *
     * @return
     */
    fun listAll(): List<IrisDO>
}