package com.growlithe.uci.mysql.database.hayes.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.credit.dao.domain.CreditApprovalDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.domain.DefaultOfCreditCardClientsDO
import com.growlithe.uci.mysql.database.defaultcredit.dao.mapper.DefaultOfCreditCardClientsMapper
import com.growlithe.uci.mysql.database.ecoli.dao.domain.EcoliDO
import com.growlithe.uci.mysql.database.ecoli.dao.mapper.EcoliMapper
import com.growlithe.uci.mysql.database.fertility.dao.domain.FertilityDO
import com.growlithe.uci.mysql.database.fertility.dao.mapper.FertilityMapper
import com.growlithe.uci.mysql.database.glass.dao.domain.GlassIdentificationDO
import com.growlithe.uci.mysql.database.glass.dao.mapper.GlassIdentificationMapper
import com.growlithe.uci.mysql.database.haberman.dao.domain.HabermanSurvivalDO
import com.growlithe.uci.mysql.database.haberman.dao.mapper.HabermanSurvivalMapper
import com.growlithe.uci.mysql.database.hayes.dao.domain.HayesRothDO
import com.growlithe.uci.mysql.database.hayes.dao.mapper.HayesRothMapper
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
class HayesRothService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(HayesRothService::class.java)
    }

    @Resource
    private lateinit var hayesRothMapper: HayesRothMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<HayesRothDO>> {
        val candyResult = CandyResult<List<HayesRothDO>>()

        val hayesRothDOList = hayesRothMapper.listAll()

        candyResult.data = hayesRothDOList
        candyResult.isSuccess = true
        return candyResult
    }

}