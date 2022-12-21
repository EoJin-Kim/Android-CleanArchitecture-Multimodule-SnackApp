package com.ej.presentation.ui.group

import androidx.annotation.DrawableRes
import com.ej.presentation.R
import com.ej.presentation.base.BaseActivity
import com.ej.presentation.databinding.ActivityGroupBinding

class GroupActivity : BaseActivity<ActivityGroupBinding>(R.layout.activity_group) {


    override fun init() {
        setBnvListener(R.id.groupActivity)
    }

    private fun setBnvListener(bnvMenuId: Int) {
        binding.bnvSnack.selectedItemId = bnvMenuId
        binding.bnvSnack.setOnItemSelectedListener(bnvSelectListener)
    }
}