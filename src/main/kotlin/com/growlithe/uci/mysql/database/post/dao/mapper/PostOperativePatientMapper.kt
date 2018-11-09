package com.growlithe.uci.mysql.database.post.dao.mapper

import com.growlithe.uci.mysql.database.post.dao.domain.PostOperativePatientDO

interface PostOperativePatientMapper {
    /**
     * 查询所有的 术后病人数据集
     *
     * @return
     */
    fun listAll(): List<PostOperativePatientDO>
}