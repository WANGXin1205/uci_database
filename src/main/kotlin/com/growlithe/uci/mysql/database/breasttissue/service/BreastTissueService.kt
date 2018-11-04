package com.growlithe.uci.mysql.database.breasttissue.service

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
import com.growlithe.uci.mysql.database.breasttissue.dao.domain.BreastTissueDO
import com.growlithe.uci.mysql.database.breasttissue.dao.mapper.BreastTissueMapper
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
class BreastTissueService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(BreastTissueService::class.java)
    }

    @Resource
    private lateinit var breastTissueMapper: BreastTissueMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<BreastTissueDO>> {
        val candyResult = CandyResult<List<BreastTissueDO>>()

        val breastTissueDOList = breastTissueMapper.listAll()

        candyResult.data = breastTissueDOList
        candyResult.isSuccess = true
        return candyResult
    }


}