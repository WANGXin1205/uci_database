package com.growlithe.uci.mysql.database.tic.service

import com.growlithe.uci.mysql.database.user.service.UserKnowledgeModelingService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/11 下午10:19
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class TicTacToeEndgameServiceTest {

    @Resource
    lateinit var ticTacToeEndgameService: TicTacToeEndgameService

    @Test
    fun listAllTest() {
        val candyResult = ticTacToeEndgameService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}