package com.ej.snackapp.di.core

import com.ej.data.api.SplashApi
import com.ej.data.repository.splash.datasource.SplashRemoteDataSource
import com.ej.data.repository.splash.datasourceimpl.SplashRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// 원격 API 호출 모듈
@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    @Singleton
    fun provideSplashRemoteDataSource(splashApi: SplashApi) : SplashRemoteDataSource{
        return SplashRemoteDataSourceImpl(splashApi)
    }
}

