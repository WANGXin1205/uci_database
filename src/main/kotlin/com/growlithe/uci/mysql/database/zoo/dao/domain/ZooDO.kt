package com.growlithe.uci.mysql.database.zoo.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 动物园数据集
 */
data class ZooDO(
        /**
         * id 主键
         */
        var id: Int? = null,
        /**
         * 动物名称
         */
        var animalName: String? = null,
        /**
         * 头发
         */
        var hair: Int? = null,
        /**
         * 羽毛
         */
        var feathers: Int? = null,
        /**
         * 蛋
         */
        var eggs: Int? = null,
        /**
         * 牛奶
         */
        var milk: Int? = null,
        /**
         * 航空
         */
        var airborne: Int? = null,
        /**
         * 水生
         */
        var aquatic: Int? = null,
        /**
         * 捕食
         */
        var predator: Int? = null,
        /**
         * 牙齿
         */
        var toothed: Int? = null,
        /**
         * 主干
         */
        var backbone: Int? = null,
        /**
         * 呼吸
         */
        var breathes: Int? = null,
        /**
         * 有毒的
         */
        var venomous: Int? = null,
        /**
         * 翼
         */
        var fins: Int? = null,
        /**
         * 腿
         */
        var legs: Int? = null,
        /**
         * 尾巴
         */
        var tail: Int? = null,
        /**
         * 驯养
         */
        var domestic: Int? = null,
        /**
         * catsize
         */
        var catsize: Int? = null,
        /**
         * 类型
         */
        var type: Int? = null,
        /**
         * 数据状态 1 有效 0 失效
         */
        var status: Int? = null

) {
    override fun toString(): String {
        return "ZooDO(id=$id, animalName=$animalName, hair=$hair, feathers=$feathers, eggs=$eggs, milk=$milk, " +
                "airborne=$airborne, aquatic=$aquatic, predator=$predator, toothed=$toothed, backbone=$backbone, " +
                "breathes=$breathes, venomous=$venomous, fins=$fins, legs=$legs, tail=$tail, domestic=$domestic, " +
                "catsize=$catsize, type=$type, status=$status)\n"
    }
}