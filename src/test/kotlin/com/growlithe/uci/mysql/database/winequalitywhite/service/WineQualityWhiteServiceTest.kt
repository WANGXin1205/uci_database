package com.growlithe.uci.mysql.database.winequalitywhite.service

import com.growlithe.uci.mysql.database.wine.service.WineService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/10 下午10:06
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class WineQualityWhiteServiceTest {


    @Resource
    lateinit var wineQualityWhiteService: WineQualityWhiteService

    @Test
    fun listAllTest() {
        val candyResult = wineQualityWhiteService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}