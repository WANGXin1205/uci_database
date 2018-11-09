package com.growlithe.uci.mysql.database.skin.service

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
 * @Date : 2018/11/9 下午4:21
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class SkinSegmentationServiceTest {

    @Resource
    lateinit var skinSegmentationService: SkinSegmentationService

    @Test
    fun listAllTest() {
        val candyResult = skinSegmentationService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}