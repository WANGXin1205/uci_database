package com.growlithe.uci.mysql.database.primary.dao.mapper

import com.growlithe.uci.mysql.database.post.dao.domain.PostOperativePatientDO
import com.growlithe.uci.mysql.database.primary.dao.domain.PrimaryTumorDO


interface PrimaryTumorMapper {
    /**
     * 查询所有的 原发肿瘤数据集
     *
     * @return
     */
    fun listAll(): List<PrimaryTumorDO>
}