package com.growlithe.uci.mysql.database.susy.dao.mapper

import com.growlithe.uci.mysql.database.susy.dao.domain.SusyDO
import com.growlithe.uci.mysql.database.tic.dao.domain.TicTacToeEndgameDO

interface SusyMapper {
    /**
     * 查询所有的 奇异粒子数据集
     *
     * @return
     */
    fun listAll(): List<SusyDO>
}