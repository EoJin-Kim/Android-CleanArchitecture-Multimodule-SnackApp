package com.ej.snackapp.di.core

import com.ej.data.repository.splash.SplashRepositoryImpl
import com.ej.data.repository.splash.datasource.SplashRemoteDataSource
import com.ej.domain.repository.SplashRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideSplashRepository(
        splashRemoteDataSource: SplashRemoteDataSource
    ):SplashRepository{
        return SplashRepositoryImpl(splashRemoteDataSource)
    }

}