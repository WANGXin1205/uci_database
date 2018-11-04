package com.growlithe.uci.mysql.database.census.service

import com.growlithe.uci.mysql.database.car.service.CarEvaluationService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/2 下午5:51
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class CensusIncomeKddServiceTest {

    @Resource
    lateinit var censusIncomeKddService: CensusIncomeKddService

    @Test
    fun listAllTest() {
        val candyResult = censusIncomeKddService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}