package com.growlithe.uci.mysql.database.absenteeism.dao.mapper;

import com.growlithe.uci.mysql.database.absenteeism.dao.domain.AbsenteeismAtWorkDO;

import java.util.List;

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
public interface AbsenteeismAtWorkMapper {

    /**
     * 查询所有的矿工数据
     *
     * @return
     */
    List<AbsenteeismAtWorkDO> listAll();

    /**
     * 保存矿工数据
     *
     * @param absenteeismAtWorkDOList
     * @return
     */
    Integer saveBatch(List<AbsenteeismAtWorkDO> absenteeismAtWorkDOList);
}
