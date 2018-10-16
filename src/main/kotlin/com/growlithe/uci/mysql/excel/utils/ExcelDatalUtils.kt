package com.growlithe.uci.mysql.excel.utils

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.database.abalone.dao.domain.AbaloneDO
import com.growlithe.uci.mysql.database.absenteeism.dao.domain.AbsenteeismAtWorkDO
import com.growlithe.uci.utils.POIUtils
import org.springframework.web.multipart.MultipartFile
import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午5:52
 * @Description
 */
object ExcelDataUtils {

    /**
     * 从excel数据中获取Map集合
     *
     * @param multipartFile
     * @param columnName
     */
    fun getDataMapFromExcel(multipartFile: MultipartFile, columnName: Array<String>): CandyResult<Map<Int, Array<String>>> {
        var candyResult = CandyResult<Map<Int, Array<String>>>()

        // 简单校验数据
        val validateExcelResult = POIUtils.validateExcel(multipartFile, columnName)
        if (!validateExcelResult.isSuccess) {
            candyResult.message = validateExcelResult.message
            return candyResult
        }

        val workbook = POIUtils.getWorkbook(multipartFile)

        //拿第一页
        val sheet = workbook.getSheetAt(ExcelDataConfigure.DEFAULT_SHEET)
        val dataMap = POIUtils.getDataMap(sheet, ExcelDataConfigure.DEFAULT_BEGIN_ROW_INDEX, columnName.size)

        candyResult.data = dataMap
        candyResult.isSuccess = true
        return candyResult
    }

    /**
     * 从dataMap 转换成 鲍鱼集 数据
     *
     * @param dataMap
     */
    fun getAbaloneDOListFromDataMap(dataMap: Map<Int, Array<String>>): CandyResult<MutableList<AbaloneDO>> {
        val candyResult = CandyResult<MutableList<AbaloneDO>>()

        val abaloneDOList = mutableListOf<AbaloneDO>()
        for (index: Int in dataMap.keys) {
            val abaloneDO = AbaloneDO()
            val data = dataMap[index]!!
            abaloneDO.sex = data[ExcelDataConfigure.ABALONE_DATA_SEX_INDEX]
            try {
                abaloneDO.length = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_LENGTH_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_LENGTH_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.diameter = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_DIAMETER_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_DIAMETER_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.height = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_HEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_HEIGHT_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.wholeWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_WHOLE_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_WHOLE_WEIGHT_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.shuckedWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_SHUCKED_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_SHUCKED_WEIGHT_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.visceraWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_VISCERA_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_VISCERA_WEIGHT_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.shellWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_SHELL_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_SHELL_WEIGHT_INDEX + "is not num"
                return candyResult
            }
            try {
                abaloneDO.rings = data[ExcelDataConfigure.ABALONE_DATA_RINGS_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = " " + ExcelDataConfigure.ABALONE_DATA_RINGS_INDEX + "is not int"
                return candyResult
            }

            abaloneDOList.add(abaloneDO)
        }

        candyResult.data = abaloneDOList
        candyResult.isSuccess = true
        return candyResult
    }

    /**
     * 从dataMap 转换成 旷工集 数据
     *
     * @param dataMap
     */
    fun getAbsenteeismAtWorkDOListFromDataMap(dataMap: Map<Int, Array<String>>): CandyResult<MutableList<AbsenteeismAtWorkDO>> {
        val candyResult = CandyResult<MutableList<AbsenteeismAtWorkDO>>()

        val absenteeismAtWorkDOList = mutableListOf<AbsenteeismAtWorkDO>()

        for (index: Int in dataMap.keys) {
            val absenteeismAtWorkDO = AbsenteeismAtWorkDO()
            val data = dataMap[index]!!
            try {
                absenteeismAtWorkDO.originId = data[ExcelDataConfigure.ABSENTEEISM_ORIGIN_ID_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_ORIGIN_ID_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.reasonForAbsence = data[ExcelDataConfigure.ABSENTEEISM_REASON_FOR_ABSENCE_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_REASON_FOR_ABSENCE_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.monthOfAbsence = data[ExcelDataConfigure.ABSENTEEISM_MONTH_OF_ABSENCE_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_MONTH_OF_ABSENCE_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.dayOfWeek = data[ExcelDataConfigure.ABSENTEEISM_DAY_OF_WEEK_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_DAY_OF_WEEK_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.seasons = data[ExcelDataConfigure.ABSENTEEISM_SEASONS_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_SEASONS_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.transportationExpense = data[ExcelDataConfigure.ABSENTEEISM_TRANSPORTATION_EXPENSE_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_TRANSPORTATION_EXPENSE_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.distanceFromResidenceToWork = data[ExcelDataConfigure.ABSENTEEISM_DISTANCE_FROM_RESIDENCE_TO_WORK_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_DISTANCE_FROM_RESIDENCE_TO_WORK_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.serviceTime = data[ExcelDataConfigure.ABSENTEEISM_SERVICE_TIME_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_SERVICE_TIME_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.age = data[ExcelDataConfigure.ABSENTEEISM_AGE_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_AGE_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.workLoadAverageOfDay = data[ExcelDataConfigure.ABSENTEEISM_WORK_LOAD_AVERAGE_OF_DAY_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_WORK_LOAD_AVERAGE_OF_DAY_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.hitTarget = data[ExcelDataConfigure.ABSENTEEISM_HITTARGET_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_HITTARGET_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.disciplinaryFailure = data[ExcelDataConfigure.ABSENTEEISM_DISCIPLINARY_FAILURE_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_DISCIPLINARY_FAILURE_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.education = data[ExcelDataConfigure.ABSENTEEISM_EDUCATION_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_EDUCATION_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.son = data[ExcelDataConfigure.ABSENTEEISM_SON_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_SON_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.socialDrinker = data[ExcelDataConfigure.ABSENTEEISM_SOCIAL_DRINKER_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_SOCIAL_DRINKER_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.socialSmoker = data[ExcelDataConfigure.ABSENTEEISM_SOCIAL_SOMKER_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_SOCIAL_SOMKER_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.pet = data[ExcelDataConfigure.ABSENTEEISM_PET_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_PET_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.weight = data[ExcelDataConfigure.ABSENTEEISM_WEIGHT_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_WEIGHT_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.height = data[ExcelDataConfigure.ABSENTEEISM_HEIGHT_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_HEIGHT_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.bodyMassIndex = data[ExcelDataConfigure.ABSENTEEISM_BODY_MASS_INDEX_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_BODY_MASS_INDEX_INDEX + "is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.absenteeismTimeInHours = data[ExcelDataConfigure.ABSENTEEISM_TIME_IN_HOURS_INDEX].toInt()
            }catch (e:Exception){
                candyResult.message = " " + ExcelDataConfigure.ABSENTEEISM_TIME_IN_HOURS_INDEX + "is not int"
                return candyResult
            }

            absenteeismAtWorkDOList.add(absenteeismAtWorkDO)
        }

        candyResult.data = absenteeismAtWorkDOList
        candyResult.isSuccess = true
        return candyResult
    }

}