package com.growlithe.uci.mysql.database.adult.service

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
 * @Date : 2018/10/17 下午3:26
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AdultServiceTest {

    @Resource
    lateinit var adultService: AdultService

    @Test
    fun saveTrainTest() {
        val fileLocal = File("/Users/wangxin/Downloads/adult_data.xlsx")
        val fis = FileInputStream(fileLocal)
        val contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        val multipartFile = MockMultipartFile(fileLocal.name, fileLocal.name, contentType, fis)
        val candyResult = adultService.saveTrain(multipartFile)
        Assert.assertTrue(candyResult.isSuccess)
    }

    @Test
    fun saveTestTest() {
        val fileLocal = File("/Users/wangxin/Downloads/adult_test.xlsx")
        val fis = FileInputStream(fileLocal)
        val contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        val multipartFile = MockMultipartFile(fileLocal.name, fileLocal.name, contentType, fis)
        val candyResult = adultService.saveTest(multipartFile)
        Assert.assertTrue(candyResult.isSuccess)
    }

}