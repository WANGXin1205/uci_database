package com.growlithe.uci.mysql.database.congressional.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 国会表决记录数据集
 */
class CongressionalVotingRecordsDO {
    /**
     * id 主键
     */
    var id: Long? = null
    /**
     * 类别
     */
    var className: String? = null
    /**
     * handicappedInfants
     */
    var handicappedInfants: String? = null
    /**
     * 水利费用分摊
     */
    var waterProjectCostSharing: String? = null
    /**
     * 预算决议通过
     */
    var adoptionOfTheBudgetResolution: String? = null
    /**
     * 医师费冻结
     */
    var physicianFeeFreeze: String? = null
    /**
     * 萨尔瓦多援助
     */
    var elSalvadorAid: String? = null
    /**
     * 学校里的宗教团体
     */
    var religiousGroupsInSchools: String? = null
    /**
     * 反卫星试验禁令
     */
    var antiSatelliteTestBan: String? = null
    /**
     * 援助尼加拉瓜
     */
    var aidToNicaraguanContras: String? = null
    /**
     * mx导弹
     */
    var mxMissile: String? = null
    /**
     * 移民
     */
    var immigration: String? = null
    /**
     * 削减合成燃料公司
     */
    var synfuelsCorporationCutback: String? = null
    /**
     * 教育支出
     */
    var educationSpending: String? = null
    /**
     * 超级基金的起诉权
     */
    var superfundRightToSue: String? = null
    /**
     * 犯罪
     */
    var crime: String? = null
    /**
     * 免税出口
     */
    var dutyFreeExports: String? = null
    /**
     * 南非出口管理法
     */
    var exportAdministrationActSouthAfrica: String? = null
    /**
     * 数据类型 1 有效 0 失效
     */
    var status: Int? = null

    override fun toString(): String {
        return "CongressionalVotingRecordsDO(id=$id, className=$className, handicappedInfants=$handicappedInfants, " +
                "waterProjectCostSharing=$waterProjectCostSharing, adoptionOfTheBudgetResolution=$adoptionOfTheBudgetResolution, " +
                "physicianFeeFreeze=$physicianFeeFreeze, elSalvadorAid=$elSalvadorAid, religiousGroupsInSchools=$religiousGroupsInSchools, " +
                "antiSatelliteTestBan=$antiSatelliteTestBan, aidToNicaraguanContras=$aidToNicaraguanContras, mxMissile=$mxMissile," +
                "immigration=$immigration, synfuelsCorporationCutback=$synfuelsCorporationCutback, educationSpending=$educationSpending," +
                "superfundRightToSue=$superfundRightToSue, crime=$crime, dutyFreeExports=$dutyFreeExports," +
                "exportAdministrationActSouthAfrica=$exportAdministrationActSouthAfrica, status=$status)\n"
    }

}