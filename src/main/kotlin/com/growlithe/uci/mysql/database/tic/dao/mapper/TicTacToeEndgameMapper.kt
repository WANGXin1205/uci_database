package com.growlithe.uci.mysql.database.tic.dao.mapper

import com.growlithe.uci.mysql.database.tic.dao.domain.TicTacToeEndgameDO
import com.growlithe.uci.mysql.database.user.dao.domain.UserKnowledgeModelingDO


interface TicTacToeEndgameMapper{
    /**
     * 查询所有的 残局数据集
     *
     * @return
     */
    fun listAll(): List<TicTacToeEndgameDO>

}
