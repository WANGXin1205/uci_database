package com.growlithe.uci.mysql.database.anuran.service

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
 * @Date : 2018/10/18 下午5:11
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AnuranCallsServiceTest {

    @Resource
    lateinit var anuranCallsService: AnuranCallsService

    @Test
    fun saveTest() {
        val fileLocal = File("/Users/wangxin/Downloads/anuran_calls.xlsx")
        val fis = FileInputStream(fileLocal)
        val contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        val multipartFile = MockMultipartFile(fileLocal.name, fileLocal.name, contentType, fis)
        val candyResult = anuranCallsService.save(multipartFile)
        Assert.assertTrue(candyResult.isSuccess)
    }
}