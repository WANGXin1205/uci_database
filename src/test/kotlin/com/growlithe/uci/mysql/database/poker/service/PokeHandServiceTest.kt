package com.growlithe.uci.mysql.database.poker.service

import com.growlithe.uci.mysql.database.page.service.PageBlocksService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/8 下午9:42
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class PokeHandServiceTest {

    @Resource
    lateinit var pokeHandService: PokeHandService

    @Test
    fun listAllTest() {
        val candyResult = pokeHandService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}