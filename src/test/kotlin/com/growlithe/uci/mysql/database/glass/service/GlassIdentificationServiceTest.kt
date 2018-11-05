package com.growlithe.uci.mysql.database.glass.service

import com.growlithe.uci.mysql.database.fertility.service.FertilityService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午8:10
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class GlassIdentificationServiceTest {

    @Resource
    lateinit var glassIdentificationService: GlassIdentificationService

    @Test
    fun listAllTest() {
        val candyResult = glassIdentificationService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}