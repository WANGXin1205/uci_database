package com.growlithe.uci.mysql.database.localization.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.letter.dao.domain.LetterRecognitionDO
import com.growlithe.uci.mysql.database.letter.dao.mapper.LetterRecognitionMapper
import com.growlithe.uci.mysql.database.localization.dao.domain.LocalizationDataForPersonActivityDO
import com.growlithe.uci.mysql.database.localization.dao.mapper.LocalizationDataForPersonActivityMapper
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
class LocalizationDataForPersonActivityService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(LocalizationDataForPersonActivityService::class.java)
    }

    @Resource
    private lateinit var localizationDataForPersonActivityMapper: LocalizationDataForPersonActivityMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<LocalizationDataForPersonActivityDO>> {
        val candyResult = CandyResult<List<LocalizationDataForPersonActivityDO>>()

        val localizationDataForPersonActivityDOList = localizationDataForPersonActivityMapper.listAll()

        candyResult.data = localizationDataForPersonActivityDOList
        candyResult.isSuccess = true
        return candyResult
    }

}