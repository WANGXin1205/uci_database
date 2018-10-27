package com.growlithe.uci.mysql.database.balance.service

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/25 下午4:11
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class BalanceScaleServiceTest {

    @Resource
    lateinit var balanceScaleService: BalanceScaleService

    @Test
    fun listAllTest() {
        val candyResult = balanceScaleService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}