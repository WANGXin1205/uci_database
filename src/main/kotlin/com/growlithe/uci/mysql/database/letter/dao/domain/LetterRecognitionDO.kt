package com.growlithe.uci.mysql.database.letter.dao.domain

/**
 * @Author : Growlithe
 * @Date : 2018/10/26 下午10:03
 * @Description 字母识别数据集
 */
data class LetterRecognitionDO (
    /**
     * id 主键
     */
    var id: Int? = null,
    /**
     * LETTR大写字母（26值从A到Z）
     */
    var letter: String? = null,
    /**
     * X-Box的水平位置，箱（整数）
     */
    var xBox: Int? = null,
    /**
     * 箱及垂直位置（整数）
     */
    var yBox: Int? = null,
    /**
     * 箱宽度（整数）
     */
    var width: Int? = null,
    /**
     * 箱的高度（整数）
     */
    var high: Int? = null,
    /**
     * onpix总像素（整数）
     */
    var onpix: Int? = null,
    /**
     * x x的平均像素盒（整数）
     */
    var xBar: Int? = null,
    /**
     * Y Y棒平均像素在箱（整数）
     */
    var yBar: Int? = null,
    /**
     * x2bar意味着x的方差（整数）
     */
    var xToBar: Int? = null,
    /**
     * y2bar意味着Y的方差（整数）
     */
    var yToBar: Int? = null,
    /**
     * xybar意味着x y相关（整数）
     */
    var xyBar: Int? = null,
    /**
     * X X Y x2ybr平均（整数）
     */
    var xToYBr: Int? = null,
    /**
     * X * * xy2br平均（整数）
     */
    var xyToBr: Int? = null,
    /**
     * x-ege平均边数从左到右（整数）
     */
    var xEge: Int? = null,
    /**
     * Y x-ege xegvy相关（整数）
     */
    var xegvy: Int? = null,
    /**
     * y-ege平均边数底部到顶部（整数）
     */
    var yEge: Int? = null,
    /**
     * x的y-ege yegvx相关（整数）
     */
    var yegvx: Int? = null,
    /**
     * 数据状态 1 有效 0 失效
     */
    var status: Int? = null

) {
    override fun toString(): String {
        return "LetterRecognitionDO(id=$id, letter=$letter, xBox=$xBox, yBox=$yBox, width=$width, high=$high, " +
                "onpix=$onpix, xBar=$xBar, yBar=$yBar, xToBar=$xToBar, yToBar=$yToBar, xyBar=$xyBar, xToYBr=$xToYBr, " +
                "xyToBr=$xyToBr, xEge=$xEge, xegvy=$xegvy, yEge=$yEge, yegvx=$yegvx, status=$status)\n"
    }
}