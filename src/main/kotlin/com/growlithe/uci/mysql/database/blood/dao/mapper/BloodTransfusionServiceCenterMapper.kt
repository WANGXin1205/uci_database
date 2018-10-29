package com.growlithe.uci.mysql.database.blood.dao.mapper

import com.growlithe.uci.mysql.database.blood.dao.domain.BloodTransfusionServiceCenterDO

/**
 * @Author : Growlithe
 * @Date : 2018/10/28 上午9:17
 * @Description 输血服务中心数据集
 */
interface BloodTransfusionServiceCenterMapper {

    /**
     * 查询所有的 输血服务中心数据集
     *
     * @return
     */
    fun listAll(): List<BloodTransfusionServiceCenterDO>

}
