package com.growlithe.uci.mysql.database.wine.service

import com.growlithe.uci.mysql.database.statlogshuttle.service.StatlogShuttleService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/10 下午8:38
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class WineServiceTest {

    @Resource
    lateinit var wineService: WineService

    @Test
    fun listAllTest() {
        val candyResult = wineService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}