package com.ej.snackapp.di.usecase

import com.ej.domain.repository.SplashRepository
import com.ej.domain.usecase.GetAppVersionUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object SplashUseCaseModule {
    @Provides
    @Singleton
    fun provideGetAppVersionUseCase(repository: SplashRepository): GetAppVersionUseCase {
        return GetAppVersionUseCase(repository)
    }
}