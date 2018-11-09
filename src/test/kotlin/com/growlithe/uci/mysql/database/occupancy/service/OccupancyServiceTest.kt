package com.growlithe.uci.mysql.database.occupancy.service

import com.growlithe.uci.mysql.database.wireless.service.WirelessIndoorLocalizationService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/8 下午7:49
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class OccupancyServiceTest {

    @Resource
    lateinit var occupancyService: OccupancyService

    @Test
    fun listAllTest() {
        val candyResult = occupancyService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}