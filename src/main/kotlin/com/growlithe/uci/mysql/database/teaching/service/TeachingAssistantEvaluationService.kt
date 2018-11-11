package com.growlithe.uci.mysql.database.teaching.service

import com.github.pagehelper.PageHelper
import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.config.DataConfig
import com.growlithe.uci.mysql.database.susy.dao.domain.SusyDO
import com.growlithe.uci.mysql.database.susy.dao.mapper.SusyMapper
import com.growlithe.uci.mysql.database.teaching.dao.domain.TeachingAssistantEvaluationDO
import com.growlithe.uci.mysql.database.teaching.dao.mapper.TeachingAssistantEvaluationMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description
 */
@Service
@Transactional
class TeachingAssistantEvaluationService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(TeachingAssistantEvaluationService::class.java)
    }

    @Resource
    private lateinit var teachingAssistantEvaluationMapper: TeachingAssistantEvaluationMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<TeachingAssistantEvaluationDO>> {
        val candyResult = CandyResult<List<TeachingAssistantEvaluationDO>>()
        val teachingAssistantEvaluationDOList = teachingAssistantEvaluationMapper.listAll()

        candyResult.data = teachingAssistantEvaluationDOList
        candyResult.isSuccess = true
        return candyResult
    }

}