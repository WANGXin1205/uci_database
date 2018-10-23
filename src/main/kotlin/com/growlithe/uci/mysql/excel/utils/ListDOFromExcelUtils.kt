package com.growlithe.uci.mysql.excel.utils

import com.growlithe.uci.common.bean.CandyResult
import com.growlithe.uci.mysql.config.ExcelDataConfigure
import com.growlithe.uci.mysql.database.abalone.dao.domain.AbaloneDO
import com.growlithe.uci.mysql.database.absenteeism.dao.domain.AbsenteeismAtWorkDO
import com.growlithe.uci.mysql.database.adult.dao.domain.AdultDO
import com.growlithe.uci.mysql.database.anurancalls.dao.domain.AnuranCallsDO
import com.growlithe.uci.mysql.excel.utils.enums.DataType
import com.growlithe.uci.mysql.overview.dao.domain.DatabaseOverviewDO
import com.growlithe.uci.utils.POIUtils
import org.springframework.beans.BeanUtils
import org.springframework.web.multipart.MultipartFile
import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/15 下午5:52
 * @Description
 */
object ListDOFromExcelUtils {

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
    fun listDatabaseOverviewDOFromDataMap(dataMap: Map<Int, Array<String>>): CandyResult<MutableList<DatabaseOverviewDO>> {
        val candyResult = CandyResult<MutableList<DatabaseOverviewDO>>()

        val databaseOverviewDOList = mutableListOf<DatabaseOverviewDO>()
        for (index: Int in dataMap.keys) {
            val databaseOverviewDO = DatabaseOverviewDO()
            val data = dataMap[index]!!
            val realIndex = index + ExcelDataConfigure.DEFAULT_ADD_ROW

            databaseOverviewDO.name = data[ExcelDataConfigure.DATABASE_OVERVIEW_NAME_INDEX]

            try {
                databaseOverviewDO.attributesNumber = data[ExcelDataConfigure.DATABASE_OVERVIEW_ATTRIBUTES_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.DATABASE_OVERVIEW_ATTRIBUTES_INDEX + "列 is not num"
                return candyResult
            }
            try {
                databaseOverviewDO.instancesNumber = data[ExcelDataConfigure.DATABASE_OVERVIEW_INSTANCES_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.DATABASE_OVERVIEW_INSTANCES_INDEX + "列 is not num"
                return candyResult
            }

            databaseOverviewDO.area = data[ExcelDataConfigure.DATABASE_OVERVIEW_AREA_INDEX]
            databaseOverviewDO.dateDonated = data[ExcelDataConfigure.DATABASE_OVERVIEW_DATE_DONATED_INDEX]

            databaseOverviewDO.createBy = ExcelDataConfigure.GROWLITHE

            databaseOverviewDOList.add(databaseOverviewDO)
        }

        candyResult.data = databaseOverviewDOList
        candyResult.isSuccess = true
        return candyResult
    }

    /**
     * 从dataMap 转换成 鲍鱼集 数据
     *
     * @param dataMap
     */
    fun listAbaloneDOFromDataMap(dataMap: Map<Int, Array<String>>): CandyResult<MutableList<AbaloneDO>> {
        val candyResult = CandyResult<MutableList<AbaloneDO>>()

        val abaloneDOList = mutableListOf<AbaloneDO>()
        for (index: Int in dataMap.keys) {
            val abaloneDO = AbaloneDO()
            val data = dataMap[index]!!
            val realIndex = index + ExcelDataConfigure.DEFAULT_ADD_ROW

            abaloneDO.sex = data[ExcelDataConfigure.ABALONE_DATA_SEX_INDEX]
            try {
                abaloneDO.length = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_LENGTH_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_LENGTH_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.diameter = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_DIAMETER_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_DIAMETER_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.height = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_HEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_HEIGHT_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.wholeWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_WHOLE_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_WHOLE_WEIGHT_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.shuckedWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_SHUCKED_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_SHUCKED_WEIGHT_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.visceraWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_VISCERA_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_VISCERA_WEIGHT_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.shellWeight = BigDecimal(data[ExcelDataConfigure.ABALONE_DATA_SHELL_WEIGHT_INDEX])
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_SHELL_WEIGHT_INDEX + "列 is not num"
                return candyResult
            }
            try {
                abaloneDO.rings = data[ExcelDataConfigure.ABALONE_DATA_RINGS_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABALONE_DATA_RINGS_INDEX + "列 is not int"
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
    fun listAbsenteeismAtWorkDOFromDataMap(dataMap: Map<Int, Array<String>>): CandyResult<MutableList<AbsenteeismAtWorkDO>> {
        val candyResult = CandyResult<MutableList<AbsenteeismAtWorkDO>>()

        val absenteeismAtWorkDOList = mutableListOf<AbsenteeismAtWorkDO>()

        for (index: Int in dataMap.keys) {
            val absenteeismAtWorkDO = AbsenteeismAtWorkDO()
            val data = dataMap[index]!!
            val realIndex = index + ExcelDataConfigure.DEFAULT_ADD_ROW

            try {
                absenteeismAtWorkDO.originId = data[ExcelDataConfigure.ABSENTEEISM_ORIGIN_ID_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_ORIGIN_ID_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.reasonForAbsence = data[ExcelDataConfigure.ABSENTEEISM_REASON_FOR_ABSENCE_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_REASON_FOR_ABSENCE_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.monthOfAbsence = data[ExcelDataConfigure.ABSENTEEISM_MONTH_OF_ABSENCE_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_MONTH_OF_ABSENCE_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.dayOfWeek = data[ExcelDataConfigure.ABSENTEEISM_DAY_OF_WEEK_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_DAY_OF_WEEK_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.seasons = data[ExcelDataConfigure.ABSENTEEISM_SEASONS_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_SEASONS_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.transportationExpense = data[ExcelDataConfigure.ABSENTEEISM_TRANSPORTATION_EXPENSE_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_TRANSPORTATION_EXPENSE_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.distanceFromResidenceToWork = data[ExcelDataConfigure.ABSENTEEISM_DISTANCE_FROM_RESIDENCE_TO_WORK_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_DISTANCE_FROM_RESIDENCE_TO_WORK_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.serviceTime = data[ExcelDataConfigure.ABSENTEEISM_SERVICE_TIME_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_SERVICE_TIME_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.age = data[ExcelDataConfigure.ABSENTEEISM_AGE_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_AGE_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.workLoadAverageOfDay = data[ExcelDataConfigure.ABSENTEEISM_WORK_LOAD_AVERAGE_OF_DAY_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_WORK_LOAD_AVERAGE_OF_DAY_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.hitTarget = data[ExcelDataConfigure.ABSENTEEISM_HITTARGET_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_HITTARGET_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.disciplinaryFailure = data[ExcelDataConfigure.ABSENTEEISM_DISCIPLINARY_FAILURE_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_DISCIPLINARY_FAILURE_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.education = data[ExcelDataConfigure.ABSENTEEISM_EDUCATION_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_EDUCATION_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.son = data[ExcelDataConfigure.ABSENTEEISM_SON_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_SON_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.socialDrinker = data[ExcelDataConfigure.ABSENTEEISM_SOCIAL_DRINKER_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_SOCIAL_DRINKER_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.socialSmoker = data[ExcelDataConfigure.ABSENTEEISM_SOCIAL_SOMKER_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_SOCIAL_SOMKER_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.pet = data[ExcelDataConfigure.ABSENTEEISM_PET_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_PET_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.weight = data[ExcelDataConfigure.ABSENTEEISM_WEIGHT_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_WEIGHT_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.height = data[ExcelDataConfigure.ABSENTEEISM_HEIGHT_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_HEIGHT_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.bodyMassIndex = data[ExcelDataConfigure.ABSENTEEISM_BODY_MASS_INDEX_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_BODY_MASS_INDEX_INDEX + "列 is not int"
                return candyResult
            }

            try {
                absenteeismAtWorkDO.absenteeismTimeInHours = data[ExcelDataConfigure.ABSENTEEISM_TIME_IN_HOURS_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ABSENTEEISM_TIME_IN_HOURS_INDEX + "列 is not int"
                return candyResult
            }

            absenteeismAtWorkDOList.add(absenteeismAtWorkDO)
        }

        candyResult.data = absenteeismAtWorkDOList
        candyResult.isSuccess = true
        return candyResult
    }

    /**
     * 从dataMap 转换成 人口 数据
     *
     * @param dataType
     * @param dataMap
     */
    fun listAdultDOFromDataMap(dataType: DataType, dataMap: Map<Int, Array<String>>): CandyResult<MutableList<AdultDO>> {
        val candyResult = CandyResult<MutableList<AdultDO>>()

        val adultDOList = mutableListOf<AdultDO>()

        for (index: Int in dataMap.keys) {
            val adultDO = AdultDO()
            val data = dataMap[index]!!
            val realIndex = index + ExcelDataConfigure.DEFAULT_ADD_ROW

            try {
                adultDO.age = data[ExcelDataConfigure.ADULT_AGE_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ADULT_AGE_INDEX + "列 is not int"
                return candyResult
            }

            adultDO.workclass = data[ExcelDataConfigure.ADULT_WORKCLASS_INDEX]

            try {
                adultDO.fnlwgt = data[ExcelDataConfigure.ADULT_FNLWGT_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ADULT_FNLWGT_INDEX + "列 is not int"
                return candyResult
            }

            adultDO.education = data[ExcelDataConfigure.ADULT_EDUCATION_INDEX]

            try {
                adultDO.educationNum = data[ExcelDataConfigure.ADULT_EDUCATION_NUM_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ADULT_EDUCATION_NUM_INDEX + "列 is not int"
                return candyResult
            }

            adultDO.maritalStatus = data[ExcelDataConfigure.ADULT_MARITAL_STATUS_INDEX]
            adultDO.occupation = data[ExcelDataConfigure.ADULT_OCCUPATION_INDEX]
            adultDO.relationship = data[ExcelDataConfigure.ADULT_RELATIONSHIP_INDEX]
            adultDO.race = data[ExcelDataConfigure.ADULT_RACE_INDEX]
            adultDO.sex = data[ExcelDataConfigure.ADULT_SEX_INDEX]

            try {
                adultDO.capitalGain = data[ExcelDataConfigure.ADULT_CAPITAL_GAIN_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ADULT_CAPITAL_GAIN_INDEX + "列 is not int"
                return candyResult
            }
            try {
                adultDO.capitalLoss = data[ExcelDataConfigure.ADULT_CAPITAL_LOSS_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ADULT_CAPITAL_LOSS_INDEX + "列 is not int"
                return candyResult
            }
            try {
                adultDO.hoursPerWeek = data[ExcelDataConfigure.ADULT_HOURS_PER_WEEK_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ADULT_HOURS_PER_WEEK_INDEX + "列 is not int"
                return candyResult
            }

            adultDO.nativeCountry = data[ExcelDataConfigure.ADULT_NATIVE_COUNTRY_INDEX]
            adultDO.incomeAttributes = data[ExcelDataConfigure.ADULT_INCOME_ATTRIBUTES_INDEX]
            adultDO.dataType = dataType.type

            adultDOList.add(adultDO)
        }

        candyResult.data = adultDOList
        candyResult.isSuccess = true
        return candyResult
    }

    /**
     * 从dataMap 转换成 无尾目类动物叫声数据集 数据
     *
     * @param dataMap
     */
    fun listAnuranCallsDOFromDataMap(dataMap: Map<Int, Array<String>>): CandyResult<MutableList<AnuranCallsDO>> {
        val candyResult = CandyResult<MutableList<AnuranCallsDO>>()

        val anuranCallsDOList = mutableListOf<AnuranCallsDO>()

        for (index: Int in dataMap.keys) {
            val anuranCallsDO = AnuranCallsDO()
            val data = dataMap[index]!!
            val realIndex = index + ExcelDataConfigure.DEFAULT_ADD_ROW

            try {
                anuranCallsDO.mfccsA = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_A_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_A_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsB = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_B_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_B_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsC = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_C_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_C_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsD = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_D_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_D_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsE = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_E_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_E_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsF = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_F_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_F_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsG = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_G_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_G_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsH = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_H_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_H_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsI = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_I_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_I_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsJ = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_J_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_J_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsK = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_K_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_K_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsL = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_L_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_L_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsM = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_M_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_M_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsN = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_N_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_N_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsO = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_O_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_O_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsP = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_P_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_P_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsQ = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_Q_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_Q_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsR = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_R_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_R_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsS = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_S_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_S_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsT = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_T_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_T_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsU = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_U_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_U_INDEX + "列 is not num"
                return candyResult
            }
            try {
                anuranCallsDO.mfccsV = data[ExcelDataConfigure.ANURAN_CALLS_MFCCS_V_INDEX].toBigDecimal()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_MFCCS_V_INDEX + "列 is not num"
                return candyResult
            }

            anuranCallsDO.family = data[ExcelDataConfigure.ANURAN_CALLS_FAMILY_INDEX]
            anuranCallsDO.genus = data[ExcelDataConfigure.ANURAN_CALLS_GENUS_INDEX]
            anuranCallsDO.species = data[ExcelDataConfigure.ANURAN_CALLS_SPECIES_INDEX]

            try {
                anuranCallsDO.recordId = data[ExcelDataConfigure.ANURAN_CALLS_RECORD_ID_INDEX].toInt()
            } catch (e: Exception) {
                candyResult.message = "第 $realIndex 行中,第" + ExcelDataConfigure.ANURAN_CALLS_RECORD_ID_INDEX + "列 is not num"
                return candyResult
            }

            anuranCallsDOList.add(anuranCallsDO)
        }

        candyResult.data = anuranCallsDOList
        candyResult.isSuccess = true
        return candyResult
    }


}