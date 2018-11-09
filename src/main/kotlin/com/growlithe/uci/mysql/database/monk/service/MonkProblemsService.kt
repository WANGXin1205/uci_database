package com.growlithe.uci.mysql.database.monk.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.localization.dao.domain.LocalizationDataForPersonActivityDO
import com.growlithe.uci.mysql.database.localization.dao.mapper.LocalizationDataForPersonActivityMapper
import com.growlithe.uci.mysql.database.magic.dao.domain.MagicGammaTelescopeDO
import com.growlithe.uci.mysql.database.magic.dao.mapper.MagicGammaTelescopeMapper
import com.growlithe.uci.mysql.database.mammographic.dao.domain.MammographicMassDO
import com.growlithe.uci.mysql.database.mammographic.dao.mapper.MammographicMassMapper
import com.growlithe.uci.mysql.database.monk.dao.domain.MonkProblemsDO
import com.growlithe.uci.mysql.database.monk.dao.mapper.MonkProblemsMapper
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
class MonkProblemsService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(MonkProblemsService::class.java)
    }

    @Resource
    private lateinit var monkProblemsMapper:MonkProblemsMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<MonkProblemsDO>> {
        val candyResult = CandyResult<List<MonkProblemsDO>>()

        val monkProblemsDOList = monkProblemsMapper.listAll()

        candyResult.data = monkProblemsDOList
        candyResult.isSuccess = true
        return candyResult
    }

}