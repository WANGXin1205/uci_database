package com.growlithe.uci.mysql.database.yeast.service

import com.growlithe.uci.mysql.database.zoo.service.ZooService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/6 上午10:19
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class YeastServiceTest {

    @Resource
    lateinit var yeastService: YeastService

    @Test
    fun listAllTest() {
        val candyResult = yeastService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}