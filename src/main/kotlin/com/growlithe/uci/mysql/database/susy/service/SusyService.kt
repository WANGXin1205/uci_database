package com.growlithe.uci.mysql.database.susy.service

import com.github.pagehelper.PageHelper
import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.config.DataConfig
import com.growlithe.uci.mysql.database.susy.dao.domain.SusyDO
import com.growlithe.uci.mysql.database.susy.dao.mapper.SusyMapper
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
class SusyService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(SusyService::class.java)
    }

    @Resource
    private lateinit var susyMapper: SusyMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<SusyDO>> {
        return this.listAll(DataConfig.DEFAULT_CURRENT_PAGE,DataConfig.DEFAULT_PAGE_SIZE)
    }

    /**
     * 查询所有数据
     */
    fun listAll(currentPage: Int, pageSize: Int): CandyResult<List<SusyDO>> {
        val candyResult = CandyResult<List<SusyDO>>()

        if (currentPage < DataConfig.DEFAULT_BEGIN_INDEX || pageSize < DataConfig.DEFAULT_BEGIN_INDEX) {
            // 默认查询第一页 20行数据
            PageHelper.startPage<Int>(DataConfig.DEFAULT_CURRENT_PAGE, DataConfig.DEFAULT_PAGE_SIZE)
        }else{
            PageHelper.startPage<Int>(currentPage, pageSize)
        }

        val susyDOList = susyMapper.listAll()

        candyResult.data = susyDOList
        candyResult.isSuccess = true
        return candyResult
    }

}