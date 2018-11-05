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
         * 属性数量
         */
        var attributesNumber:Int? = null,
        /**
         * 实例数量
         */
        var instancesNumber:Int? = null,
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
        var status:Int? = null

) {
    override fun toString(): String {
        return "DatabaseOverviewDO(id=$id, name=$name, attributesNumber=$attributesNumber, instancesNumber=$instancesNumber, " +
                "area=$area, dateDonated=$dateDonated, url=$url, status=$status)\n"
    }
}
