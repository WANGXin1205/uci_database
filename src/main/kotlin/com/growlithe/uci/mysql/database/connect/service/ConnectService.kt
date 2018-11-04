package com.growlithe.uci.mysql.database.connect.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO
import com.growlithe.uci.mysql.database.car.dao.mapper.CarEvaluationMapper
import com.growlithe.uci.mysql.database.census.dao.domain.CensusIncomeKddDO
import com.growlithe.uci.mysql.database.census.dao.mapper.CensusIncomeKddMapper
import com.growlithe.uci.mysql.database.chessrookvsking.dao.domain.ChessRookVsKingDO
import com.growlithe.uci.mysql.database.chessrookvsking.dao.mapper.ChessRookVsKingMapper
import com.growlithe.uci.mysql.database.chessrookvspawn.dao.domain.ChessRookVsPawnDO
import com.growlithe.uci.mysql.database.chessrookvspawn.dao.mapper.ChessRookVsPawnMapper
import com.growlithe.uci.mysql.database.congressional.dao.domain.CongressionalVotingRecordsDO
import com.growlithe.uci.mysql.database.congressional.dao.mapper.CongressionalVotingRecordsMapper
import com.growlithe.uci.mysql.database.connect.dao.domain.ConnectDO
import com.growlithe.uci.mysql.database.connect.dao.mapper.ConnectMapper
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
class ConnectService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(ConnectService::class.java)
    }

    @Resource
    private lateinit var connectMapper: ConnectMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<ConnectDO>> {
        val candyResult = CandyResult<List<ConnectDO>>()

        val connectDOList = connectMapper.listAll()

        candyResult.data = connectDOList
        candyResult.isSuccess = true
        return candyResult
    }


}