package com.ej.domain.usecase

import com.ej.domain.model.DomainAppVersion
import com.ej.domain.repository.SplashRepository
import com.ej.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class GetAppVersionUseCase @Inject constructor(
    private val splashRepository : SplashRepository
) {
    suspend fun excute(remoteErrorEmitter: RemoteErrorEmitter,): DomainAppVersion?{
        return splashRepository.getAppVersion(remoteErrorEmitter)
    }
}