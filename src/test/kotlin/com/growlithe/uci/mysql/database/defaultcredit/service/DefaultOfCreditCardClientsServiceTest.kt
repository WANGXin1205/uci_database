package com.growlithe.uci.mysql.database.defaultcredit.service

import com.growlithe.uci.mysql.database.credit.service.CreditApprovalService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午4:13
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class DefaultOfCreditCardClientsServiceTest {

    @Resource
    lateinit var defaultOfCreditCardClientsService: DefaultOfCreditCardClientsService

    @Test
    fun listAllTest() {
        val candyResult = defaultOfCreditCardClientsService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}