package com.growlithe.uci.mysql.database.absenteeism.service

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
 * @Date : 2018/10/16 下午5:41
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AbsenteeismAtWorkServiceTest {

    @Resource
    lateinit var absenteeismAtWorkService: AbsenteeismAtWorkService

    @Test
    fun saveTest() {
        val fileLocal = File("/Users/wangxin/Downloads/absenteeism_at_work.xls")
        val fis = FileInputStream(fileLocal)
        val contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        val multipartFile = MockMultipartFile(fileLocal.name, fileLocal.name, contentType, fis)
        val candyResult = absenteeismAtWorkService.save(multipartFile)
        Assert.assertTrue(candyResult.isSuccess)
    }
}