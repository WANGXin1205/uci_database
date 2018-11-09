package com.growlithe.uci.mysql.database.statloggerman.service

import com.growlithe.uci.mysql.database.statlogaustralian.service.StatlogAustralianCreditApprovalService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 下午6:24
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class StatlogGermanCreditDOServiceTest {

    @Resource
    lateinit var statlogGermanCreditService: StatlogGermanCreditService

    @Test
    fun listAllTest() {
        val candyResult = statlogGermanCreditService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}