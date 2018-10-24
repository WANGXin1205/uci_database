package com.growlithe.uci.mysql.database.avila.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/24 下午7:04
 * @Description 阿维拉数据集 阿维拉圣经
 */
data class AvliaDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 柱间距离
         */
        var intercolumnarDistance: BigDecimal? = null,
        /**
         * 上边距
         */
        var upperMargin: BigDecimal? = null,
        /**
         * 下边距
         */
        var lowerMargin: BigDecimal? = null,
        /**
         * 开采
         */
        var exploitation: BigDecimal? = null,
        /**
         * 行数
         */
        var rowNo: BigDecimal? = null,
        /**
         * 模数比
         */
        var modularRatio: BigDecimal? = null,
        /**
         * 线性间距
         */
        var interlinearSpacing: BigDecimal? = null,
        /**
         * 重量
         */
        var weight: BigDecimal? = null,
        /**
         * 峰值数
         */
        var peakNumber: BigDecimal? = null,
        /**
         * 模数比/行间距
         */
        var modularRatioAndInterlinearSpacingRate: BigDecimal? = null,
        /**
         * 类别
         */
        var dataClass: String? = null,
        /**
         * 数据分类 0 未知 1 训练 2 测试
         */
        var dataType: Int? = null,
        /**
         * 数据状态
         */
        var status: Int? = null


) {
    override fun toString(): String {
        return "AvliaDO(id=$id, intercolumnarDistance=$intercolumnarDistance, upperMargin=$upperMargin, " +
                "lowerMargin=$lowerMargin, exploitation=$exploitation, rowNo=$rowNo, modularRatio=$modularRatio," +
                "interlinearSpacing=$interlinearSpacing, weight=$weight, peakNumber=$peakNumber, " +
                "modularRatioAndInterlinearSpacingRate=$modularRatioAndInterlinearSpacingRate, dataClass=$dataClass," +
                "dataType=$dataType, status=$status)\n"
    }
}