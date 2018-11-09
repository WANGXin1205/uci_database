package com.growlithe.uci.mysql.database.mammographic.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  乳腺肿块数据集
 */
data class MammographicMassDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * BI-RADS评估
         */
        var assessment: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 形状
         */
        var shape: Int? = null,
        /**
         * 保证金
         */
        var margin: Int? = null,
        /**
         * 密度
         */
        var density: Int? = null,
        /**
         * 强度
         */
        var severity: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null
)