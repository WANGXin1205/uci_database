package com.growlithe.uci.mysql.database.avila.service

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/24 下午9:25
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AvilaServiceTest {

    @Resource
    lateinit var avilaService: AvilaService

    @Test
    fun listAllTest() {
        val candyResult = avilaService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}