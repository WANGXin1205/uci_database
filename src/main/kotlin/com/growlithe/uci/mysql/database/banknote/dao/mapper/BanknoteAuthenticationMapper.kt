package com.growlithe.uci.mysql.database.banknote.dao.mapper

import com.growlithe.uci.mysql.database.bankmarketing.dao.domain.BankMarketingDO
import com.growlithe.uci.mysql.database.banknote.dao.domain.BanknoteAuthenticationDO

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
interface BanknoteAuthenticationMapper {

    /**
     * 查询所有的 钞票认证数据集数据
     *
     * @return
     */
    fun listAll(): List<BanknoteAuthenticationDO>

}
