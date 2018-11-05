package com.growlithe.uci.mysql.database.defaultcredit.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.credit.dao.domain.CreditApprovalDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.domain.DefaultOfCreditCardClientsDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.mapper.DefaultOfCreditCardClientsMapper
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
class DefaultOfCreditCardClientsService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(DefaultOfCreditCardClientsService::class.java)
    }

    @Resource
    private lateinit var defaultOfCreditCardClientsMapper: DefaultOfCreditCardClientsMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<DefaultOfCreditCardClientsDO>> {
        val candyResult = CandyResult<List<DefaultOfCreditCardClientsDO>>()

        val defaultOfCreditCardClientsDOList = defaultOfCreditCardClientsMapper.listAll()

        candyResult.data = defaultOfCreditCardClientsDOList
        candyResult.isSuccess = true
        return candyResult
    }

}