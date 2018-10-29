package com.growlithe.uci.mysql.database.breastcancer.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 乳腺癌数据集
 */
data class BreastCancerDO(
        /**
         * id 主键
         */
        val id: Long? = null,
        /**
         * 分类名称
         */
        val className: String? = null,
        /**
         * 年龄
         */
        val age: String? = null,
        /**
         * 更年期
         */
        val menopause: String? = null,
        /**
         * 肿瘤大小
         */
        val tumorSize: String? = null,
        /**
         *
         */
        val invNodes: String? = null,
        /**
         *
         */
        val nodeCaps: String? = null,
        /**
         *
         */
        val degMalig: Int? = null,
        /**
         * 乳房
         */
        val breast: String? = null,
        /**
         * 乳房四边形
         */
        val breastQuad: String? = null,
        /**
         *
         */
        val irradiat: String? = null,
        /**
         * 数据状态 1 有效 0 无效
         */
        val status: Int? = null

) {
    override fun toString(): String {
        return "BreastCancerDO(id=$id, className=$className, age=$age, menopause=$menopause, tumorSize=$tumorSize, invNodes=$invNodes, nodeCaps=$nodeCaps, degMalig=$degMalig, breast=$breast, breastQuad=$breastQuad, irradiat=$irradiat, status=$status)\n"
    }
}