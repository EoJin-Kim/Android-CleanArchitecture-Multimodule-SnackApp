package com.ej.data.repository.splash.datasourceimpl

import com.ej.data.api.SplashApi
import com.ej.data.model.splash.DataAppVersion
import com.ej.data.repository.splash.datasource.SplashRemoteDataSource
import com.ej.data.utils.base.BaseDataSource
import com.ej.domain.utils.RemoteErrorEmitter

class SplashRemoteDataSourceImpl(
    private val splashApi: SplashApi,
) : BaseDataSource(),SplashRemoteDataSource{
    override suspend fun getAppVersion(
        remoteErrorEmitter: RemoteErrorEmitter,
    ) :DataAppVersion?{
        val body : DataAppVersion? = safeApiCall(remoteErrorEmitter){
            splashApi.getAppVersion()
        }?.body()
        return body
    }
}