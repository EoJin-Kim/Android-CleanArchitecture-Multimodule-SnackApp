package com.ej.presentation.ui.snack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.ej.presentation.R
import com.ej.presentation.base.BaseActivity
import com.ej.presentation.databinding.ActivitySnackBinding
import com.ej.presentation.ui.group.GroupActivity
import com.ej.presentation.ui.map.MapActivity
import com.ej.presentation.ui.option.OptionActivity
import com.ej.presentation.widget.extension.startActivityAndFinish
import com.google.android.material.navigation.NavigationBarView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SnackActivity : BaseActivity<ActivitySnackBinding>(R.layout.activity_snack) {


    override fun init() {
        setBnvListener(R.id.snackActivity)
    }

    private fun setBnvListener(bnvMenuId: Int) {
        binding.bnvSnack.selectedItemId = bnvMenuId
        binding.bnvSnack.setOnItemSelectedListener(bnvSelectListener)
    }
}