package com.growlithe.uci.mysql.database.bankmarketing.service

import com.growlithe.uci.mysql.database.balance.service.BalanceScaleService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:05
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class BankMarketingServiceTest {

    @Resource
    lateinit var bankMarketingService: BankMarketingService

    @Test
    fun listAllTest() {
        val candyResult = bankMarketingService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}