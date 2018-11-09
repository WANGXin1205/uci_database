package com.growlithe.uci.mysql.database.record.service

import com.growlithe.uci.mysql.database.wireless.service.WirelessIndoorLocalizationService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/9 上午9:53
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class RecordLinkageComparisonPatternsServiceTest {

    @Resource
    lateinit var recordLinkageComparisonPatternsService: RecordLinkageComparisonPatternsService

    @Test
    fun listAllTest() {
        val candyResult = recordLinkageComparisonPatternsService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}