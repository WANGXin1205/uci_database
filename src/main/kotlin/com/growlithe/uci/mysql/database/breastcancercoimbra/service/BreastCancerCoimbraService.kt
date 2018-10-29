package com.growlithe.uci.mysql.database.breastcancercoimbra.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.balance.dao.domain.BalanceScaleDO
import com.growlithe.uci.mysql.database.balance.dao.mapper.BalanceScaleMapper
import com.growlithe.uci.mysql.database.balance.service.BalanceScaleService
import com.growlithe.uci.mysql.database.bankmarketing.dao.domain.BankMarketingDO
import com.growlithe.uci.mysql.database.bankmarketing.dao.mapper.BankMarketingMapper
import com.growlithe.uci.mysql.database.banknote.dao.domain.BanknoteAuthenticationDO
import com.growlithe.uci.mysql.database.banknote.dao.mapper.BanknoteAuthenticationMapper
import com.growlithe.uci.mysql.database.blood.dao.domain.BloodTransfusionServiceCenterDO
import com.growlithe.uci.mysql.database.blood.dao.mapper.BloodTransfusionServiceCenterMapper
import com.growlithe.uci.mysql.database.breastcancer.dao.domain.BreastCancerDO
import com.growlithe.uci.mysql.database.breastcancer.dao.mapper.BreastCancerMapper
import com.growlithe.uci.mysql.database.breastcancercoimbra.dao.domain.BreastCancerCoimbraDO
import com.growlithe.uci.mysql.database.breastcancercoimbra.dao.mapper.BreastCancerCoimbraMapper
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
class BreastCancerCoimbraService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(BreastCancerCoimbraService::class.java)
    }

    @Resource
    private lateinit var breastCancerCoimbraMapper: BreastCancerCoimbraMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<BreastCancerCoimbraDO>> {
        val candyResult = CandyResult<List<BreastCancerCoimbraDO>>()

        val breastCancerCoimbraDOList = breastCancerCoimbraMapper.listAll()

        candyResult.data = breastCancerCoimbraDOList
        candyResult.isSuccess = true
        return candyResult
    }


}