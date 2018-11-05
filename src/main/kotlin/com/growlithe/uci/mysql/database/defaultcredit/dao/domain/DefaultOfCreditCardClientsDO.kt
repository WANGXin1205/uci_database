package com.growlithe.uci.mysql.database.defaultcredit.dao.domain


/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 信用卡客户数据设置数据集
 */
data class DefaultOfCreditCardClientsDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 给定的信用额度
         */
        var limitBal: Int? = null,
        /**
         * 性别
         */
        var sex: Int? = null,
        /**
         * 教育水平
         */
        var education: Int? = null,
        /**
         * 是否结婚
         */
        var marriage: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 过去的付款历史 a
         */
        var payA: Int? = null,
        /**
         * 过去的付款历史 b
         */
        var payB: Int? = null,
        /**
         * 过去的付款历史 c
         */
        var payC: Int? = null,
        /**
         * 过去的付款历史 d
         */
        var payD: Int? = null,
        /**
         * 过去的付款历史 e
         */
        var payE: Int? = null,
        /**
         * 过去的付款历史 f
         */
        var payF: Int? = null,
        /**
         * 对账单金额 a
         */
        var billAmtA: Int? = null,
        /**
         * 对账单金额 b
         */
        var billAmtB: Int? = null,
        /**
         * 对账单金额 c
         */
        var billAmtC: Int? = null,
        /**
         * 对账单金额 d
         */
        var billAmtD: Int? = null,
        /**
         * 对账单金额 e
         */
        var billAmtE: Int? = null,
        /**
         * 对账单金额 f
         */
        var billAmtF: Int? = null,
        /**
         * 以前的付款历史 a
         */
        var payAmtA: Int? = null,
        /**
         * 以前的付款历史 b
         */
        var payAmtB: Int? = null,
        /**
         * 以前的付款历史 c
         */
        var payAmtC: Int? = null,
        /**
         * 以前的付款历史 d
         */
        var payAmtD: Int? = null,
        /**
         * 以前的付款历史 e
         */
        var payAmtE: Int? = null,
        /**
         * 以前的付款历史 f
         */
        var payAmtF: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null


) {
    override fun toString(): String {
        return "DefaultOfCreditCardClientsDO(id=$id, limitBal=$limitBal, sex=$sex, education=$education, marriage=$marriage, " +
                "age=$age, payA=$payA, payB=$payB, payC=$payC, payD=$payD, payE=$payE, payF=$payF, billAmtA=$billAmtA, " +
                "billAmtB=$billAmtB, billAmtC=$billAmtC, billAmtD=$billAmtD, billAmtE=$billAmtE, billAmtF=$billAmtF, " +
                "payAmtA=$payAmtA, payAmtB=$payAmtB, payAmtC=$payAmtC, payAmtD=$payAmtD, payAmtE=$payAmtE, payAmtF=$payAmtF, " +
                "className=$className, status=$status)\n"
    }
}