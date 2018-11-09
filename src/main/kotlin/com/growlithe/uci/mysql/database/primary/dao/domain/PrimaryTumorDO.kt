package com.growlithe.uci.mysql.database.primary.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  原发肿瘤数据集
 */
data class PrimaryTumorDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 性别
         */
        var sex: Int? = null,
        /**
         * 组织学类型
         */
        var histologicType: Int? = null,
        /**
         * 程度不同
         */
        var degreeOfDiffe: Int? = null,
        /**
         * 骨头
         */
        var bone: Int? = null,
        /**
         * 骨髓
         */
        var boneMarrow: Int? = null,
        /**
         * 肺
         */
        var lung: Int? = null,
        /**
         * 胸膜
         */
        var pleura: Int? = null,
        /**
         * 腹膜
         */
        var peritoneum: Int? = null,
        /**
         * 肝
         */
        var liver: Int? = null,
        /**
         * 大脑
         */
        var brain: Int? = null,
        /**
         * 皮肤
         */
        var skin: Int? = null,
        /**
         * 颈部
         */
        var neck: Int? = null,
        /**
         * 锁骨
         */
        var supraclavicular: Int? = null,
        /**
         * 腋窝
         */
        var axillar: Int? = null,
        /**
         * 纵隔
         */
        var mediastinum: Int? = null,
        /**
         * 腹部
         */
        var abdominal: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null
)