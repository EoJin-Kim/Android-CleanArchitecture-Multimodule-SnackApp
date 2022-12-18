package com.ej.data.model.splash

import com.google.gson.annotations.SerializedName

data class DataAppVersion(
    @SerializedName("version")
    val version: String,
) {
}