package com.growlithe.uci.mysql.database.wine.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statloggerman.dao.mapper.StatlogGermanCreditMapper
import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO
import com.growlithe.uci.mysql.database.statlogheart.dao.mapper.StatlogHeartMapper
import com.growlithe.uci.mysql.database.statloglandsat.dao.domain.StatlogLandsatSatelliteDO
import com.growlithe.uci.mysql.database.statloglandsat.dao.mapper.StatlogLandsatSatelliteMapper
import com.growlithe.uci.mysql.database.statlogshuttle.dao.domain.StatlogShuttleDO
import com.growlithe.uci.mysql.database.statlogshuttle.dao.mapper.StatlogShuttleMapper
import com.growlithe.uci.mysql.database.wine.dao.domain.WineDO
import com.growlithe.uci.mysql.database.wine.dao.mapper.WineMapper
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
class WineService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(WineService::class.java)
    }

    @Resource
    private lateinit var wineMapper: WineMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<WineDO>> {
        val candyResult = CandyResult<List<WineDO>>()

        val wineDOList = wineMapper.listAll()

        candyResult.data = wineDOList
        candyResult.isSuccess = true
        return candyResult
    }

}