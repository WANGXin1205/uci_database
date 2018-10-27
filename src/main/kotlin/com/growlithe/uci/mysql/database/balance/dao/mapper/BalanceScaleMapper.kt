package com.growlithe.uci.mysql.database.balance.dao.mapper

import com.growlithe.uci.mysql.database.avila.dao.domain.AvliaDO
import com.growlithe.uci.mysql.database.balance.dao.domain.BalanceScaleDO

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
interface BalanceScaleMapper {

    /**
     * 查询所有的 平衡量表数据集数据
     *
     * @return
     */
    fun listAll(): List<BalanceScaleDO>

}
