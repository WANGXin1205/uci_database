package com.growlithe.uci.mysql.database.anuran.dao.mapper

import com.growlithe.uci.mysql.database.anuran.dao.domain.AnuranCallsDO

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
interface AnuranCallsMapper {

    /**
     * 查询所有的 无尾目类动物叫声数据集
     *
     * @return
     */
    fun listAll(): List<AnuranCallsDO>

    /**
     * 保存 无尾目类动物叫声数据
     *
     * @param anuranCallsDOList
     * @return
     */
    fun saveBatch(anuranCallsDOList: MutableList<AnuranCallsDO>): Int?
}
