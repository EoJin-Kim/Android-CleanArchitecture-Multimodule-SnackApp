package com.ej.data.repository.splash

import com.ej.data.mapper.SplashMapper
import com.ej.data.model.splash.DataAppVersion
import com.ej.data.repository.splash.datasource.SplashRemoteDataSource
import com.ej.domain.model.DomainAppVersion
import com.ej.domain.repository.SplashRepository
import com.ej.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class SplashRepositoryImpl @Inject constructor(
    private val splashRemoteDataSource: SplashRemoteDataSource
) : SplashRepository {
    override suspend fun getAppVersion(remoteErrorEmitter: RemoteErrorEmitter,): DomainAppVersion? {
        return SplashMapper.appVersionMapper(splashRemoteDataSource.getAppVersion(remoteErrorEmitter))
    }
}