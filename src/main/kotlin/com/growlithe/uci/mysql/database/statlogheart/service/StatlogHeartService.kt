package com.growlithe.uci.mysql.database.statlogheart.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.statloggerman.dao.domain.StatlogGermanCreditDO
import com.growlithe.uci.mysql.database.statloggerman.dao.mapper.StatlogGermanCreditMapper
import com.growlithe.uci.mysql.database.statlogheart.dao.domain.StatlogHeartDO
import com.growlithe.uci.mysql.database.statlogheart.dao.mapper.StatlogHeartMapper
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
class StatlogHeartService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(StatlogHeartService::class.java)
    }

    @Resource
    private lateinit var statlogHeartMapper: StatlogHeartMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<StatlogHeartDO>> {
        val candyResult = CandyResult<List<StatlogHeartDO>>()

        val statlogHeartDOList = statlogHeartMapper.listAll()

        candyResult.data = statlogHeartDOList
        candyResult.isSuccess = true
        return candyResult
    }

}