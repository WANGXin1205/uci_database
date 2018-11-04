package com.growlithe.uci.mysql.database.breasttissue.dao.domain

import java.math.BigDecimal

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 乳腺组织数据集
 */
data class BreastTissueDO(
        /**
         * id 主键
         */
        val id: Long? = null,
        /**
         * 分类名称 car(carcinoma), fad (fibro-adenoma), mas (mastopathy), gla (glandular), con (connective), adi (adipose)
         */
        val className: String? = null,
        /**
         * I0零频率下的阻抗（欧姆）PA500 500Hz的
         */
        val i: BigDecimal? = null,
        /**
         * 相位角
         */
        val pa: BigDecimal? = null,
        /**
         * HFS 相位角 的高频斜率
         */
        val hfs: BigDecimal? = null,
        /**
         * DA频谱端之间的阻抗距离
         */
        val da: BigDecimal? = null,
        /**
         * 频谱
         */
        val area: BigDecimal? = null,
        /**
         * A / DA区域下的 区域面积由DA
         */
        val ada: BigDecimal? = null,
        /**
         * MAX 归一化 IP最大值频谱
         */
        val maxIp: BigDecimal? = null,
        /**
         * DR距离I0和实际部分最大频率点
         */
        val dr: BigDecimal? = null,
        /**
         * P长度的光谱曲线
         */
        val p: BigDecimal? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        val status: Int? = null

) {
    override fun toString(): String {
        return "BreastTissueDO(id=$id, className=$className, i=$i, pa=$pa, hfs=$hfs, da=$da, area=$area, ada=$ada, " +
                "maxIp=$maxIp, dr=$dr, p=$p, status=$status)\n"
    }
}