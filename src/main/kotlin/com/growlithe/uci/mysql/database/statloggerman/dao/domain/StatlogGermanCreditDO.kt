package com.growlithe.uci.mysql.database.statloggerman.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  德国的信贷数据集
 */
data class StatlogGermanCreditDO(
        /**
         * id 主键
         */
        var id: Int? = null,

        var a: Int? = null,

        var b: Int? = null,

        var c: Int? = null,

        var d: Int? = null,

        var e: Int? = null,

        var f: Int? = null,

        var g: Int? = null,

        var h: Int? = null,

        var i: Int? = null,

        var j: Int? = null,

        var k: Int? = null,

        var l: Int? = null,

        var m: Int? = null,

        var n: Int? = null,

        var o: Int? = null,

        var p: Int? = null,

        var q: Int? = null,

        var r: Int? = null,

        var s: Int? = null,

        var t: Int? = null,

        var u: Int? = null,

        var v: Int? = null,

        var w: Int? = null,

        var x: Int? = null,
        /**
         * 类名称
         */
        var className: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "StatlogGermanCreditDO(id=$id, a=$a, b=$b, c=$c, d=$d, e=$e, f=$f, g=$g, h=$h, i=$i, j=$j, k=$k, l=$l, m=$m, " +
                "n=$n, o=$o, p=$p, q=$q, r=$r, s=$s, t=$t, u=$u, v=$v, w=$w, x=$x, className=$className, status=$status)\n"
    }
}