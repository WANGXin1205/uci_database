package com.growlithe.uci.mysql.database.banknote.service

import com.growlithe.uci.mysql.database.bankmarketing.service.BankMarketingService
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
class BanknoteAuthenticationServiceTest {

    @Resource
    lateinit var banknoteAuthenticationService: BanknoteAuthenticationService
    @Test
    fun listAllTest() {
        val candyResult = banknoteAuthenticationService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}