package com.growlithe.uci.mysql.database.car.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO
import com.growlithe.uci.mysql.database.car.dao.mapper.CarEvaluationMapper
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
class CarEvaluationService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(CarEvaluationService::class.java)
    }

    @Resource
    private lateinit var carEvaluationMapper: CarEvaluationMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<CarEvaluationDO>> {
        val candyResult = CandyResult<List<CarEvaluationDO>>()

        val carEvalucationDOList = carEvaluationMapper.listAll()

        candyResult.data = carEvalucationDOList
        candyResult.isSuccess = true
        return candyResult
    }


}