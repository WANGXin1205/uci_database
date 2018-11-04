package com.growlithe.uci.mysql.database.chessrookvspawn.dao.mapper

import com.growlithe.uci.mysql.database.chessrookvsking.dao.domain.ChessRookVsKingDO
import com.growlithe.uci.mysql.database.chessrookvspawn.dao.domain.ChessRookVsPawnDO


interface ChessRookVsPawnMapper{
    /**
     * 查询所有的 国际象棋rook vs pawn数据集
     *
     * @return
     */
    fun listAll(): List<ChessRookVsPawnDO>
}