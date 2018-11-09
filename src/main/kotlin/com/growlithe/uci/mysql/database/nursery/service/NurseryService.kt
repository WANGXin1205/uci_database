package com.growlithe.uci.mysql.database.nursery.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.localization.dao.domain.LocalizationDataForPersonActivityDO
import com.growlithe.uci.mysql.database.localization.dao.mapper.LocalizationDataForPersonActivityMapper
import com.growlithe.uci.mysql.database.magic.dao.domain.MagicGammaTelescopeDO
import com.growlithe.uci.mysql.database.magic.dao.mapper.MagicGammaTelescopeMapper
import com.growlithe.uci.mysql.database.mammographic.dao.domain.MammographicMassDO
import com.growlithe.uci.mysql.database.mammographic.dao.mapper.MammographicMassMapper
import com.growlithe.uci.mysql.database.monk.dao.domain.MonkProblemsDO
import com.growlithe.uci.mysql.database.monk.dao.mapper.MonkProblemsMapper
import com.growlithe.uci.mysql.database.mushroom.dao.domain.MushroomDO
import com.growlithe.uci.mysql.database.mushroom.dao.mapper.MushroomMapper
import com.growlithe.uci.mysql.database.nursery.dao.domain.NurseryDO
import com.growlithe.uci.mysql.database.nursery.dao.mapper.NurseryMapper
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
class NurseryService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(NurseryService::class.java)
    }

    @Resource
    private lateinit var nurseryMapper: NurseryMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<NurseryDO>> {
        val candyResult = CandyResult<List<NurseryDO>>()

        val nurseryDOList = nurseryMapper.listAll()

        candyResult.data = nurseryDOList
        candyResult.isSuccess = true
        return candyResult
    }

}