package com.growlithe.uci.mysql.database.congressional.service

import org.junit.Assert
import org.junit.Test

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/4 下午10:19
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class CongressionalVotingRecordsServiceTest {

    @Resource
    lateinit var congressionalVotingRecordsService: CongressionalVotingRecordsService

    @Test
    fun listAllTest() {
        val candyResult = congressionalVotingRecordsService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}