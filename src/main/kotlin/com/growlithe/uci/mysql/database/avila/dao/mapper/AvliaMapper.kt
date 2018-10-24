package com.growlithe.uci.mysql.database.avila.dao.mapper

import com.growlithe.uci.mysql.database.avila.dao.domain.AvliaDO

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
interface AvliaMapper {

    /**
     * 查询所有的 阿维拉数据集数据
     *
     * @return
     */
    fun listAll(): List<AvliaDO>

}
