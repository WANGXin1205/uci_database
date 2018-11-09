package com.growlithe.uci.mysql.database.htru.service

import com.growlithe.uci.mysql.database.hepatitis.service.HepatitisService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/6 上午9:12
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class HtruServiceTest {

    @Resource
    lateinit var htruService: HtruService

    @Test
    fun listAllTest() {
        val candyResult = htruService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}