package com.growlithe.uci.mysql.database.tic.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.tic.dao.domain.TicTacToeEndgameDO
import com.growlithe.uci.mysql.database.tic.dao.mapper.TicTacToeEndgameMapper
import com.growlithe.uci.mysql.database.user.dao.domain.UserKnowledgeModelingDO
import com.growlithe.uci.mysql.database.user.dao.mapper.UserKnowledgeModelingMapper
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
class TicTacToeEndgameService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(TicTacToeEndgameService::class.java)
    }

    @Resource
    private lateinit var ticTacToeEndgameMapper: TicTacToeEndgameMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<TicTacToeEndgameDO>> {
        val candyResult = CandyResult<List<TicTacToeEndgameDO>>()

        val ticTacToeEndgameDOList = ticTacToeEndgameMapper.listAll()

        candyResult.data = ticTacToeEndgameDOList
        candyResult.isSuccess = true
        return candyResult
    }

}