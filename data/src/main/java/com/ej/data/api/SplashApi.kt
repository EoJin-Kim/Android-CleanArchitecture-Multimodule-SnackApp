package com.ej.data.api

import com.ej.data.model.splash.DataAppVersion
import retrofit2.Response
import retrofit2.http.GET

interface SplashApi {

    @GET("/version")
    suspend fun getAppVersion() : Response<DataAppVersion>


}