package com.growlithe.uci.mysql.database.fertility.service

import com.growlithe.uci.mysql.database.ecoli.service.EcoliService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午7:41
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class FertilityServiceTest {

    @Resource
    lateinit var fertilityService: FertilityService

    @Test
    fun listAllTest() {
        val candyResult = fertilityService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}