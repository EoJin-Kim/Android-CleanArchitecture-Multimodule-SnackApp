package com.ej.domain.repository

import com.ej.domain.model.DomainAppVersion
import com.ej.domain.utils.RemoteErrorEmitter

interface SplashRepository {
    suspend fun getAppVersion(remoteErrorEmitter: RemoteErrorEmitter,) : DomainAppVersion?
}