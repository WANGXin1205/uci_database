package com.growlithe.uci.mysql.database.statlogvehicle.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description  车辆轮廓数据集
 */
data class StatlogVehicleSilhouettesDO (
    /**
     * id 主键
     */
    var id: Int? = null,
    /**
     * 以下属性实在是难翻译，我们认为他们没有啥实际意义好了
     */
    var compactness: Int? = null,

    var circularity: Int? = null,

    var distanceCircularity: Int? = null,

    var radiusRatio: Int? = null,

    var prAxisAspectRatio: Int? = null,

    var maxLengthAspectRatio: Int? = null,

    var scatterRatio: Int? = null,

    var elongatedness: Int? = null,

    var prAxisRectangularity: Int? = null,

    var maxLengthRectangularity: Int? = null,

    var scaledVariance: Int? = null,

    var scaledVarianceA: Int? = null,

    var scaledRadiusOfGyration: Int? = null,

    var skewnessAbout: Int? = null,

    var skewnessAboutA: Int? = null,

    var kurtosisAbout: Int? = null,

    var kurtosisAboutA: Int? = null,

    var hollowsRatio: Int? = null,
    /**
     * 类名称
     */
    var className: String? = null,
    /**
     * 数据属性 1 有效 0 失效
     */
    var status: Int? = null

) {
    override fun toString(): String {
        return "StatlogVehicleSilhouettesDO(id=$id, compactness=$compactness, circularity=$circularity, distanceCircularity=$distanceCircularity, " +
                "radiusRatio=$radiusRatio, prAxisAspectRatio=$prAxisAspectRatio, maxLengthAspectRatio=$maxLengthAspectRatio, " +
                "scatterRatio=$scatterRatio, elongatedness=$elongatedness, prAxisRectangularity=$prAxisRectangularity, " +
                "maxLengthRectangularity=$maxLengthRectangularity, scaledVariance=$scaledVariance, scaledVarianceA=$scaledVarianceA, " +
                "scaledRadiusOfGyration=$scaledRadiusOfGyration, skewnessAbout=$skewnessAbout, skewnessAboutA=$skewnessAboutA, " +
                "kurtosisAbout=$kurtosisAbout, kurtosisAboutA=$kurtosisAboutA, hollowsRatio=$hollowsRatio, className=$className, " +
                "status=$status)\n"
    }
}