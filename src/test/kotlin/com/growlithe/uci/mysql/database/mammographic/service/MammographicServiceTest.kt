package com.growlithe.uci.mysql.database.mammographic.service

import com.growlithe.uci.mysql.database.yeast.service.YeastService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/7 下午6:11
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class MammographicServiceTest {

    @Resource
    lateinit var mammographicService: MammographicService

    @Test
    fun listAllTest() {
        val candyResult = mammographicService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}