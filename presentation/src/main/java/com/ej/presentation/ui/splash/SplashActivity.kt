package com.ej.presentation.ui.splash

import com.ej.presentation.R
import com.ej.presentation.base.BaseActivity
import com.ej.presentation.databinding.ActivitySplashBinding
import com.ej.presentation.viewmodel.splash.SplashViewModel
import androidx.activity.viewModels
import com.ej.domain.utils.ScreenState
import com.ej.presentation.BuildConfig
import com.ej.presentation.ui.snack.SnackActivity
import com.ej.presentation.widget.extension.startActivityAndFinish
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    private val splashViewModel by viewModels<SplashViewModel>()

    override fun init() {
        startActivityAndFinish(this,SnackActivity::class.java)
        // app 버전 체크 확인 후 SnackAcitivty로 넘어가기
//        observeViewModel()
//        splashViewModel.getVersion()
    }

    private fun observeViewModel() {
        splashViewModel.apiCallEvent.observe(this){
            when(it){
                ScreenState.LOADING -> {
                    if(splashViewModel.apiCallResultVersion.version==BuildConfig.APP_VERSION){
                        shortShowToast("최신 버전입니다")
                        this.startActivityAndFinish(this,SnackActivity::class.java)
                    }else{
                        shortShowToast("최신 버전이 아닙니다. 앱을 업데이트하세요")
                    }
                }
                ScreenState.ERROR ->toastErrorMsg(splashViewModel.apiErrorType)
                else -> shortShowToast("알수없는 오류가 발생하였습니다")
            }
        }
    }
}