package com.growlithe.uci.mysql.database.abalone.dao.mapper;

import com.growlithe.uci.mysql.database.abalone.dao.domain.AbaloneDO;

import java.util.List;

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
public interface AbaloneMapper {

    /**
     * 查询所有的鲍鱼数据
     *
     * @return
     */
    List<AbaloneDO> listAll();

    /**
     * 保存鲍鱼数据
     *
     * @param abaloneDOList
     * @return
     */
    Integer saveBatch(List<AbaloneDO> abaloneDOList);
}
