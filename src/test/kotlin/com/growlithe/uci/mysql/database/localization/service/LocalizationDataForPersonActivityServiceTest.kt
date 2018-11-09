package com.growlithe.uci.mysql.database.localization.service

import com.growlithe.uci.mysql.database.letter.service.LetterRecognitionService
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/11/7 下午4:52
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class LocalizationDataForPersonActivityServiceTest {

    @Resource
    lateinit var localizationDataForPersonActivityService: LocalizationDataForPersonActivityService

    @Test
    fun listAllTest() {
        val candyResult = localizationDataForPersonActivityService.listAll()
        Assert.assertTrue(candyResult.isSuccess)
    }

}