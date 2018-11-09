package com.growlithe.uci.mysql.database.mushroom.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  蘑菇数据集
 */
data class MushroomDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 类别
         */
        var className: String? = null,
        /**
         * 帽形
         */
        var capShape: String? = null,
        /**
         * 盖面
         */
        var capSurface: String? = null,
        /**
         * 帽色
         */
        var capColor: String? = null,
        /**
         * 伤痕
         */
        var bruises: String? = null,
        /**
         * 气味
         */
        var odor: String? = null,
        /**
         * 菌褶附件
         */
        var gillAttachment: String? = null,
        /**
         * 菌褶间隔
         */
        var gillSpacing: String? = null,
        /**
         * 菌褶的尺寸
         */
        var gillSize: String? = null,
        /**
         * 菌褶的颜色
         */
        var gillColor: String? = null,
        /**
         * 茎的形状
         */
        var stalkShape: String? = null,
        /**
         * 茎根
         */
        var stalkRoot: String? = null,
        /**
         * 茎表面上方环
         */
        var stalkSurfaceAboveRing: String? = null,
        /**
         * 茎表面下方环
         */
        var stalkSurfaceBelowRing: String? = null,
        /**
         * 茎表面上面方环
         */
        var stalkColorAboveRing: String? = null,
        /**
         * 茎表面下面方环
         */
        var stalkColorBelowRing: String? = null,
        /**
         * 面罩
         */
        var veilType: String? = null,
        /**
         * 面罩颜色
         */
        var veilColor: String? = null,
        /**
         * 环数
         */
        var ringNumber: String? = null,
        /**
         * 环类型
         */
        var ringType: String? = null,
        /**
         * 孢子颜色
         */
        var sporePrintColor: String? = null,
        /**
         * 种群
         */
        var population: String? = null,
        /**
         * 栖息地
         */
        var habitat: String? = null,
        /**
         * 数据有效性 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "MushroomDO(id=$id, className=$className, capShape=$capShape, capSurface=$capSurface, capColor=$capColor, " +
                "bruises=$bruises, odor=$odor, gillAttachment=$gillAttachment, gillSpacing=$gillSpacing, gillSize=$gillSize, " +
                "gillColor=$gillColor, stalkShape=$stalkShape, stalkRoot=$stalkRoot, stalkSurfaceAboveRing=$stalkSurfaceAboveRing, " +
                "stalkSurfaceBelowRing=$stalkSurfaceBelowRing, stalkColorAboveRing=$stalkColorAboveRing, stalkColorBelowRing=$stalkColorBelowRing, " +
                "veilType=$veilType, veilColor=$veilColor, ringNumber=$ringNumber, ringType=$ringType, sporePrintColor=$sporePrintColor, " +
                "population=$population, habitat=$habitat, status=$status)\n"
    }
}