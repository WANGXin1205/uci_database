package com.growlithe.uci.mysql.database.breastcancercoimbra.service

import com.growlithe.uci.mysql.database.breastcancer.service.BreastCancerService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/29 上午1:29
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class BreastCancerCoimbraServiceTest {

    @Resource
    lateinit var breastCancerCoimbraService: BreastCancerCoimbraService

    @Test
    fun listAllTest() {
        val candyResult = breastCancerCoimbraService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}