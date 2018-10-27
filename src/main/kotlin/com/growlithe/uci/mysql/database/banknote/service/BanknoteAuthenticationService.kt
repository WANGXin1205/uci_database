package com.growlithe.uci.mysql.database.banknote.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.balance.dao.domain.BalanceScaleDO
import com.growlithe.uci.mysql.database.balance.dao.mapper.BalanceScaleMapper
import com.growlithe.uci.mysql.database.balance.service.BalanceScaleService
import com.growlithe.uci.mysql.database.bankmarketing.dao.domain.BankMarketingDO
import com.growlithe.uci.mysql.database.bankmarketing.dao.mapper.BankMarketingMapper
import com.growlithe.uci.mysql.database.banknote.dao.domain.BanknoteAuthenticationDO
import com.growlithe.uci.mysql.database.banknote.dao.mapper.BanknoteAuthenticationMapper
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
class BanknoteAuthenticationService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(BanknoteAuthenticationService::class.java)
    }

    @Resource
    lateinit var banknoteAuthenticationMapper: BanknoteAuthenticationMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<BanknoteAuthenticationDO>> {
        val candyResult = CandyResult<List<BanknoteAuthenticationDO>>()

        val banknoteAuthenticationDOList = banknoteAuthenticationMapper.listAll()

        candyResult.data = banknoteAuthenticationDOList
        candyResult.isSuccess = true
        return candyResult
    }


}