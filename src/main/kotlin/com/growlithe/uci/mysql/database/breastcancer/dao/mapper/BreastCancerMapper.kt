package com.growlithe.uci.mysql.database.breastcancer.dao.mapper


import com.growlithe.uci.mysql.database.breastcancer.dao.domain.BreastCancerDO

interface BreastCancerMapper {

    /**
     * 查询所有的 乳腺癌数据集
     *
     * @return
     */
    fun listAll(): List<BreastCancerDO>
}