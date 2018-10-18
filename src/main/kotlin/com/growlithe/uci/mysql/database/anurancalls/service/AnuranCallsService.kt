package com.growlithe.uci.mysql.database.anurancalls.service

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.abalone.dao.mapper.AbaloneMapper
import com.growlithe.uci.mysql.database.anurancalls.dao.mapper.AnuranCallsMapper
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
class AnuranCallsService {

    companion object {

        private val LOGGER = LoggerFactory.getLogger(AnuranCallsService::class.java)
    }

    @Resource
    private lateinit var anuranCallsMapper: AnuranCallsMapper


    /**
     * excel 无尾目类动物叫声数据集 数据保存至数据库
     *
     * @param multipartFile
     */
    @Transactional
    fun save(multipartFile: MultipartFile): CandyResult<Void> {
        val candyResult = CandyResult<Void>()

        // 数据转换 Excel 无尾目类动物叫声数据集的数据转换为 DO
        val getDataMapFromExcelResult = ListDOFromExcelUtils.getDataMapFromExcel(multipartFile, ExcelDataConfigure.ANURAN_CALLS_DATA_NAME)
        if (!getDataMapFromExcelResult.isSuccess) {
            LOGGER.warn(getDataMapFromExcelResult.message)
            candyResult.message = getDataMapFromExcelResult.message
            return candyResult
        }

        // AnuranCallsDO 中每个属性不为空 入参检查
        val dataMap = getDataMapFromExcelResult.data

        // 将Excel转换的dataMap数据 变为 anuranCallsDOList
        val listAnuranCallsDOFromDataMapResult = ListDOFromExcelUtils.listAnuranCallsDOFromDataMap(dataMap!!)
        if (!listAnuranCallsDOFromDataMapResult.isSuccess) {
            LOGGER.warn(listAnuranCallsDOFromDataMapResult.message)
            candyResult.message = listAnuranCallsDOFromDataMapResult.message
            return candyResult
        }

        val anuranCallsDOList = listAnuranCallsDOFromDataMapResult.data!!

        // 数据保存至数据库
        anuranCallsMapper.saveBatch(anuranCallsDOList)

        candyResult.isSuccess = true
        return candyResult
    }


}