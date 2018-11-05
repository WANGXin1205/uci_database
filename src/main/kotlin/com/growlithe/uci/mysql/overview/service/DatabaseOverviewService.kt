package com.growlithe.uci.mysql.overview.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.config.ExcelDataConfigure
import com.growlithe.uci.mysql.excel.utils.ListDOFromExcelUtils
import com.growlithe.uci.mysql.overview.dao.mapper.DatabaseOverviewMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile
import javax.annotation.Resource

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午5:01
 * @Description
 */
@Service
@Transactional
class DatabaseOverviewService {

    companion object {

        private val LOGGER = LoggerFactory.getLogger(DatabaseOverviewService::class.java)
    }

    @Resource
    private lateinit var databaseOverviewMapper: DatabaseOverviewMapper


    /**
     * 数据集概况 数据保存至数据库
     *
     * @param multipartFile
     */
    @Transactional
    fun save(multipartFile: MultipartFile): CandyResult<Void> {
        val candyResult = CandyResult<Void>()

        // 数据转换 Excel 数据 转换为 DatabaseOverviewBean
        val getDataMapFromExcelResult = ListDOFromExcelUtils.getDataMapFromExcel(multipartFile, ExcelDataConfigure.DATABASE_OVERVIEW_DATA_NAME)
        if (!getDataMapFromExcelResult.isSuccess) {
            LOGGER.warn(getDataMapFromExcelResult.message)
            candyResult.message = getDataMapFromExcelResult.message
            return candyResult
        }

        // 获取 DatabaseOverviewBean 并进行入参检查
        val dataMap = getDataMapFromExcelResult.data

        // 将Excel转换的dataMap数据 变为 abaloneDOList
        val listDatabaseOverviewDOFromDataMapResult = ListDOFromExcelUtils.listDatabaseOverviewDOFromDataMap(dataMap!!)
        if (!listDatabaseOverviewDOFromDataMapResult.isSuccess) {
            LOGGER.warn(listDatabaseOverviewDOFromDataMapResult.message)
            candyResult.message = listDatabaseOverviewDOFromDataMapResult.message
            return candyResult
        }

        val databaseOverviewDOList = listDatabaseOverviewDOFromDataMapResult.data

        // 数据保存至数据库
        databaseOverviewMapper.saveBatch(databaseOverviewDOList)

        candyResult.isSuccess = true
        return candyResult
    }


}