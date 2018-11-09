package com.growlithe.uci.mysql.database.statloggerman.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statloggerman.dao.mapper.StatlogGermanCreditMapper
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
class StatlogGermanCreditService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(StatlogGermanCreditService::class.java)
    }

    @Resource
    private lateinit var statlogGermanCreditMapper: StatlogGermanCreditMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<StatlogGermanCreditDO>> {
        val candyResult = CandyResult<List<StatlogGermanCreditDO>>()

        val statlogGermanCreditDOList = statlogGermanCreditMapper.listAll()

        candyResult.data = statlogGermanCreditDOList
        candyResult.isSuccess = true
        return candyResult
    }

}