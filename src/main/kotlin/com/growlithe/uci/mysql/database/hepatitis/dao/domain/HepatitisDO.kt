package com.growlithe.uci.mysql.database.hepatitis.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 肝炎数据集
 */
data class HepatitisDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 类别
         */
        var className: Int? = null,
        /**
         * 年龄
         */
        var age: Int? = null,
        /**
         * 性别
         */
        var sex: Int? = null,
        /**
         * 类固醇
         */
        var steroid: Int? = null,
        /**
         * 抗病毒药
         */
        var antuvirals: Int? = null,
        /**
         * 疲劳
         */
        var fatigue: Int? = null,
        /**
         * 不适
         */
        var malaise: Int? = null,
        /**
         * 厌食
         */
        var anorexia: Int? = null,
        /**
         * 肝大
         */
        var liverBig: Int? = null,
        /**
         * 肝充盈
         */
        var liverFirm: Int? = null,
        /**
         * 脾可触及
         */
        var spleenPalpable: Int? = null,
        /**
         * 蜘蛛
         */
        var spiders: Int? = null,
        /**
         * 腹水
         */
        var ascites: Int? = null,
        /**
         * 静脉曲张
         */
        var varices: Int? = null,
        /**
         * 胆红素
         */
        var bilirubin: BigDecimal? = null,
        /**
         * 碱性磷酸盐
         */
        var alkPhoshphate: Int? = null,
        /**
         * 谷草转氨酶
         */
        var sgot: Int? = null,
        /**
         * 白蛋白
         */
        var albumin: BigDecimal? = null,
        /**
         * 凝血酶原时间
         */
        var protime: Int? = null,
        /**
         * 组织学
         */
        var histology: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null


) {
    override fun toString(): String {
        return "HepatitisDO(id=$id, className=$className, age=$age, sex=$sex, steroid=$steroid, antuvirals=$antuvirals, " +
                "fatigue=$fatigue, malaise=$malaise, anorexia=$anorexia, liverBig=$liverBig, liverFirm=$liverFirm, " +
                "spleenPalpable=$spleenPalpable, spiders=$spiders, ascites=$ascites, varices=$varices, bilirubin=$bilirubin, " +
                "alkPhoshphate=$alkPhoshphate, sgot=$sgot, albumin=$albumin, protime=$protime, histology=$histology, status=$status)\n"
    }
}