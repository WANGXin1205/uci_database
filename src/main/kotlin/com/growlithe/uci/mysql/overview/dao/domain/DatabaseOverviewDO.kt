package com.growlithe.uci.mysql.overview.dao.domain

import java.net.URI
import java.net.URL
import java.util.*

/**
 * @Author : Growlithe
 * @Date : 2018/10/22 上午10:12
 * @Description 数据集概况
 */
data class DatabaseOverviewDO(
        /**
         * 主键id
         */
        var id:Long ? = null,
        /**
         * 数据集名称
         */
        var name:String?=null,
        /**
         * 连续属性数量
         */
        var continuityAttributesNumber:Int? = null,
        /**
         * 离散属性数量
         */
        var discreteAttributesNumber:Int? = null,
        /**
         * 属性数量
         */
        var attributesNumber:Int? = null,
        /**
         * 分类数
         */
        var classifiedNumber:Int? = null,
        /**
         * 实例数量
         */
        var instancesNumber:Int? = null,
        /**
         * 缺失数据 Y 是 N 否
         */
        var missingValues:String? = null,
        /**
         * 检验方法 cv 交叉验证  hold_out 保留验证
         */
        var testFunction:String? = null,
        /**
         * 领域
         */
        var area:String? = null,
        /**
         * 捐献日期
         */
        var dateDonated:String ? = null,
        /**
         * 数据集网址
         */
        var url: String? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status:Int? = null,
        /**
         * 创建人
         */
        var createBy:String ? = null,
        /**
         * 创建时间
         */
        var createTime:Date ? = null,
        /**
         * 更新人
         */
        var updateBy:String ? = null,
        /**
         * 更新时间
         */
        var updateTime:Date ? = null

) {
    override fun toString(): String {
        return "DatabaseOverviewDO(id=$id, name=$name, continuityAttributesNumber=$continuityAttributesNumber," +
                " discreteAttributesNumber=$discreteAttributesNumber, attributesNumber=$attributesNumber, " +
                "classifiedNumber=$classifiedNumber, instancesNumber=$instancesNumber, missingValues=$missingValues, " +
                "testFunction=$testFunction, area=$area, dateDonated=$dateDonated, status=$status, createBy=$createBy, " +
                "createTime=$createTime, updateBy=$updateBy, updateTime=$updateTime)\n"
    }
}
