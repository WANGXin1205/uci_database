package com.growlithe.uci.mysql.database.ecoli.service

import com.growlithe.uci.mysql.database.defaultcredit.service.DefaultOfCreditCardClientsService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午6:11
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class EcoliServiceTest {

    @Resource
    lateinit var ecoliService: EcoliService

    @Test
    fun listAllTest() {
        val candyResult = ecoliService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }


}