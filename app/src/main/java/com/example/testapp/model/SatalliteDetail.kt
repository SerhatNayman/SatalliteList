package com.example.testapp.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class SatalliteDetail(
    @ColumnInfo(name ="id")
    @SerializedName("id")
    val id: Int?,
    @ColumnInfo(name ="cost_per_launch")
    @SerializedName("cost_per_launch")
    val costPerLaunch: Int?,
    @ColumnInfo(name ="first_flight")
    @SerializedName("first_flight")
    val firstFlight: String?,
    @ColumnInfo(name ="height")
    @SerializedName("height")
    val height: Int?,
    @ColumnInfo(name ="mass")
    @SerializedName("mass")
    val mass: Int?
) {
}