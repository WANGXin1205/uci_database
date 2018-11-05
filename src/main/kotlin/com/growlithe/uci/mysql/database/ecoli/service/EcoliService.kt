package com.growlithe.uci.mysql.database.ecoli.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.credit.dao.domain.CreditApprovalDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.domain.DefaultOfCreditCardClientsDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.mapper.DefaultOfCreditCardClientsMapper
import com.growlithe.uci.mysql.database.ecoli.dao.domain.EcoliDO
import com.growlithe.uci.mysql.database.ecoli.dao.mapper.EcoliMapper
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
class EcoliService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(EcoliService::class.java)
    }

    @Resource
    private lateinit var ecoliMapper: EcoliMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<EcoliDO>> {
        val candyResult = CandyResult<List<EcoliDO>>()

        val ecoliList = ecoliMapper.listAll()

        candyResult.data = ecoliList
        candyResult.isSuccess = true
        return candyResult
    }

}