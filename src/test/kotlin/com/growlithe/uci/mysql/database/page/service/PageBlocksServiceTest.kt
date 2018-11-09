package com.growlithe.uci.mysql.database.page.service

import com.growlithe.uci.mysql.database.occupancy.service.OccupancyService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/8 下午8:43
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class PageBlocksServiceTest {

    @Resource
    lateinit var pageBlocksService: PageBlocksService

    @Test
    fun listAllTest() {
        val candyResult = pageBlocksService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}