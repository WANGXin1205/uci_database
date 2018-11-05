package com.growlithe.uci.mysql.database.defaultcredit.dao.mapper

import com.growlithe.uci.mysql.database.defaultcredit.dao.domain.DefaultOfCreditCardClientsDO

interface DefaultOfCreditCardClientsMapper {
    /**
     * 查询所有的 行用审计数据集
     *
     * @return
     */
    fun listAll(): List<DefaultOfCreditCardClientsDO>
}