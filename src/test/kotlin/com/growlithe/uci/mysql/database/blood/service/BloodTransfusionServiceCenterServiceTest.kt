package com.growlithe.uci.mysql.database.blood.service

import com.growlithe.uci.mysql.database.bankmarketing.service.BankMarketingService
import com.growlithe.uci.mysql.database.blood.dao.mapper.BloodTransfusionServiceCenterMapper
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/28 上午1:21
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class BloodTransfusionServiceCenterServiceTest {

    @Resource
    lateinit var bloodTransfusionServiceCenterService: BloodTransfusionServiceCenterService

    @Test
    fun listAllTest() {
        val candyResult = bloodTransfusionServiceCenterService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}