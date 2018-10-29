package com.growlithe.uci.mysql.database.bankmarketing.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.balance.dao.domain.BalanceScaleDO
import com.growlithe.uci.mysql.database.balance.dao.mapper.BalanceScaleMapper
import com.growlithe.uci.mysql.database.balance.service.BalanceScaleService
import com.growlithe.uci.mysql.database.bankmarketing.dao.domain.BankMarketingDO
import com.growlithe.uci.mysql.database.bankmarketing.dao.mapper.BankMarketingMapper
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
class BankMarketingService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(BankMarketingService::class.java)
    }

    @Resource
    private lateinit var bankMarketingMapper: BankMarketingMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<BankMarketingDO>> {
        val candyResult = CandyResult<List<BankMarketingDO>>()

        val balanceScaleDOList = bankMarketingMapper.listAll()

        candyResult.data = balanceScaleDOList
        candyResult.isSuccess = true
        return candyResult
    }


}