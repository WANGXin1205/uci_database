package com.growlithe.uci.mysql.database.yeast.service

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
import com.growlithe.uci.mysql.database.hepatitis.dao.domain.HepatitisDO
import com.growlithe.uci.mysql.database.hepatitis.dao.mapper.HepatitisMapper
import com.growlithe.uci.mysql.database.htru.dao.domain.HtruDO
import com.growlithe.uci.mysql.database.htru.dao.mapper.HtruMapper
import com.growlithe.uci.mysql.database.yeast.dao.domain.YeastDO
import com.growlithe.uci.mysql.database.yeast.dao.mapper.YeastMapper
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
class YeastService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(YeastService::class.java)
    }

    @Resource
    private lateinit var yeastMapper: YeastMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<YeastDO>> {
        val candyResult = CandyResult<List<YeastDO>>()

        val yeastDOList = yeastMapper.listAll()

        candyResult.data = yeastDOList
        candyResult.isSuccess = true
        return candyResult
    }

}