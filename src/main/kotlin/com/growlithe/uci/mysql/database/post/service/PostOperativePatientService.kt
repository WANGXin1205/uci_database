package com.growlithe.uci.mysql.database.post.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.poker.dao.domain.PokeHandDO
import com.growlithe.uci.mysql.database.post.dao.domain.PostOperativePatientDO
import com.growlithe.uci.mysql.database.post.dao.mapper.PostOperativePatientMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description
 */
@Service
@Transactional
class PostOperativePatientService {
    companion object {

        private val LOGGER = LoggerFactory.getLogger(PostOperativePatientService::class.java)
    }

    @Resource
    private lateinit var postOperativePatientMapper: PostOperativePatientMapper

    /**
     * 查询所有数据
     */
    fun listAll(): CandyResult<List<PostOperativePatientDO>> {
        val candyResult = CandyResult<List<PostOperativePatientDO>>()

        val postOperativePatientDOList = postOperativePatientMapper.listAll()

        candyResult.data = postOperativePatientDOList
        candyResult.isSuccess = true
        return candyResult
    }

}