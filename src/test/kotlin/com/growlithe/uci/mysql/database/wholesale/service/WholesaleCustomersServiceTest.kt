package com.growlithe.uci.mysql.database.wholesale.service

import com.growlithe.uci.mysql.database.wine.service.WineService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/10 下午11:16
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class WholesaleCustomersServiceTest {

    @Resource
    lateinit var wholesaleCustomersService: WholesaleCustomersService

    @Test
    fun listAllTest() {
        val candyResult = wholesaleCustomersService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}