package com.growlithe.uci.mysql.database.credit.dao.mapper

import com.growlithe.uci.mysql.database.covertype.dao.domain.CovertypeDO
import com.growlithe.uci.mysql.database.credit.dao.domain.CreditApprovalDO


interface CreditApprovalMapper {
    /**
     * 查询所有的 行用审计数据集
     *
     * @return
     */
    fun listAll(): List<CreditApprovalDO>
}