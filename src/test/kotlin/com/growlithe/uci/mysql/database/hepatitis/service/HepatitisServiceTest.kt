package com.growlithe.uci.mysql.database.hepatitis.service

import com.growlithe.uci.mysql.database.hayes.service.HayesRothService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午11:52
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class HepatitisServiceTest {

    @Resource
    lateinit var hepatitisService: HepatitisService

    @Test
    fun listAllTest() {
        val candyResult = hepatitisService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}