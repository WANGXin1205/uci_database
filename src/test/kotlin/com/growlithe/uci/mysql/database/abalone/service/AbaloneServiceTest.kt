package com.growlithe.uci.mysql.database.abalone.service

import org.junit.Assert
import org.junit.Test

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.mock.web.MockMultipartFile
import org.springframework.test.context.junit4.SpringRunner
import java.io.File
import java.io.FileInputStream
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午10:08
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AbaloneServiceTest {

    @Resource
    lateinit var abaloneService: AbaloneService

    @Test
    fun saveTest(){
        val fileLocal = File("/Users/wangxin/Downloads/abalone.xlsx")
        val fis = FileInputStream(fileLocal)
        val contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        val multipartFile = MockMultipartFile(fileLocal.name, fileLocal.name, contentType, fis)
        val candyResult = abaloneService.save(multipartFile)
        Assert.assertTrue(candyResult.isSuccess)
    }
}