package com.ej.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ej.domain.model.DomainAppVersion
import com.ej.domain.usecase.GetAppVersionUseCase
import com.ej.domain.utils.ErrorType
import com.ej.domain.utils.RemoteErrorEmitter
import com.ej.domain.utils.ScreenState
import com.ej.presentation.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val getAppVersionUseCase: GetAppVersionUseCase
): ViewModel(), RemoteErrorEmitter {

    private val _apiCallEvent = SingleLiveEvent<ScreenState>()
    val apiCallEvent: LiveData<ScreenState>
        get() = _apiCallEvent


    var apiCallResultVersion = DomainAppVersion("0.0.0")
    var apiErrorType = ErrorType.UNKNOWN
    var apiErrorMessage = "none"
    fun getVersion() {
        viewModelScope.launch{
            getAppVersionUseCase.excute(this@SplashViewModel).let { response ->
                if(response!=null){
                    apiCallResultVersion = response
                    _apiCallEvent.postValue(ScreenState.LOADING)
                }
                else{
                    _apiCallEvent.postValue(ScreenState.ERROR)
                }
            }
        }
    }

    override fun onError(msg: String) {
        apiErrorMessage = msg
    }

    override fun onError(errorType: ErrorType) {
        apiErrorType = errorType
    }
}