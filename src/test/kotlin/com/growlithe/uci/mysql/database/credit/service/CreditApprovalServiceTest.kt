package com.growlithe.uci.mysql.database.credit.service

import com.growlithe.uci.mysql.database.covertype.service.CovertypeService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 上午12:50
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class CreditApprovalServiceTest {

    @Resource
    lateinit var creditApprovalService: CreditApprovalService

    @Test
    fun listAllTest() {
        val candyResult = creditApprovalService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}