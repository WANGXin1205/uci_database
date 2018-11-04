package com.growlithe.uci.mysql.database.congressional.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.congressional.dao.domain.CongressionalVotingRecordsDO
import com.growlithe.uci.mysql.database.congressional.dao.mapper.CongressionalVotingRecordsMapper
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
class CongressionalVotingRecordsService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(CongressionalVotingRecordsService::class.java)
    }

    @Resource
    private lateinit var congressionalVotingRecordsMapper: CongressionalVotingRecordsMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<CongressionalVotingRecordsDO>> {
        val candyResult = CandyResult<List<CongressionalVotingRecordsDO>>()

        val congressionalVotingRecordsDOList = congressionalVotingRecordsMapper.listAll()

        candyResult.data = congressionalVotingRecordsDOList
        candyResult.isSuccess = true
        return candyResult
    }


}