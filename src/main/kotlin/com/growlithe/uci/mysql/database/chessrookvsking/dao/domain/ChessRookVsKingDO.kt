package com.growlithe.uci.mysql.database.chessrookvsking.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 国际象棋 rook vs king数据集
 */
data class ChessRookVsKingDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 以下属性没有太大的实际意义
         */
        var whiteKingFile: String? = null,

        var whiteKingRank: Int? = null,

        var whiteRookFile: String? = null,

        var whiteRookRank: Int? = null,

        var blackKingFile: String? = null,

        var blackKingRank: Int? = null,

        var className: String? = null,

        var status: Int? = null

) {
    override fun toString(): String {
        return "ChessRookVsKingDO(id=$id, whiteKingFile=$whiteKingFile, whiteKingRank=$whiteKingRank, " +
                "whiteRookFile=$whiteRookFile, whiteRookRank=$whiteRookRank, blackKingFile=$blackKingFile, " +
                "blackKingRank=$blackKingRank, className=$className, status=$status)\n"
    }
}