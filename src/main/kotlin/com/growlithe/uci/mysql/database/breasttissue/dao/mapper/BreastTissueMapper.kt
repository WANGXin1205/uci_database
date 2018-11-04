package com.growlithe.uci.mysql.database.breasttissue.dao.mapper


import com.growlithe.uci.mysql.database.breasttissue.dao.domain.BreastTissueDO

interface BreastTissueMapper {
    /**
     * 查询所有的 乳腺组织数据集
     *
     * @return
     */
    fun listAll(): List<BreastTissueDO>
}