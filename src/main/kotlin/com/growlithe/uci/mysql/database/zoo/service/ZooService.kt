package com.growlithe.uci.mysql.database.zoo.service

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
import com.growlithe.uci.mysql.database.zoo.dao.domain.ZooDO
import com.growlithe.uci.mysql.database.zoo.dao.mapper.ZooMapper
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
class ZooService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(ZooService::class.java)
    }

    @Resource
    private lateinit var zooMapper: ZooMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<ZooDO>> {
        val candyResult = CandyResult<List<ZooDO>>()

        val zooDOList = zooMapper.listAll()

        candyResult.data = zooDOList
        candyResult.isSuccess = true
        return candyResult
    }

}