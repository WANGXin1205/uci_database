package com.growlithe.uci.mysql.database.statlogaustralian.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.skin.dao.domain.SkinSegmentationDO
import com.growlithe.uci.mysql.database.skin.dao.mapper.SkinSegmentationMapper
import com.growlithe.uci.mysql.database.statlogaustralian.dao.domain.StatlogAustralianCreditApprovalDO
import com.growlithe.uci.mysql.database.statlogaustralian.dao.mapper.StatlogAustralianCreditApprovalMapper
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
class StatlogAustralianCreditApprovalService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(StatlogAustralianCreditApprovalService::class.java)
    }

    @Resource
    private lateinit var statlogAustralianCreditApprovalMapper: StatlogAustralianCreditApprovalMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<StatlogAustralianCreditApprovalDO>> {
        val candyResult = CandyResult<List<StatlogAustralianCreditApprovalDO>>()

        val statlogAustralianCreditApprovalDOList = statlogAustralianCreditApprovalMapper.listAll()

        candyResult.data = statlogAustralianCreditApprovalDOList
        candyResult.isSuccess = true
        return candyResult
    }

}