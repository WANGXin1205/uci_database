package com.growlithe.uci.mysql.database.haberman.service

import com.growlithe.uci.mysql.database.glass.service.GlassIdentificationService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午8:24
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class HabermanSurvivalServiceTest {

    @Resource
    lateinit var habermanSurvivalService: HabermanSurvivalService

    @Test
    fun listAllTest() {
        val candyResult = habermanSurvivalService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}