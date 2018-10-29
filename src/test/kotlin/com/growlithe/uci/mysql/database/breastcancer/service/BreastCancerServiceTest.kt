package com.growlithe.uci.mysql.database.breastcancer.service

import com.growlithe.uci.mysql.database.blood.service.BloodTransfusionServiceCenterService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/28 下午1:12
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class BreastCancerServiceTest {

    @Resource
    lateinit var breastCancerService: BreastCancerService

    @Test
    fun listAllTest() {
        val candyResult = breastCancerService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}