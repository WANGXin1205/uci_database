package com.growlithe.uci.mysql.database.skin.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.primary.dao.domain.PrimaryTumorDO
import com.growlithe.uci.mysql.database.primary.dao.mapper.PrimaryTumorMapper
import com.growlithe.uci.mysql.database.record.dao.domain.RecordLinkageComparisonPatternsDO
import com.growlithe.uci.mysql.database.record.dao.mapper.RecordLinkageComparisonPatternsMapper
import com.growlithe.uci.mysql.database.seeds.dao.domain.SeedsDO
import com.growlithe.uci.mysql.database.seeds.dao.mapper.SeedsMapper
import com.growlithe.uci.mysql.database.skin.dao.domain.SkinSegmentationDO
import com.growlithe.uci.mysql.database.skin.dao.mapper.SkinSegmentationMapper
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
class SkinSegmentationService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(SkinSegmentationService::class.java)
    }

    @Resource
    private lateinit var skinSegmentationMapper: SkinSegmentationMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<SkinSegmentationDO>> {
        val candyResult = CandyResult<List<SkinSegmentationDO>>()

        val skinSegmentationDOList = skinSegmentationMapper.listAll()

        candyResult.data = skinSegmentationDOList
        candyResult.isSuccess = true
        return candyResult
    }

}