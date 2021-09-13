package com.example.testapp.model

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class SatallitesList(
    @ColumnInfo(name ="id")
    @SerializedName("id")
    val id: Int?,
    @ColumnInfo(name ="active")
    @SerializedName("active")
    val active: Boolean?,
    @ColumnInfo(name ="name")
    @SerializedName("name")
    val name: String?
) {
}