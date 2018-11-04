package com.growlithe.uci.mysql.database.chessrookvsking.dao.mapper

import com.growlithe.uci.mysql.database.chessrookvsking.dao.domain.ChessRookVsKingDO


interface ChessRookVsKingMapper{
    /**
     * 查询所有的 国际象棋rook vs king数据集
     *
     * @return
     */
    fun listAll(): List<ChessRookVsKingDO>
}