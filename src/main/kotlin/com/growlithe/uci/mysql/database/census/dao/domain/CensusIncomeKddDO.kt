package com.growlithe.uci.mysql.database.census.dao.domain

import java.io.Serializable
import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 人口普查数据集
 */
data class CensusIncomeKddDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 工作所属种类
         */
        var classOfWorker: String? = null,
        /**
         * 行业代码
         */
        var industryCode: Int? = null,
        /**
         *  职业代码
         */
        var occupationCode: Int? = null,
        /**
         *  教育经历
         */
        var education: String? = null,
        /**
         *  每小时工资
         */
        var wagePerHour: Int? = null,
        /**
         * 报名
         */
        var enrolled: String? = null,
        /**
         * 婚姻状态
         */
        var maritalStatus: String? = null,
        /**
         *  主要行业代码
         */
        var majorIndustryCode: String? = null,
        /**
         *  主要行业代码
         */
        var majorOccupationCode: String? = null,
        /**
         * mace
         */
        var mace: String? = null,
        /**
         * 起源地
         */
        var hispanicOrigin: String? = null,
        /**
         * 性别
         */
        var sex: String? = null,
        /**
         * 工作室成员
         */
        var memberOfLaborUnion: String? = null,
        /**
         * 失业原因
         */
        var reasonForUnemployment: String? = null,
        /**
         * 全职和兼职数据
         */
        var employmentStat: String? = null,
        /**
         * 资本收益
         */
        var capitalGains: Int? = null,
        /**
         * 资本损失
         */
        var capitalLosses: Int? = null,
        /**
         * 股息
         */
        var divdendsFromStocks: Int? = null,
        /**
         * 税务申请状态
         */
        var taxFilerStatus: String? = null,
        /**
         * 前居住区
         */
        var regionOfPreviousResidence: String? = null,
        /**
         * 前居住地
         */
        var stateOfPreviousResidence: String? = null,
        /**
         * 家居用品
         */
        var detailedHouseholdAndFamilyStat: String? = null,
        /**
         * 细节住宅概述
         */
        var detailedHouseholdSummary: String? = null,
        /**
         * 代码迁移msa
         */
        var migrationCodeChangeMsa: BigDecimal? = null,
        /**
         * 代码迁移reg
         */
        var migrationCodeChangeReg: String? = null,
        /**
         * 迁移代码
         */
        var migrationCodeMove: String? = null,
        /**
         * 居住一年以上
         */
        var liveIn: String? = null,
        /**
         * 在阳光地带迁移
         */
        var migration: String? = null,
        /**
         * 雇员数
         */
        var numPersonsWorked: String? = null,
        /**
         * 家庭成员
         */
        var familyMembers: Int? = null,
        /**
         * 父亲出生地
         */
        var countryOfBirthFather: String? = null,
        /**
         * 母亲出生地
         */
        var countryOfBirthMother: String? = null,
        /**
         * 自己出生地
         */
        var countryOfBirthSelf: String? = null,
        /**
         * 公民身份
         */
        var citizenship: String? = null,
        /**
         * 自己业务
         */
        var ownBusiness: String? = null,
        /**
         * 自己企业或者自雇的
         */
        var fillIncQuestionnaire: Int? = null,
        /**
         * 受益
         */
        var veteransBenefits: String? = null,
        /**
         * 工作了几周
         */
        var weeksWorked: Int? = null,
        /**
         * 年
         */
        var year: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 数据属性  1 训练 2 测试
         */
        var dataType: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null
)