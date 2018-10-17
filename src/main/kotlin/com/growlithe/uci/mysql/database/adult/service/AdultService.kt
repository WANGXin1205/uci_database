package com.growlithe.uci.mysql.database.adult.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.abalone.dao.mapper.AbaloneMapper
import com.growlithe.uci.mysql.database.adult.dao.mapper.AdultMapper
import com.growlithe.uci.mysql.excel.utils.ExcelDataConfigure
import com.growlithe.uci.mysql.excel.utils.ListDOFromExcelUtils
import com.growlithe.uci.mysql.excel.utils.enums.DataType
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
class AdultService {

    companion object {

        private val LOGGER = LoggerFactory.getLogger(AdultService::class.java)
    }

    @Resource
    private lateinit var adultMapper: AdultMapper


    /**
     * excel 人口数据集 数据保存至数据库
     *
     * @param multipartFile
     */
    @Transactional
    fun saveTrain(multipartFile: MultipartFile): CandyResult<Void>{
        return this.save(DataType.TRAIN,multipartFile)
    }

    /**
     * excel 人口数据集 数据保存至数据库
     *
     * @param multipartFile
     */
    @Transactional
    fun saveTest(multipartFile: MultipartFile): CandyResult<Void>{
        return this.save(DataType.TEST,multipartFile)
    }

    /**
     * excel 人口数据集 数据保存至数据库
     *
     * @param dataType
     * @param multipartFile
     */
    @Transactional
    fun save(dataType: DataType, multipartFile: MultipartFile): CandyResult<Void> {
        val candyResult = CandyResult<Void>()

        // 数据转换 Excel 人口数据集的数据转换为 DO
        val getDataMapFromExcelResult = ListDOFromExcelUtils.getDataMapFromExcel(multipartFile, ExcelDataConfigure.ADULT_DATA_NAME)
        if (!getDataMapFromExcelResult.isSuccess) {
            LOGGER.warn(getDataMapFromExcelResult.message)
            candyResult.message = getDataMapFromExcelResult.message
            return candyResult
        }

        // AdultDO 中每个属性不为空 入参检查
        val dataMap = getDataMapFromExcelResult.data

        // 将Excel转换的dataMap数据 变为 adultDOList
        val listAdultDOFromDataMapResult = ListDOFromExcelUtils.listAdultDOFromDataMap(dataType, dataMap!!)
        if (!listAdultDOFromDataMapResult.isSuccess) {
            LOGGER.warn(listAdultDOFromDataMapResult.message)
            candyResult.message = listAdultDOFromDataMapResult.message
            return candyResult
        }

        val adultDOList = listAdultDOFromDataMapResult.data

        // 数据保存至数据库
        adultMapper.saveBatch(adultDOList)

        candyResult.isSuccess = true
        return candyResult
    }


}