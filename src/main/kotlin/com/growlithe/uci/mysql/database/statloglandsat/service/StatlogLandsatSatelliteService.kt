package com.growlithe.uci.mysql.database.statloglandsat.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statloggerman.dao.mapper.StatlogGermanCreditMapper
import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO
import com.growlithe.uci.mysql.database.statlogheart.dao.mapper.StatlogHeartMapper
import com.growlithe.uci.mysql.database.statloglandsat.dao.domain.StatlogLandsatSatelliteDO
import com.growlithe.uci.mysql.database.statloglandsat.dao.mapper.StatlogLandsatSatelliteMapper
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
class StatlogLandsatSatelliteService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(StatlogLandsatSatelliteService::class.java)
    }

    @Resource
    private lateinit var statlogLandsatSatelliteMapper: StatlogLandsatSatelliteMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<StatlogLandsatSatelliteDO>> {
        val candyResult = CandyResult<List<StatlogLandsatSatelliteDO>>()

        val statlogLandsatSatelliteDOList = statlogLandsatSatelliteMapper.listAll()

        candyResult.data = statlogLandsatSatelliteDOList
        candyResult.isSuccess = true
        return candyResult
    }

}