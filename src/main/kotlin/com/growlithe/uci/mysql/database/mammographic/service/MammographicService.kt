package com.growlithe.uci.mysql.database.mammographic.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.localization.dao.domain.LocalizationDataForPersonActivityDO
import com.growlithe.uci.mysql.database.localization.dao.mapper.LocalizationDataForPersonActivityMapper
import com.growlithe.uci.mysql.database.magic.dao.domain.MagicGammaTelescopeDO
import com.growlithe.uci.mysql.database.magic.dao.mapper.MagicGammaTelescopeMapper
import com.growlithe.uci.mysql.database.mammographic.dao.domain.MammographicMassDO
import com.growlithe.uci.mysql.database.mammographic.dao.mapper.MammographicMassMapper
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
class MammographicService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(MammographicService::class.java)
    }

    @Resource
    private lateinit var mammographicMapper: MammographicMassMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<MammographicMassDO>> {
        val candyResult = CandyResult<List<MammographicMassDO>>()

        val mammographicMassDOList = mammographicMapper.listAll()

        candyResult.data = mammographicMassDOList
        candyResult.isSuccess = true
        return candyResult
    }

}