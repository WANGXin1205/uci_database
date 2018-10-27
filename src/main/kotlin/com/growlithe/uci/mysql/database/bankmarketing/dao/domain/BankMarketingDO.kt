package com.growlithe.uci.mysql.database.bankmarketing.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午4:22
 * @Description 银行营销数据集
 */
data class BankMarketingDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 工作：工作类型（分类：'管理员'，'蓝领'，'企业家'，'女佣'，'管理'，'退休' ，'自雇人员'，'服务'，'学生'，'技师'，'失业'，'未知'）
         */
        var job: String? = null,
        /**
         * 婚姻：婚姻状况（分类：'离婚'，'已婚'，'单身'，'未知';注意：'离婚'意味着离婚或丧偶）
         */
        var marital: String? = null,
        /**
         * 教育（分类：'basic.4y'，'basic.6y'，'basic.9y'，'high.school'，'illiterate'，'professional.course '，'university.degree'，'未知'）
         */
        var education: String? = null,
        /**
         * 默认信用
         */
        var defaultCredit: String? = null,
        /**
         * 住房：有住房贷款吗？（分类：'不'，'是'，'未知'）
         */
        var housing: String? = null,
        /**
         * 贷款：有个人贷款吗？（分类：'不'，'是'，'未知'）
         */
        var loan: String? = null,
        /**
         * 联系人：联系人沟通类型（分类：'手机'，'电话'）
         */
        var contact: String? = null,
        /**
         * 上一个联系月份（分类：'jan'，'feb'，' mar'，...，'nov'，'dec'）
         */
        var month: String? = null,
        /**
         * 一周的最后一个联系日（分类：'mon'，'tue'，'wed'，'thu'，'fri'）
         */
        var dayOfWeek: String? = null,
        /**
         * 持续时间：上次联系持续时间，以秒为单位（数字）。重要提示：此属性会严重影响输出目标（例如，如果持续时间= 0，则y ='否'）。
         * 然而，在执行呼叫之前不知道持续时间。此外，在通话结束后，显然已知y。从而，此输入仅应包含在基准目的中，如果打算采用现实的预测模型，则应将其丢弃。
         */
        var duration: Int? = null,
        /**
         *  广告系列：此广告系列期间和此客户端执行的联系人数量（数字，包括最后一次联系）
         */
        var campaign: Int? = null,
        /**
         * 上一次广告系列上次联系客户端后经过的天数（数字; 999表示客户端不是先前已联系过）
         */
        var pDays: Int? = null,
        /**
         * 上一篇：此活动之前和此客户之间执行的联系人数量（数字）
         */
        var previous: Int? = null,
        /**
         * 上一次营销活动的结果（分类：'失败'，'不存在'，'成功'）
         */
        var poutCome: String? = null,
        /**
         * 就业变化率 - 季度指标（数字）
         */
        var empVarRate: BigDecimal? = null,
        /**
         * 消费者价格指数 - 月度指标（数字）
         */
        var consPriceIdx: BigDecimal? = null,
        /**
         * 消费者信心指数 - 月度指标（数字）
         */
        var consConfIdx: BigDecimal? = null,
        /**
         * 个月费率 - 每日指标（数字）
         */
        var euriborM: BigDecimal? = null,
        /**
         * 员工人数 - 季度指标（数字）
         */
        var nrEmployed: Int? = null,
        /**
         * 分类 户是否订购了定期存款？（'是'，'不'）
         */
        var className: String? = null,
        /**
         * 数据类型 1 训练 2 测试
         */
        var dataType: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null


) {
    override fun toString(): String {
        return "BankMarketingDO(id=$id, age=$age, job=$job, marital=$marital, education=$education, " +
                "defaultCredit=$defaultCredit, housing=$housing, loan=$loan, contact=$contact, month=$month, " +
                "dayOfWeek=$dayOfWeek, duration=$duration, campaign=$campaign, pDays=$pDays, previous=$previous, " +
                "poutCome=$poutCome, empVarRate=$empVarRate, consPriceIdx=$consPriceIdx, consConfIdx=$consConfIdx, " +
                "euriborM=$euriborM, nrEmployed=$nrEmployed, className=$className, dataType=$dataType, status=$status)\n"
    }
}