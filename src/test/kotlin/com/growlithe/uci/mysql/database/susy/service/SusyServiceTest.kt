package com.growlithe.uci.mysql.database.susy.service

import com.growlithe.uci.mysql.database.tic.service.TicTacToeEndgameService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/11 下午11:40
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class SusyServiceTest {

    @Resource
    lateinit var susyService: SusyService

    @Test
    fun listAllTest() {
        val candyResult = susyService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}