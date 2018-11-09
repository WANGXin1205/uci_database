package com.growlithe.uci.mysql.database.magic.dao.mapper

import com.growlithe.uci.mysql.database.magic.dao.domain.MagicGammaTelescopeDO

interface MagicGammaTelescopeMapper {
    /**
     * 查询所有的 神奇的伽马射线数据集
     *
     * @return
     */
    fun listAll(): List<MagicGammaTelescopeDO>
}