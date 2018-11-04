package com.growlithe.uci.mysql.database.chessrookvsking.service

import com.growlithe.uci.mysql.database.census.service.CensusIncomeKddService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/4 下午7:10
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class ChessRookVsKingServiceTest {

    @Resource
    lateinit var chessRookVsKingService: ChessRookVsKingService

    @Test
    fun listAllTest() {
        val candyResult = chessRookVsKingService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}