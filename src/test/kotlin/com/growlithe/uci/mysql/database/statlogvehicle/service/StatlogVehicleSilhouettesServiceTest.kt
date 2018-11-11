package com.growlithe.uci.mysql.database.statlogvehicle.service

import com.growlithe.uci.mysql.database.wholesale.service.WholesaleCustomersService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/11 下午8:27
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class StatlogVehicleSilhouettesServiceTest {

    @Resource
    lateinit var statlogVehicleSilhouettesService: StatlogVehicleSilhouettesService

    @Test
    fun listAllTest() {
        val candyResult = statlogVehicleSilhouettesService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}