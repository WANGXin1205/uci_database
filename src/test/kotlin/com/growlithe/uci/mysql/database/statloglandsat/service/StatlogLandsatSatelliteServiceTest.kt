package com.growlithe.uci.mysql.database.statloglandsat.service

import com.growlithe.uci.mysql.database.statlogheart.service.StatlogHeartService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 下午9:41
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class StatlogLandsatSatelliteServiceTest {

    @Resource
    lateinit var statlogLandsatSatelliteService: StatlogLandsatSatelliteService

    @Test
    fun listAllTest() {
        val candyResult = statlogLandsatSatelliteService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}