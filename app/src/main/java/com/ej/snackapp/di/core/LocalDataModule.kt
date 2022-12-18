package com.ej.snackapp.di.core

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


// 내장 sqlite 모듈
@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {
}