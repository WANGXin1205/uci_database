package com.growlithe.uci.mysql.database.statlogvehicle.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statloggerman.dao.mapper.StatlogGermanCreditMapper
import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO
import com.growlithe.uci.mysql.database.statlogheart.dao.mapper.StatlogHeartMapper
import com.growlithe.uci.mysql.database.statloglandsat.dao.domain.StatlogLandsatSatelliteDO
import com.growlithe.uci.mysql.database.statloglandsat.dao.mapper.StatlogLandsatSatelliteMapper
import com.growlithe.uci.mysql.database.statlogshuttle.dao.domain.StatlogShuttleDO
import com.growlithe.uci.mysql.database.statlogshuttle.dao.mapper.StatlogShuttleMapper
import com.growlithe.uci.mysql.database.statlogvehicle.dao.domain.StatlogVehicleSilhouettesDO
import com.growlithe.uci.mysql.database.statlogvehicle.dao.mapper.StatlogVehicleSilhouettesMapper
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
class StatlogVehicleSilhouettesService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(StatlogVehicleSilhouettesService::class.java)
    }

    @Resource
    private lateinit var statlogVehicleSilhouettesMapper: StatlogVehicleSilhouettesMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<StatlogVehicleSilhouettesDO>> {
        val candyResult = CandyResult<List<StatlogVehicleSilhouettesDO>>()

        val statlogVehicleSilhouettesDOList = statlogVehicleSilhouettesMapper.listAll()

        candyResult.data = statlogVehicleSilhouettesDOList
        candyResult.isSuccess = true
        return candyResult
    }

}