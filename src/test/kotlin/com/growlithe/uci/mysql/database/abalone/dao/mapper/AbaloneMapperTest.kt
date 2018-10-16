package com.growlithe.uci.mysql.database.abalone.dao.mapper

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午2:00
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AbaloneMapperTest {

    @Resource
    lateinit var abaloneMapper: AbaloneMapper

    @Test
    fun listAllTest() {
        val abaloneDOList = abaloneMapper.listAll()
        println(abaloneDOList)
    }

    @Test
    fun saveBatchTest() {
    }
}