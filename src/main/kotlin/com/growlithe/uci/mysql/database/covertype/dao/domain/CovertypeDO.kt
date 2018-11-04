package com.growlithe.uci.mysql.database.covertype.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 植被覆盖数据集
 */
data class CovertypeDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 仪表高度
         */
        var elevation: Int? = null,
        /**
         * 方位
         */
        var aspect: Int? = null,
        /**
         * 坡度
         */
        var slope: Int? = null,
        /**
         * 最接近地表水特征的水平距离
         */
        var horizontalDistanceToHydrology: Int? = null,
        /**
         * 最接近地表水特征的垂直距离
         */
        var verticalDistanceToHydrology: Int? = null,
        /**
         * 水平巷道距离
         */
        var horizontalDistanceToRoadways: Int? = null,
        /**
         * 夏至 早上
         */
        var hillshadeAm: Int? = null,
        /**
         * 夏至 中午
         */
        var hillshadeNoon: Int? = null,
        /**
         * 夏至 晚上
         */
        var hillshadePm: Int? = null,
        /**
         * 最近野火点距离
         */
        var horizontalDistanceToFirePoints: Int? = null,
        /**
         * 威尔德涅斯地区
         */
        var wildernessAreaA: Int? = null,

        var wildernessAreaB: Int? = null,

        var wildernessAreaC: Int? = null,

        var wildernessAreaD: Int? = null,
        /**
         * 土壤类型
         */
        var soilTypeAa: Int? = null,

        var soilTypeAb: Int? = null,

        var soilTypeAc: Int? = null,

        var soilTypeAd: Int? = null,

        var soilTypeAe: Int? = null,

        var soilTypeAf: Int? = null,

        var soilTypeAg: Int? = null,

        var soilTypeAh: Int? = null,

        var soilTypeAi: Int? = null,

        var soilTypeAj: Int? = null,

        var soilTypeAk: Int? = null,

        var soilTypeAl: Int? = null,

        var soilTypeAm: Int? = null,

        var soilTypeAn: Int? = null,

        var soilTypeAo: Int? = null,

        var soilTypeAp: Int? = null,

        var soilTypeAq: Int? = null,

        var soilTypeAr: Int? = null,

        var soilTypeAs: Int? = null,

        var soilTypeAt: Int? = null,

        var soilTypeAu: Int? = null,

        var soilTypeAv: Int? = null,

        var soilTypeAw: Int? = null,

        var soilTypeAx: Int? = null,

        var soilTypeAy: Int? = null,

        var soilTypeAz: Int? = null,

        var soilTypeBa: Int? = null,

        var soilTypeBb: Int? = null,

        var soilTypeBc: Int? = null,

        var soilTypeBd: Int? = null,

        var soilTypeBe: Int? = null,

        var soilTypeBf: Int? = null,

        var soilTypeBg: Int? = null,

        var soilTypeBh: Int? = null,

        var soilTypeBi: Int? = null,

        var soilTypeBj: Int? = null,

        var soilTypeBk: Int? = null,

        var soilTypeBl: Int? = null,

        var soilTypeBm: Int? = null,

        var soilTypeBn: Int? = null,
        /**
         * 覆盖类型
         */
        var coverType: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: String? = null
)