package com.growlithe.uci.mysql.overview.service

import com.growlithe.uci.mysql.database.abalone.dao.domain.AbaloneDO
import com.growlithe.uci.utils.ObjectUtil
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
import kotlin.coroutines.experimental.buildIterator
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * @Author : Growlithe
 * @Date : 2018/10/22 下午1:41
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class DatabaseOverviewServiceTest {

    @Resource
    lateinit var databaseOverviewService: DatabaseOverviewService

    @Test
    fun saveTest() {
        val fileLocal = File("/Users/wangxin/Downloads/database_overview.xlsx")
        val fis = FileInputStream(fileLocal)
        val contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        val multipartFile = MockMultipartFile(fileLocal.name, fileLocal.name, contentType, fis)
        val candyResult = databaseOverviewService.save(multipartFile)
        Assert.assertTrue(candyResult.isSuccess)
    }


}