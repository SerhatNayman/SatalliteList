package com.example.testapp.model

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class Position(
    @ColumnInfo(name ="id")
    @SerializedName("id")
    val id: Int?,
    @ColumnInfo(name ="posX")
    @SerializedName("posX")
    val posX: Double?,
    @ColumnInfo(name ="posY")
    @SerializedName("posY")
    val posY: Double?
) {
}