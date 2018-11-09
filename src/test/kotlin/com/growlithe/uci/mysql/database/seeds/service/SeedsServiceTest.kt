package com.growlithe.uci.mysql.database.seeds.service

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
 * @Date : 2018/11/9 下午3:32
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class SeedsServiceTest {

    @Resource
    lateinit var seedsService: SeedsService

    @Test
    fun listAllTest() {
        val candyResult = seedsService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}