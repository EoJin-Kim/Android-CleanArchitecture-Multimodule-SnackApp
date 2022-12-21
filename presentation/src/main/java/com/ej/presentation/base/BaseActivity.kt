package com.ej.presentation.base

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.ej.domain.utils.ErrorType
import com.ej.presentation.R
import com.ej.presentation.ui.group.GroupActivity
import com.ej.presentation.ui.map.MapActivity
import com.ej.presentation.ui.option.OptionActivity
import com.ej.presentation.ui.snack.SnackActivity
import com.ej.presentation.widget.extension.startActivityAndFinish
import com.google.android.material.navigation.NavigationBarView

//BaseActivity.kt
abstract class BaseActivity<T : ViewDataBinding>(@LayoutRes private val layoutResId: Int) : AppCompatActivity() {

    protected lateinit var binding: T
    private var waitTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)
        init()
    }

    abstract fun init()

    override fun onBackPressed() {
        if (System.currentTimeMillis() - waitTime >= 1500) {
            waitTime = System.currentTimeMillis()
            Toast.makeText(this, "뒤로가기 버튼을 한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()
        } else finish()
    }

    protected fun shortShowToast(msg: String) =
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    protected fun longShowToast(msg: String) =
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

    protected fun toastErrorMsg(apiErrorType : ErrorType) {
        when (apiErrorType) {
            ErrorType.NETWORK -> longShowToast("네트워크 오류가 발생했습니다")
            ErrorType.SESSION_EXPIRED -> longShowToast("세션이 만료되었습니다")
            ErrorType.TIMEOUT -> longShowToast("호출 시간이 초과되었습니다")
            ErrorType.UNKNOWN -> longShowToast("예기치 못한 오류가 발생하였습니다.")
            else -> shortShowToast("알수없는 오류가 발생하였습니다")
        }
    }

    val bnvSelectListener = NavigationBarView.OnItemSelectedListener { menu ->
            when (menu.itemId) {
                R.id.snackActivity -> this@BaseActivity.startActivityAndFinish(this@BaseActivity, SnackActivity::class.java)
                R.id.groupActivity -> this@BaseActivity.startActivityAndFinish(this@BaseActivity, GroupActivity::class.java)
                R.id.mapActivity -> this@BaseActivity.startActivityAndFinish(this@BaseActivity, MapActivity::class.java)
                R.id.optionActivity -> this@BaseActivity.startActivityAndFinish(this@BaseActivity, OptionActivity::class.java)
            }
            true
        }
}