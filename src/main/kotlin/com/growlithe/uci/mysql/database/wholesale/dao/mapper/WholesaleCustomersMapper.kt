package com.growlithe.uci.mysql.database.wholesale.dao.mapper

import com.growlithe.uci.mysql.database.wholesale.dao.domain.WholesaleCustomersDO
import com.growlithe.uci.mysql.database.wine.dao.domain.WineDO

interface WholesaleCustomersMapper {
    /**
     * 查询所有的 客户批发数据集
     *
     * @return
     */
    fun listAll(): List<WholesaleCustomersDO>
}