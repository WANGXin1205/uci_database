package com.growlithe.uci.mysql.database.user.service

import com.growlithe.uci.mysql.overview.service.DatabaseOverviewService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.mock.web.MockMultipartFile
import org.springframework.test.context.junit4.SpringRunner
import java.io.File
import java.io.FileInputStream
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/11 下午8:58
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class UserKnowledgeModelingServiceTest {

    @Resource
    lateinit var userKnowledgeModelingService: UserKnowledgeModelingService

    @Test
    fun listAllTest() {
        val candyResult = userKnowledgeModelingService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}