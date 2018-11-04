package com.growlithe.uci.mysql.database.census.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO
import com.growlithe.uci.mysql.database.car.dao.mapper.CarEvaluationMapper
import com.growlithe.uci.mysql.database.census.dao.domain.CensusIncomeKddDO
import com.growlithe.uci.mysql.database.census.dao.mapper.CensusIncomeKddMapper
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
class CensusIncomeKddService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(CensusIncomeKddService::class.java)
    }

    @Resource
    private lateinit var censusIncomeKddMapper: CensusIncomeKddMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<CensusIncomeKddDO>> {
        val candyResult = CandyResult<List<CensusIncomeKddDO>>()

        val censusIncomeKddDOList = censusIncomeKddMapper.listAll()

        candyResult.data = censusIncomeKddDOList
        candyResult.isSuccess = true
        return candyResult
    }


}