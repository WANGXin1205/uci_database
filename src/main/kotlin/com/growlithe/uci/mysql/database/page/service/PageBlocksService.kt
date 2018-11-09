package com.growlithe.uci.mysql.database.page.service

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
import com.growlithe.uci.mysql.database.occupancy.dao.domain.OccupancyDO
import com.growlithe.uci.mysql.database.occupancy.dao.mapper.OccupancyMapper
import com.growlithe.uci.mysql.database.page.dao.domain.PageBlocksDO
import com.growlithe.uci.mysql.database.page.dao.mapper.PageBlocksMapper
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
class PageBlocksService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(PageBlocksService::class.java)
    }

    @Resource
    private lateinit var pageBlocksMapper: PageBlocksMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<PageBlocksDO>> {
        val candyResult = CandyResult<List<PageBlocksDO>>()

        val pageBlocksDOList = pageBlocksMapper.listAll()

        candyResult.data = pageBlocksDOList
        candyResult.isSuccess = true
        return candyResult
    }

}