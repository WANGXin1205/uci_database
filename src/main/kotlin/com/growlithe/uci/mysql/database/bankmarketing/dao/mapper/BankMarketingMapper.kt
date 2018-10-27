package com.growlithe.uci.mysql.database.bankmarketing.dao.mapper

import com.growlithe.uci.mysql.database.bankmarketing.dao.domain.BankMarketingDO

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
interface BankMarketingMapper {

    /**
     * 查询所有的 银行营销数据集数据
     *
     * @return
     */
    fun listAll(): List<BankMarketingDO>

}
