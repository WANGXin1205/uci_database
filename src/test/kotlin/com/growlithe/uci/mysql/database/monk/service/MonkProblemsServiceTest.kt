package com.growlithe.uci.mysql.database.monk.service

import com.growlithe.uci.mysql.database.yeast.service.YeastService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/8 上午9:03
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class MonkProblemsServiceTest {

    @Resource
    lateinit var monkProblemsService: MonkProblemsService

    @Test
    fun listAllTest() {
        val candyResult = monkProblemsService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}