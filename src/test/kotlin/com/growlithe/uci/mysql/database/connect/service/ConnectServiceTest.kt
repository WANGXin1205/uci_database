package com.growlithe.uci.mysql.database.connect.service

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/4 下午10:43
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class ConnectServiceTest {

    @Resource
    lateinit var connectService: ConnectService

    @Test
    fun listAllTest() {
        val candyResult = connectService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}