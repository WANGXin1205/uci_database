package com.growlithe.uci.mysql.database.adult.dao.mapper;

import com.growlithe.uci.mysql.database.abalone.dao.domain.AbaloneDO;
import com.growlithe.uci.mysql.database.adult.dao.domain.AdultDO;

import java.util.List;

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
public interface AdultMapper {

    /**
     * 查询所有的人口数据
     *
     * @return
     */
    List<AdultDO> listAll();

    /**
     * 保存人口数据
     *
     * @param adultDOList
     * @return
     */
    Integer saveBatch(List<AdultDO> adultDOList);
}
