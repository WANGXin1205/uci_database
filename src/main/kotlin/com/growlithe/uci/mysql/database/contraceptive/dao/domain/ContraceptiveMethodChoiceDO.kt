package com.growlithe.uci.mysql.database.contraceptive.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 避孕方法选择数据集
 */
data class ContraceptiveMethodChoiceDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 妻子年龄
         */
        var wifeAge: Int? = null,
        /**
         * 妻子教育水平
         */
        var wifeEducation: Int? = null,
        /**
         * 丈夫教育水平
         */
        var husbandEducation: Int? = null,
        /**
         * 孩子数目
         */
        var childrenNumber: Int? = null,
        /**
         * 妻子宗教
         */
        var wifeReligion: Int? = null,
        /**
         * 妻子是否工作
         */
        var wifeWorkingStatus: Int? = null,
        /**
         * 丈夫职业
         */
        var husbandOccupation: Int? = null,
        /**
         * 生活质量指数
         */
        var standardLiving: Int? = null,
        /**
         * 媒体曝光
         */
        var mediaExposure: Int? = null,
        /**
         * 避孕方法
         */
        var className: Int? = null,
        /**
         * 数据状态
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "ContraceptiveMethodChoiceDO(id=$id, wifeAge=$wifeAge, wifeEducation=$wifeEducation, " +
                "husbandEducation=$husbandEducation, childrenNumber=$childrenNumber, wifeReligion=$wifeReligion, " +
                "wifeWorkingStatus=$wifeWorkingStatus, husbandOccupation=$husbandOccupation, standardLiving=$standardLiving, " +
                "mediaExposure=$mediaExposure, className=$className, status=$status)\n"
    }
}