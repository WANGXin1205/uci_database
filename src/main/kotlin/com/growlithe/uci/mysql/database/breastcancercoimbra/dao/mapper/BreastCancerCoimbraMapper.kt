package com.growlithe.uci.mysql.database.breastcancercoimbra.dao.mapper


import com.growlithe.uci.mysql.database.breastcancercoimbra.dao.domain.BreastCancerCoimbraDO

interface BreastCancerCoimbraMapper {
    /**
     * 查询所有的 乳腺癌数据集
     *
     * @return
     */
    fun listAll(): List<BreastCancerCoimbraDO>
}