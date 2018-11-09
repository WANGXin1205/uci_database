package com.growlithe.uci.mysql.database.statlogshuttle.service

import com.growlithe.uci.mysql.database.statloglandsat.service.StatlogLandsatSatelliteService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 下午10:48
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class StatlogShuttleServiceTest {

    @Resource
    lateinit var statlogShuttleService: StatlogShuttleService

    @Test
    fun listAllTest() {
        val candyResult = statlogShuttleService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}