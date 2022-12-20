package com.ej.presentation.ui.snack.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ej.presentation.R
import com.ej.presentation.base.BaseFragment
import com.ej.presentation.databinding.FragmentPickShopBinding


class PickShopFragment : BaseFragment<FragmentPickShopBinding>(R.layout.fragment_pick_shop) {

    override fun init() {

    }

    companion object{
        @JvmStatic
        fun newInstance() = PickShopFragment()
    }

}