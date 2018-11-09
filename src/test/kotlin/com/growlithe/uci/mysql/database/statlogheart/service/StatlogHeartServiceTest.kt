package com.growlithe.uci.mysql.database.statlogheart.service

import com.growlithe.uci.mysql.database.statloggerman.service.StatlogGermanCreditService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 下午9:14
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class StatlogHeartServiceTest {

    @Resource
    lateinit var statlogHeartService: StatlogHeartService

    @Test
    fun listAllTest() {
        val candyResult = statlogHeartService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}