package com.growlithe.uci.mysql.database.nursery.service

import com.growlithe.uci.mysql.database.wireless.service.WirelessIndoorLocalizationService
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/8 下午1:09
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class NurseryServiceTest{

    @Resource
    lateinit var nurseryService: NurseryService

    @Test
    fun listAllTest() {
        val candyResult = nurseryService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }


}