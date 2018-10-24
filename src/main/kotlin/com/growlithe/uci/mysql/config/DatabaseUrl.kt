package com.growlithe.uci.mysql.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

/**
 * @Author : Growlithe
 * @Date : 2018/10/24 下午3:38
 * @Description
 */
@Component
class DatabaseUrl {

    @Value("\${databaseUrl.path}")
    fun setUrl(url: String?) {
        DatabaseUrl.url = url
    }

    companion object {
        var url: String? = null
    }

}
