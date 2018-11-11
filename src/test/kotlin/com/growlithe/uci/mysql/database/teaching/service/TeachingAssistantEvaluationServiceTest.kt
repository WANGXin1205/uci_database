package com.growlithe.uci.mysql.database.teaching.service

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
 * @Date : 2018/11/12 上午12:43
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class TeachingAssistantEvaluationServiceTest {

    @Resource
    lateinit var teachingAssistantEvaluationService: TeachingAssistantEvaluationService

    @Test
    fun listAllTest() {
        val candyResult = teachingAssistantEvaluationService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }
}