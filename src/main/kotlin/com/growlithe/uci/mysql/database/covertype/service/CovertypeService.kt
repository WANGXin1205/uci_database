package com.growlithe.uci.mysql.database.covertype.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.connect.dao.domain.ConnectDO
import com.growlithe.uci.mysql.database.connect.dao.mapper.ConnectMapper
import com.growlithe.uci.mysql.database.contraceptive.dao.domain.ContraceptiveMethodChoiceDO
import com.growlithe.uci.mysql.database.contraceptive.dao.mapper.ContraceptiveMethodChoiceMapper
import com.growlithe.uci.mysql.database.covertype.dao.domain.CovertypeDO
import com.growlithe.uci.mysql.database.covertype.dao.mapper.CovertypeMapper
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
class CovertypeService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(CovertypeService::class.java)
    }

    @Resource
    private lateinit var covertypeMapper: CovertypeMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<CovertypeDO>> {
        val candyResult = CandyResult<List<CovertypeDO>>()

        val covertypeDOList = covertypeMapper.listAll()

        candyResult.data = covertypeDOList
        candyResult.isSuccess = true
        return candyResult
    }

}