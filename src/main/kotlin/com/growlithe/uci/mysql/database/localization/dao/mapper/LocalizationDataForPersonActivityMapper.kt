package com.growlithe.uci.mysql.database.localization.dao.mapper

import com.growlithe.uci.mysql.database.localization.dao.domain.LocalizationDataForPersonActivityDO

interface LocalizationDataForPersonActivityMapper {
    /**
     * 查询所有的 人员定位数据集
     *
     * @return
     */
    fun listAll(): List<LocalizationDataForPersonActivityDO>
}