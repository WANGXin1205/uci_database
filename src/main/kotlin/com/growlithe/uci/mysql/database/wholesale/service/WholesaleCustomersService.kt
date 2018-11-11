package com.growlithe.uci.mysql.database.wholesale.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statloggerman.dao.mapper.StatlogGermanCreditMapper
import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO
import com.growlithe.uci.mysql.database.statlogheart.dao.mapper.StatlogHeartMapper
import com.growlithe.uci.mysql.database.statloglandsat.dao.domain.StatlogLandsatSatelliteDO
import com.growlithe.uci.mysql.database.statloglandsat.dao.mapper.StatlogLandsatSatelliteMapper
import com.growlithe.uci.mysql.database.statlogshuttle.dao.domain.StatlogShuttleDO
import com.growlithe.uci.mysql.database.statlogshuttle.dao.mapper.StatlogShuttleMapper
import com.growlithe.uci.mysql.database.wholesale.dao.domain.WholesaleCustomersDO
import com.growlithe.uci.mysql.database.wholesale.dao.mapper.WholesaleCustomersMapper
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
class WholesaleCustomersService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(WholesaleCustomersService::class.java)
    }

    @Resource
    private lateinit var wholesaleCustomersMapper: WholesaleCustomersMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<WholesaleCustomersDO>> {
        val candyResult = CandyResult<List<WholesaleCustomersDO>>()

        val wholesaleCustomersDOList = wholesaleCustomersMapper.listAll()

        candyResult.data = wholesaleCustomersDOList
        candyResult.isSuccess = true
        return candyResult
    }

}