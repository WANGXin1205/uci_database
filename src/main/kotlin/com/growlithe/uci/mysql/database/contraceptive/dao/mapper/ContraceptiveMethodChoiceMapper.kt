package com.growlithe.uci.mysql.database.contraceptive.dao.mapper

import com.growlithe.uci.mysql.database.connect.dao.domain.ConnectDO
import com.growlithe.uci.mysql.database.contraceptive.dao.domain.ContraceptiveMethodChoiceDO


interface ContraceptiveMethodChoiceMapper{
    /**
     * 查询所有的 避孕方法选择数据集
     *
     * @return
     */
    fun listAll(): List<ContraceptiveMethodChoiceDO>
}