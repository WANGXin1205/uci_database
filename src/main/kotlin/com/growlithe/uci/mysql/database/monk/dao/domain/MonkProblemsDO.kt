package com.growlithe.uci.mysql.database.monk.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  修道士问题数据集
 */
data class MonkProblemsDO (
    /**
     * id 主键
     */
    var id: Int? = null,
    /**
     * 类名称
     */
    var className: Int? = null,
    /**
     * 以下属性没有特殊含义，只是标记
     */
    var aa: Int? = null,
    /**
     *
     */
    var ab: Int? = null,
    /**
     *
     */
    var ac: Int? = null,
    /**
     *
     */
    var ad: Int? = null,
    /**
     *
     */
    var ae: Int? = null,
    /**
     *
     */
    var af: Int? = null,
    /**
     * 数据有效性 1 有效 0 失效
     */
    var status: Int? = null

) {
    override fun toString(): String {
        return "MonkProblemsDO(id=$id, className=$className, aa=$aa, ab=$ab, ac=$ac, ad=$ad, ae=$ae, af=$af, status=$status)\n"
    }
}