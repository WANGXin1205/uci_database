package com.growlithe.uci.mysql.database.wireless.service

import com.growlithe.uci.mysql.database.yeast.service.YeastService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/6 上午10:59
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class WirelessIndoorLocalizationServiceTest {

    @Resource
    lateinit var wirelessIndoorLocalizationService: WirelessIndoorLocalizationService

    @Test
    fun listAllTest() {
        val candyResult = wirelessIndoorLocalizationService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }


}