package com.growlithe.uci.mysql.database.tic.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description Tic Tac Toe残局数据集
 */
data class TicTacToeEndgameDO (
    /**
     * id 主键
     */
    var id: Int? = null,
    /**
     * 位置 坐标 11 下同
     */
    var aA: String? = null,

    var aB: String? = null,

    var aC: String? = null,

    var bA: String? = null,

    var bB: String? = null,

    var bC: String? = null,

    var cA: String? = null,

    var cB: String? = null,

    var cC: String? = null,
    /**
     * 类别
     */
    var className: String? = null,
    /**
     * 数据状态 1 有效 0 失效
     */
    var status: Int? = null

) {
    override fun toString(): String {
        return "TicTacToeEndgameDO(id=$id, aA=$aA, aB=$aB, aC=$aC, bA=$bA, bB=$bB, bC=$bC, cA=$cA, cB=$cB, cC=$cC, " +
                "className=$className, status=$status)\n"
    }
}