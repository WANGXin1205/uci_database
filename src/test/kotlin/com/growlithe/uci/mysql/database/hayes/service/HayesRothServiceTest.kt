package com.growlithe.uci.mysql.database.hayes.service

import com.growlithe.uci.mysql.database.haberman.service.HabermanSurvivalService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/5 下午10:49
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class HayesRothServiceTest {

    @Resource
    lateinit var hayesRothService: HayesRothService

    @Test
    fun listAllTest() {
        val candyResult = hayesRothService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}