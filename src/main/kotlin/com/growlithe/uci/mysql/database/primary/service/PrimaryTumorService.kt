package com.growlithe.uci.mysql.database.primary.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.poker.dao.domain.PokeHandDO
import com.growlithe.uci.mysql.database.post.dao.domain.PostOperativePatientDO
import com.growlithe.uci.mysql.database.post.dao.mapper.PostOperativePatientMapper
import com.growlithe.uci.mysql.database.primary.dao.domain.PrimaryTumorDO
import com.growlithe.uci.mysql.database.primary.dao.mapper.PrimaryTumorMapper
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
class PrimaryTumorService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(PrimaryTumorService::class.java)
    }

    @Resource
    private lateinit var primaryTumorMapper: PrimaryTumorMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<PrimaryTumorDO>> {
        val candyResult = CandyResult<List<PrimaryTumorDO>>()

        val primaryTumorDOList = primaryTumorMapper.listAll()

        candyResult.data = primaryTumorDOList
        candyResult.isSuccess = true
        return candyResult
    }

}