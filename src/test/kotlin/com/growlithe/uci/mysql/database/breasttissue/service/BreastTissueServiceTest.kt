package com.growlithe.uci.mysql.database.breasttissue.service

import com.growlithe.uci.mysql.database.breastcancercoimbra.service.BreastCancerCoimbraService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/29 下午5:45
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class BreastTissueServiceTest {

    @Resource
    lateinit var breastTissueService: BreastTissueService

    @Test
    fun listAllTest() {
        val candyResult = breastTissueService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}