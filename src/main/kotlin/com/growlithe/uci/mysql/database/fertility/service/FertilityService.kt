package com.growlithe.uci.mysql.database.fertility.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.credit.dao.domain.CreditApprovalDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.domain.DefaultOfCreditCardClientsDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.mapper.DefaultOfCreditCardClientsMapper
import com.growlithe.uci.mysql.database.ecoli.dao.domain.EcoliDO
import com.growlithe.uci.mysql.database.ecoli.dao.mapper.EcoliMapper
import com.growlithe.uci.mysql.database.fertility.dao.domain.FertilityDO
import com.growlithe.uci.mysql.database.fertility.dao.mapper.FertilityMapper
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
class FertilityService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(FertilityService::class.java)
    }

    @Resource
    private lateinit var fertilityMapper: FertilityMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<FertilityDO>> {
        val candyResult = CandyResult<List<FertilityDO>>()

        val fertilityDOList = fertilityMapper.listAll()

        candyResult.data = fertilityDOList
        candyResult.isSuccess = true
        return candyResult
    }

}