package com.growlithe.uci.mysql.database.chessrookvspawn.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.car.dao.domain.CarEvaluationDO
import com.growlithe.uci.mysql.database.car.dao.mapper.CarEvaluationMapper
import com.growlithe.uci.mysql.database.census.dao.domain.CensusIncomeKddDO
import com.growlithe.uci.mysql.database.census.dao.mapper.CensusIncomeKddMapper
import com.growlithe.uci.mysql.database.chessrookvsking.dao.domain.ChessRookVsKingDO
import com.growlithe.uci.mysql.database.chessrookvsking.dao.mapper.ChessRookVsKingMapper
import com.growlithe.uci.mysql.database.chessrookvspawn.dao.domain.ChessRookVsPawnDO
import com.growlithe.uci.mysql.database.chessrookvspawn.dao.mapper.ChessRookVsPawnMapper
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
class ChessRookVsPawnService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(ChessRookVsPawnService::class.java)
    }

    @Resource
    private lateinit var chessRookVsPawnMapper: ChessRookVsPawnMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<ChessRookVsPawnDO>> {
        val candyResult = CandyResult<List<ChessRookVsPawnDO>>()

        val chessRookVsPawnDOList = chessRookVsPawnMapper.listAll()

        candyResult.data = chessRookVsPawnDOList
        candyResult.isSuccess = true
        return candyResult
    }


}