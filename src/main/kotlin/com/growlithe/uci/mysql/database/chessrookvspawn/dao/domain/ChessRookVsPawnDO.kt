package com.growlithe.uci.mysql.database.chessrookvspawn.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 国际象棋 rook vs pawn数据集
 */
data class ChessRookVsPawnDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 以下数据属性没有太大的实际意义
         */
        var stepAa: String? = null,

        var stepAb: String? = null,

        var stepAc: String? = null,

        var stepAd: String? = null,

        var stepAe: String? = null,

        var stepAf: String? = null,

        var stepAg: String? = null,

        var stepAh: String? = null,

        var stepAi: String? = null,

        var stepAj: String? = null,

        var stepAk: String? = null,

        var stepAl: String? = null,

        var stepAm: String? = null,

        var stepAn: String? = null,

        var stepAo: String? = null,

        var stepAp: String? = null,

        var stepAq: String? = null,

        var stepAr: String? = null,

        var stepAs: String? = null,

        var stepAt: String? = null,

        var stepAu: String? = null,

        var stepAv: String? = null,

        var stepAw: String? = null,

        var stepAx: String? = null,

        var stepAy: String? = null,

        var stepAz: String? = null,

        var stepBa: String? = null,

        var stepBb: String? = null,

        var stepBc: String? = null,

        var stepBd: String? = null,

        var stepBe: String? = null,

        var stepBf: String? = null,

        var stepBg: String? = null,

        var stepBh: String? = null,

        var stepBi: String? = null,

        var stepBj: String? = null,

        var className: String? = null,

        var status: Int? = null

) {
    override fun toString(): String {
        return "ChessRookVsPawnDO(id=$id, stepAa=$stepAa, stepAb=$stepAb, stepAc=$stepAc, stepAd=$stepAd, stepAe=$stepAe," +
                "stepAf=$stepAf, stepAg=$stepAg, stepAh=$stepAh, stepAi=$stepAi, stepAj=$stepAj, stepAk=$stepAk, stepAl=$stepAl," +
                "stepAm=$stepAm, stepAn=$stepAn, stepAo=$stepAo, stepAp=$stepAp, stepAq=$stepAq, stepAr=$stepAr, stepAs=$stepAs, " +
                "stepAt=$stepAt, stepAu=$stepAu, stepAv=$stepAv, stepAw=$stepAw, stepAx=$stepAx, stepAy=$stepAy, stepAz=$stepAz, " +
                "stepBa=$stepBa, stepBb=$stepBb, stepBc=$stepBc, stepBd=$stepBd, stepBe=$stepBe, stepBf=$stepBf, stepBg=$stepBg, " +
                "stepBh=$stepBh, stepBi=$stepBi, stepBj=$stepBj, className=$className, status=$status)\n"
    }
}