package com.growlithe.uci.mysql.database.chessrookvsking.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO
import com.growlithe.uci.mysql.database.car.dao.mapper.CarEvaluationMapper
import com.growlithe.uci.mysql.database.census.dao.domain.CensusIncomeKddDO
import com.growlithe.uci.mysql.database.census.dao.mapper.CensusIncomeKddMapper
import com.growlithe.uci.mysql.database.chessrookvsking.dao.domain.ChessRookVsKingDO
import com.growlithe.uci.mysql.database.chessrookvsking.dao.mapper.ChessRookVsKingMapper
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
class ChessRookVsKingService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(ChessRookVsKingService::class.java)
    }

    @Resource
    private lateinit var chessRookVsKingMapper: ChessRookVsKingMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<ChessRookVsKingDO>> {
        val candyResult = CandyResult<List<ChessRookVsKingDO>>()

        val chessRookVsKingDOList = chessRookVsKingMapper.listAll()

        candyResult.data = chessRookVsKingDOList
        candyResult.isSuccess = true
        return candyResult
    }


}