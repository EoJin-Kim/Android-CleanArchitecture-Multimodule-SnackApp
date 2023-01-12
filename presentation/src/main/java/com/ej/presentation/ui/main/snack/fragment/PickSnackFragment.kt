package com.ej.presentation.ui.main.snack.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ej.presentation.R
import com.ej.presentation.base.BaseFragment
import com.ej.presentation.databinding.FragmentPickSnackBinding


class PickSnackFragment : BaseFragment<FragmentPickSnackBinding>(R.layout.fragment_pick_snack) {

    override fun init() {
        Log.d("MYTAG","pick snack create")
    }

    companion object{
        @JvmStatic
        fun newInstance() = PickSnackFragment()
    }

}