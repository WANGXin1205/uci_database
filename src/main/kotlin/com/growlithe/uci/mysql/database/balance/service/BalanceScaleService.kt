package com.growlithe.uci.mysql.database.balance.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.anuran.dao.mapper.AnuranCallsMapper
import com.growlithe.uci.mysql.config.ExcelDataConfigure
import com.growlithe.uci.mysql.database.avila.dao.domain.AvliaDO
import com.growlithe.uci.mysql.database.avila.dao.mapper.AvliaMapper
import com.growlithe.uci.mysql.database.balance.dao.domain.BalanceScaleDO
import com.growlithe.uci.mysql.database.balance.dao.mapper.BalanceScaleMapper
import com.growlithe.uci.mysql.excel.utils.ListDOFromExcelUtils
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午5:01
 * @Description
 */
@Service
@Transactional
class BalanceScaleService {

    companion object {

        private val LOGGER = LoggerFactory.getLogger(BalanceScaleService::class.java)
    }

    @Resource
    private lateinit var balanceScaleMapper: BalanceScaleMapper

    /**
     * 查询所有数据
     */
    fun listAll():CandyResult<List<BalanceScaleDO>>{
        val candyResult = CandyResult<List<BalanceScaleDO>>()

        val avliaDOList = balanceScaleMapper.listAll()

        candyResult.data = avliaDOList
        candyResult.isSuccess = true
        return candyResult
    }

}