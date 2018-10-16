package com.growlithe.uci.common.bean

import java.io.Serializable

/**
 * @Author : Growlithe
 * @Date : 2018/5/21 22:38
 * @Description 纪念我死去的卡蒂狗，因为Growlithe有拼写检查，我就用Candy了
 */
class CandyResult<T> : Serializable {

    /**
     * 成功标识
     */
    var isSuccess = false

    /**
     * 返回数据
     */
    var data: T? = null

    /**
     * 返回结果code
     */
    var code: String? = null

    /**
     * 返回信息
     */
    var message: String? = null

    constructor() {}

    constructor(success: Boolean, data: T, code: String, message: String) {
        this.isSuccess = success
        this.data = data
        this.code = code
        this.message = message
    }

    companion object {

        const val serialVersionUID = -9130472993784728577L
    }


}
