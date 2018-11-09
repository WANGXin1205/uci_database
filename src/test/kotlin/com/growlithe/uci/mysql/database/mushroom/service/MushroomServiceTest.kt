package com.growlithe.uci.mysql.database.mushroom.service

import com.growlithe.uci.mysql.database.monk.service.MonkProblemsService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/8 上午9:51
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class MushroomServiceTest {

    @Resource
    lateinit var mushroomService: MushroomService

    @Test
    fun listAllTest() {
        val candyResult = mushroomService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}