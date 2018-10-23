package com.growlithe.uci.mysql.overview.dao.mapper;

import com.growlithe.uci.mysql.database.abalone.dao.domain.AbaloneDO;
import com.growlithe.uci.mysql.overview.dao.domain.DatabaseOverviewDO;

import java.util.List;

/**
 * @Author : Growlithe
 * @Date : 2018/5/19 11:32
 * @Description
 */
public interface DatabaseOverviewMapper {

    /**
     * 查询所有的数据集信息
     *
     * @return
     */
    List<DatabaseOverviewDO> listAll();

    /**
     * 保存数据集
     *
     * @param abaloneDOList
     * @return
     */
    Integer saveBatch(List<DatabaseOverviewDO> abaloneDOList);
}
