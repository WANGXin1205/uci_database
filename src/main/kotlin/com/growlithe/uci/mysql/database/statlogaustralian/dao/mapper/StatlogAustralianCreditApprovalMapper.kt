package com.growlithe.uci.mysql.database.statlogaustralian.dao.mapper

import com.growlithe.uci.mysql.database.skin.dao.domain.SkinSegmentationDO
import com.growlithe.uci.mysql.database.statlogaustralian.dao.domain.StatlogAustralianCreditApprovalDO


interface StatlogAustralianCreditApprovalMapper {
    /**
     * 查询所有的 信贷审批数据集
     *
     * @return
     */
    fun listAll(): List<StatlogAustralianCreditApprovalDO>
}