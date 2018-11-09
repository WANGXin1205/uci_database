package com.growlithe.uci.mysql.database.post.service

import com.growlithe.uci.mysql.database.poker.service.PokeHandService
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 上午2:15
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class PostOperativePatientServiceTest{

    @Resource
    lateinit var postOperativePatientService: PostOperativePatientService

    @Test
    fun listAllTest() {
        val candyResult = postOperativePatientService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}