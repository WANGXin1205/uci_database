package com.growlithe.uci.mysql.database.abalone.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.abalone.dao.mapper.AbaloneMapper
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
class AbaloneService {

    companion object {

        private val LOGGER = LoggerFactory.getLogger(AbaloneService::class.java)
    }

    @Resource
    private lateinit var abaloneMapper: AbaloneMapper


    /**
     * excel 鲍鱼数据集 数据保存至数据库
     *
     * @param multipartFile
     */
    @Transactional
    fun save(multipartFile: MultipartFile): CandyResult<Void> {
        val candyResult = CandyResult<Void>()

        // 数据转换 Excel 鲍鱼数据集的数据转换为 DO
        val getDataMapFromExcelResult = ListDOFromExcelUtils.getDataMapFromExcel(multipartFile, ExcelDataConfigure.ABALONE_DATA_NAME)
        if (!getDataMapFromExcelResult.isSuccess) {
            LOGGER.warn(getDataMapFromExcelResult.message)
            candyResult.message = getDataMapFromExcelResult.message
            return candyResult
        }

        // AbaloneDO 中每个属性不为空 入参检查
        val dataMap = getDataMapFromExcelResult.data

        // 将Excel转换的dataMap数据 变为 abaloneDOList
        val listAbaloneDOFromDataMapResult = ListDOFromExcelUtils.listAbaloneDOFromDataMap(dataMap!!)
        if (!listAbaloneDOFromDataMapResult.isSuccess) {
            LOGGER.warn(listAbaloneDOFromDataMapResult.message)
            candyResult.message = listAbaloneDOFromDataMapResult.message
            return candyResult
        }

        val abaloneDOList = listAbaloneDOFromDataMapResult.data

        // 数据保存至数据库
        abaloneMapper.saveBatch(abaloneDOList)

        candyResult.isSuccess = true
        return candyResult
    }


}