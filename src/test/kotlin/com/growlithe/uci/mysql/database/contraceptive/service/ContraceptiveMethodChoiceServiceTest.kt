package com.growlithe.uci.mysql.database.contraceptive.service

import com.growlithe.uci.mysql.database.connect.service.ConnectService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/4 下午11:04
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class ContraceptiveMethodChoiceServiceTest {

    @Resource
    lateinit var contraceptiveMethodChoiceService: ContraceptiveMethodChoiceService

    @Test
    fun listAllTest() {
        val candyResult = contraceptiveMethodChoiceService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}