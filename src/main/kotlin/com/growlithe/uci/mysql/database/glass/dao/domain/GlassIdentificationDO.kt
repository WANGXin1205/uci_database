package com.growlithe.uci.mysql.database.glass.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 玻璃识别数据集
 */
data class GlassIdentificationDO(
        /**
         * id 主键
         */
        var id: Long? = null,
        /**
         * 折射率
         */
        var refractiveIndex: BigDecimal? = null,
        /**
         * 纳
         */
        var sodium: BigDecimal? = null,
        /**
         * 镁
         */
        var magnesium: BigDecimal? = null,
        /**
         * 铝
         */
        var aluminum: BigDecimal? = null,
        /**
         * 硅
         */
        var silicon: BigDecimal? = null,
        /**
         * 钾
         */
        var potassium: BigDecimal? = null,
        /**
         * 钙
         */
        var calcium: BigDecimal? = null,
        /**
         * 钡
         */
        var barium: BigDecimal? = null,
        /**
         * 铁
         */
        var iron: BigDecimal? = null,
        /**
         * 类名称
         */
        var className: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "GlassIdentificationDO(id=$id, refractiveIndex=$refractiveIndex, sodium=$sodium, magnesium=$magnesium, " +
                "aluminum=$aluminum, silicon=$silicon, potassium=$potassium, calcium=$calcium, barium=$barium, iron=$iron, " +
                "className=$className, status=$status)\n"
    }
}