package com.ej.snackapp.di.factory

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ViewModelFactory {

//    @Singleton
//    @Provides
//    fun provideSplashViewModelFactory(
//        application: Application,
//        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
//    ):SplashViewModelFactory{
//        return NewsViewModelFactory(
//            application,
//            getNewsHeadlinesUseCase
//        )
//    }
}