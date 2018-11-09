package com.growlithe.uci.mysql.database.zoo.service

import com.growlithe.uci.mysql.database.htru.service.HtruService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/6 上午9:59
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class ZooServiceTest {

    @Resource
    lateinit var  zooService: ZooService

    @Test
    fun listAllTest() {
        val candyResult = zooService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}