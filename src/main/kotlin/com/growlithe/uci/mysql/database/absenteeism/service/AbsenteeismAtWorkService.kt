package com.growlithe.uci.mysql.database.absenteeism.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.absenteeism.dao.mapper.AbsenteeismAtWorkMapper
import com.growlithe.uci.mysql.excel.utils.ExcelDataConfigure
import com.growlithe.uci.mysql.excel.utils.ListDOFromExcelUtils
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
class AbsenteeismAtWorkService {

    companion object {

        private val LOGGER = LoggerFactory.getLogger(AbsenteeismAtWorkService::class.java)
    }

    @Resource
    private lateinit var absenteeismAtWorkMapper: AbsenteeismAtWorkMapper


    /**
     * excel 旷工数据集 数据保存至数据库
     * @param multipartFile
     */
    @Transactional
    fun save(multipartFile: MultipartFile): CandyResult<Void> {
        val candyResult = CandyResult<Void>()

        // 数据转换 Excel 旷工数据集的数据转换为 DO
        val getDataMapFromExcelResult = ListDOFromExcelUtils.getDataMapFromExcel(multipartFile, ExcelDataConfigure.ABSENTEEISM_DATA_NAME)
        if (!getDataMapFromExcelResult.isSuccess) {
            LOGGER.warn(getDataMapFromExcelResult.message)
            candyResult.message = getDataMapFromExcelResult.message
            return candyResult
        }

        // absenteeismAtWorkDO 中每个属性不为空 入参检查
        val dataMap = getDataMapFromExcelResult.data

        // 将Excel转换的dataMap数据 变为 absenteeismAtWorkDOList
        val listAbsenteeismAtWorkDOFromDataMapResult = ListDOFromExcelUtils.listAbsenteeismAtWorkDOFromDataMap(dataMap!!)
        if (!listAbsenteeismAtWorkDOFromDataMapResult.isSuccess) {
            LOGGER.warn(listAbsenteeismAtWorkDOFromDataMapResult.message)
            candyResult.message = listAbsenteeismAtWorkDOFromDataMapResult.message
            return candyResult
        }

        val absenteeismAtWorkList = listAbsenteeismAtWorkDOFromDataMapResult.data

        // 数据保存至数据库
        absenteeismAtWorkMapper.saveBatch(absenteeismAtWorkList)

        candyResult.isSuccess = true
        return candyResult
    }


}