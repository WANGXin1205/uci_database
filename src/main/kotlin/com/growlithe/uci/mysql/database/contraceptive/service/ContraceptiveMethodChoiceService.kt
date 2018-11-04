package com.growlithe.uci.mysql.database.contraceptive.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.connect.dao.domain.ConnectDO
import com.growlithe.uci.mysql.database.connect.dao.mapper.ConnectMapper
import com.growlithe.uci.mysql.database.contraceptive.dao.domain.ContraceptiveMethodChoiceDO
import com.growlithe.uci.mysql.database.contraceptive.dao.mapper.ContraceptiveMethodChoiceMapper
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
class ContraceptiveMethodChoiceService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(ContraceptiveMethodChoiceService::class.java)
    }

    @Resource
    private lateinit var contraceptiveMethodChoiceMapper: ContraceptiveMethodChoiceMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<ContraceptiveMethodChoiceDO>> {
        val candyResult = CandyResult<List<ContraceptiveMethodChoiceDO>>()

        val connectDOList = contraceptiveMethodChoiceMapper.listAll()

        candyResult.data = connectDOList
        candyResult.isSuccess = true
        return candyResult
    }

}