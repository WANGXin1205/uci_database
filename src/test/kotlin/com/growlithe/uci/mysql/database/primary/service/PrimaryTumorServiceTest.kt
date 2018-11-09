package com.growlithe.uci.mysql.database.primary.service

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
 * @Date : 2018/11/9 上午8:33
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class PrimaryTumorServiceTest {

    @Resource
    lateinit var primaryTumorService: PrimaryTumorService

    @Test
    fun listAllTest() {
        val candyResult = primaryTumorService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}