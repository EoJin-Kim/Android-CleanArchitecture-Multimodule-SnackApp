package com.ej.presentation.viewmodel.splash

import android.app.Application
import androidx.lifecycle.AndroidViewModel
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
    private val app: Application,
    private val getAppVersionUseCase: GetAppVersionUseCase
): AndroidViewModel(app), RemoteErrorEmitter {

    private val _apiCallEvent = SingleLiveEvent<ScreenState>()
    val apiCallEvent: LiveData<ScreenState>
        get() = _apiCallEvent


    var apiCallResultVersion : DomainAppVersion? = null
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
    fun autoLoginCheck() : Boolean{
        return false
    }

    override fun onError(msg: String) {
        apiErrorMessage = msg
    }

    override fun onError(errorType: ErrorType) {
        apiErrorType = errorType
    }
}