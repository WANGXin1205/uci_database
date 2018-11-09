package com.growlithe.uci.mysql.database.statloglandsat.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  陆地卫星数据集
 */
data class StatlogLandsatSatelliteDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 属性保密
         */
        var aa: Int? = null,

        var ab: Int? = null,

        var ac: Int? = null,

        var ad: Int? = null,

        var ae: Int? = null,

        var af: Int? = null,

        var ba: Int? = null,

        var bb: Int? = null,

        var bc: Int? = null,

        var bd: Int? = null,

        var be: Int? = null,

        var bf: Int? = null,

        var ca: Int? = null,

        var cb: Int? = null,

        var cc: Int? = null,

        var cd: Int? = null,

        var ce: Int? = null,

        var cf: Int? = null,

        var da: Int? = null,

        var db: Int? = null,

        var dc: Int? = null,

        var dd: Int? = null,

        var de: Int? = null,

        var df: Int? = null,

        var ea: Int? = null,

        var eb: Int? = null,

        var ec: Int? = null,

        var ed: Int? = null,

        var ee: Int? = null,

        var ef: Int? = null,

        var fa: Int? = null,

        var fb: Int? = null,

        var fc: Int? = null,

        var fd: Int? = null,

        var fe: Int? = null,

        var ff: Int? = null,
        /**
         * 类别名称
         */
        var className: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "StatlogLandsatSatelliteDO(id=$id, aa=$aa, ab=$ab, ac=$ac, ad=$ad, ae=$ae, af=$af, ba=$ba, bb=$bb, bc=$bc, " +
                "bd=$bd, be=$be, bf=$bf, ca=$ca, cb=$cb, cc=$cc, cd=$cd, ce=$ce, cf=$cf, da=$da, db=$db, dc=$dc, dd=$dd, " +
                "de=$de, df=$df, ea=$ea, eb=$eb, ec=$ec, ed=$ed, ee=$ee, ef=$ef, fa=$fa, fb=$fb, fc=$fc, fd=$fd, fe=$fe, " +
                "ff=$ff, className=$className, status=$status)\n"
    }
}