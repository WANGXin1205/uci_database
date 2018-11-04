package com.growlithe.uci.mysql.database.car.service

import com.growlithe.uci.mysql.database.breasttissue.service.BreastTissueService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/29 下午6:21
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class CarEvaluationServiceTest {

    @Resource
    lateinit var carEvaluationService: CarEvaluationService

    @Test
    fun listAllTest() {
        val candyResult = carEvaluationService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}