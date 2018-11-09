package com.growlithe.uci.mysql.database.wireless.dao.mapper

import com.growlithe.uci.mysql.database.wireless.dao.domain.WirelessIndoorLocalizationDO
import com.growlithe.uci.mysql.database.yeast.dao.domain.YeastDO


interface WirelessIndoorLocalizationMapper {
    /**
     * 查询所有的 wifi信号确认室内空间数据集
     *
     * @return
     */
    fun listAll(): List<WirelessIndoorLocalizationDO>
}