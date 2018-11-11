package com.growlithe.uci.mysql.database.teaching.dao.mapper

import com.growlithe.uci.mysql.database.susy.dao.domain.SusyDO
import com.growlithe.uci.mysql.database.teaching.dao.domain.TeachingAssistantEvaluationDO


interface TeachingAssistantEvaluationMapper {
    /**
     * 查询所有的 教学辅助评价数据集
     *
     * @return
     */
    fun listAll(): List<TeachingAssistantEvaluationDO>
}