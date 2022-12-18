package com.ej.data.repository.splash.datasource

import com.ej.data.model.splash.DataAppVersion
import com.ej.domain.utils.RemoteErrorEmitter

interface SplashRemoteDataSource {
    suspend fun getAppVersion(remoteErrorEmitter: RemoteErrorEmitter,) : DataAppVersion?
}