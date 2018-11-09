package com.growlithe.uci.mysql.database.magic.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.localization.dao.domain.LocalizationDataForPersonActivityDO
import com.growlithe.uci.mysql.database.localization.dao.mapper.LocalizationDataForPersonActivityMapper
import com.growlithe.uci.mysql.database.magic.dao.domain.MagicGammaTelescopeDO
import com.growlithe.uci.mysql.database.magic.dao.mapper.MagicGammaTelescopeMapper
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
class MagicGammaTelescopeService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(MagicGammaTelescopeService::class.java)
    }

    @Resource
    private lateinit var magicGammaTelescopeMapper: MagicGammaTelescopeMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<MagicGammaTelescopeDO>> {
        val candyResult = CandyResult<List<MagicGammaTelescopeDO>>()

        val magicGammaTelescopeDOList = magicGammaTelescopeMapper.listAll()

        candyResult.data = magicGammaTelescopeDOList
        candyResult.isSuccess = true
        return candyResult
    }

}