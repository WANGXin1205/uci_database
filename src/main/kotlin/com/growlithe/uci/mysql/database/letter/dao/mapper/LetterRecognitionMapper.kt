package com.growlithe.uci.mysql.database.letter.dao.mapper

import com.growlithe.uci.mysql.database.iris.dao.domain.IrisDO
import com.growlithe.uci.mysql.database.letter.dao.domain.LetterRecognitionDO

interface LetterRecognitionMapper {
    /**
     * 查询所有的 字母识别数据集
     *
     * @return
     */
    fun listAll(): List<LetterRecognitionDO>
}