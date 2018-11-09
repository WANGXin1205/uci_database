package com.growlithe.uci.mysql.database.statlogaustralian.service

import com.growlithe.uci.mysql.database.wireless.service.WirelessIndoorLocalizationService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 下午6:07
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class StatlogAustralianCreditApprovalServiceTest {

    @Resource
    lateinit var statlogAustralianCreditApprovalService: StatlogAustralianCreditApprovalService

    @Test
    fun listAllTest() {
        val candyResult = statlogAustralianCreditApprovalService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}