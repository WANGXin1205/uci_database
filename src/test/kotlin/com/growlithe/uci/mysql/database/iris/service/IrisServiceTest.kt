package com.growlithe.uci.mysql.database.iris.service

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
 * @Date : 2018/11/6 下午9:55
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class IrisServiceTest {

    @Resource
    lateinit var irisService: IrisService

    @Test
    fun listAllTest() {
        val candyResult = irisService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }


}