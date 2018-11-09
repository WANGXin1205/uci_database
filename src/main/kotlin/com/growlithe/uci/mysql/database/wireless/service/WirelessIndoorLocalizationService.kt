package com.growlithe.uci.mysql.database.wireless.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.wireless.dao.domain.WirelessIndoorLocalizationDO
import com.growlithe.uci.mysql.database.wireless.dao.mapper.WirelessIndoorLocalizationMapper
import com.growlithe.uci.mysql.database.yeast.dao.domain.YeastDO
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
class WirelessIndoorLocalizationService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(WirelessIndoorLocalizationService::class.java)
    }

    @Resource
    private lateinit var wirelessIndoorLocalizationMapper: WirelessIndoorLocalizationMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<WirelessIndoorLocalizationDO>> {
        val candyResult = CandyResult<List<WirelessIndoorLocalizationDO>>()

        val yeastDOList = wirelessIndoorLocalizationMapper.listAll()

        candyResult.data = yeastDOList
        candyResult.isSuccess = true
        return candyResult
    }

}