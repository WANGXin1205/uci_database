package com.growlithe.uci.mysql.database.record.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  记录比较模式数据集
 */
data class RecordLinkageComparisonPatternsDO (
        /**
         * id 主键
         */
    var id: Long? = null,
        /**
         * 第一个记录标识符
         */
    var idA: Int? = null,
        /**
         * 第二个记录标识符
         */
    var idB: Int? = null,
        /**
         * 自己 姓
         */
    var cmpFnameCa: Int? = null,
        /**
         * 自己 名
         */
    var cmpFnameCb: Int? = null,
        /**
         * 家庭名字 姓
         */
    var cmpLnameCa: Int? = null,
        /**
         * 家庭名字 名
         */
    var cmpLnameCb: Int? = null,
        /**
         * 性别一致性
         */
    var cmpSex: Int? = null,
        /**
         * 出生日期 日
         */
    var cmpBd: Int? = null,
        /**
         * 出生日期 月
         */
    var cmpBm: Int? = null,
        /**
         * 出生日期 年
         */
    var cmpBy: Int? = null,
        /**
         * 邮政编码
         */
    var cmpPlz: Int? = null,
        /**
         * 是否匹配
         */
    var isMatch: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
    var status: Int? = null

) {
    override fun toString(): String {
        return "RecordLinkageComparisonPatternsDO(id=$id, idA=$idA, idB=$idB, cmpFnameCa=$cmpFnameCa, cmpFnameCb=$cmpFnameCb, " +
                "cmpLnameCa=$cmpLnameCa, cmpLnameCb=$cmpLnameCb, cmpSex=$cmpSex, cmpBd=$cmpBd, cmpBm=$cmpBm, cmpBy=$cmpBy, " +
                "cmpPlz=$cmpPlz, isMatch=$isMatch, status=$status)\n"
    }
}