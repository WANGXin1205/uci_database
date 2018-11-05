package com.growlithe.uci.mysql.database.haberman.service

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
class HabermanSurvivalService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(HabermanSurvivalService::class.java)
    }

    @Resource
    private lateinit var habermanSurvivalMapper: HabermanSurvivalMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<HabermanSurvivalDO>> {
        val candyResult = CandyResult<List<HabermanSurvivalDO>>()

        val habermanSurvivalDOList = habermanSurvivalMapper.listAll()

        candyResult.data = habermanSurvivalDOList
        candyResult.isSuccess = true
        return candyResult
    }

}