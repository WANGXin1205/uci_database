package com.growlithe.uci.mysql.database.record.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.primary.dao.domain.PrimaryTumorDO
import com.growlithe.uci.mysql.database.primary.dao.mapper.PrimaryTumorMapper
import com.growlithe.uci.mysql.database.record.dao.domain.RecordLinkageComparisonPatternsDO
import com.growlithe.uci.mysql.database.record.dao.mapper.RecordLinkageComparisonPatternsMapper
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
class RecordLinkageComparisonPatternsService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(RecordLinkageComparisonPatternsService::class.java)
    }

    @Resource
    private lateinit var recordLinkageComparisonPatternsMapper: RecordLinkageComparisonPatternsMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<RecordLinkageComparisonPatternsDO>> {
        val candyResult = CandyResult<List<RecordLinkageComparisonPatternsDO>>()

        val recordLinkageComparisonPatternsDOList = recordLinkageComparisonPatternsMapper.listAll()

        candyResult.data = recordLinkageComparisonPatternsDOList
        candyResult.isSuccess = true
        return candyResult
    }

}