package com.growlithe.uci.mysql.database.chessrookvspawn.service

import com.growlithe.uci.mysql.database.chessrookvsking.service.ChessRookVsKingService
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
class ChessRookVsPawnServiceTest {

    @Resource
    lateinit var chessRookVsPawnService: ChessRookVsPawnService

    @Test
    fun listAllTest() {
        val candyResult = chessRookVsPawnService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}