package com.growlithe.uci.mysql.database.post.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  术后病人数据集
 */
data class PostOperativePatientDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 病人内部温度
         */
        var lCore: String? = null,
        /**
         * 病人表面温度
         */
        var lSurf: String? = null,
        /**
         * 氧饱和度
         */
        var lO: String? = null,
        /**
         *  血压上测量
         */
        var lBp: String? = null,
        /**
         * 病人表面温度稳定性
         */
        var surfStbl: String? = null,
        /**
         * 病人核心温度稳定性
         */
        var coreStbl: String? = null,
        /**
         * 病人血压稳定性
         */
        var bpStbl: String? = null,
        /**
         * 舒适程度
         */
        var comfort: Int? = null,
        /**
         * 决定 类属性
         */
        var decision: String? = null,
        /**
         * 数据有效性 1 有效 0 失效
         */
        var status: Int? = null


) {
    override fun toString(): String {
        return "PostOperativePatientDO(id=$id, lCore=$lCore, lSurf=$lSurf, lO=$lO, lBp=$lBp, surfStbl=$surfStbl, " +
                "coreStbl=$coreStbl, bpStbl=$bpStbl, comfort=$comfort, decision=$decision, status=$status)\n"
    }
}