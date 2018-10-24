package com.growlithe.uci.mysql.database.anuran.dao.mapper

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/18 下午11:12
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class AnuranCallsMapperTest {

    @Resource
    lateinit var anuranCallsMapper: AnuranCallsMapper

    @Test
    fun listAllTest() {
        val anuranCallsList = anuranCallsMapper.listAll()
        println(anuranCallsList)
    }
}