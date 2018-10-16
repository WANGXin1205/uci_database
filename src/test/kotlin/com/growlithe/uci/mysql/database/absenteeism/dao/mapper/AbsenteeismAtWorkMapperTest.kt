package com.growlithe.uci.mysql.database.absenteeism.dao.mapper

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import javax.annotation.Resource

import org.junit.Assert.*

/**
 * @Author : Growlithe
 * @Date : 2018/10/16 下午5:42
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AbsenteeismAtWorkMapperTest {

    @Resource
    lateinit var absenteeismAtWorkMapper: AbsenteeismAtWorkMapper


    @Test
    fun listAllTest() {
        val absenteeismAtWorkDOList = absenteeismAtWorkMapper.listAll();
        Assert.assertNotNull(absenteeismAtWorkDOList)
    }

    @Test
    fun saveBatchTest() {
    }
}