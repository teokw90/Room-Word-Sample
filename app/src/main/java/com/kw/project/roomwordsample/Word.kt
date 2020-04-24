package com.kw.project.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Kuan Wah Teo on 24/04/2020
 **/

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey @ColumnInfo(name = "word")val word: String)