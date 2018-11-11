package com.growlithe.uci.mysql.database.statlogvehicle.dao.mapper

import com.growlithe.uci.mysql.database.statlogshuttle.dao.domain.StatlogShuttleDO
import com.growlithe.uci.mysql.database.statlogvehicle.dao.domain.StatlogVehicleSilhouettesDO

interface StatlogVehicleSilhouettesMapper {
    /**
     * 查询所有的 车辆轮廓数据集
     *
     * @return
     */
    fun listAll(): List<StatlogVehicleSilhouettesDO>
}