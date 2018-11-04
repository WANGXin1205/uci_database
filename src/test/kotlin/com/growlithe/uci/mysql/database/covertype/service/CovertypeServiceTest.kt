package com.growlithe.uci.mysql.database.covertype.service

import com.growlithe.uci.mysql.database.contraceptive.service.ContraceptiveMethodChoiceService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 上午12:23
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class CovertypeServiceTest {

    @Resource
    lateinit var covertypeService: CovertypeService

    @Test
    fun listAllTest() {
        val candyResult = covertypeService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}