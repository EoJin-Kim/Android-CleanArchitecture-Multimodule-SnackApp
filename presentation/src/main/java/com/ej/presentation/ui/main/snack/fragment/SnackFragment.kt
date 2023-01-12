package com.ej.presentation.ui.main.snack.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ej.presentation.R
import com.ej.presentation.base.BaseFragment
import com.ej.presentation.databinding.FragmentSnackBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class SnackFragment : BaseFragment<FragmentSnackBinding>(R.layout.fragment_snack) {

    val pickSnackFragment = PickSnackFragment.newInstance()
    val resultSnackFragment = ResultSnackFragment.newInstance()
    val pickShopFragment = PickShopFragment.newInstance()
    val fragList = arrayOf(pickSnackFragment, resultSnackFragment, pickShopFragment)
    val tabNameList = arrayOf("Today Snack", "Result Snack", "Pick Shop")

    override fun init() {
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MYTAG","snack create")
        val tabAdapter = object : FragmentStateAdapter(this) {
            override fun getItemCount(): Int {
                return fragList.size
            }
            override fun createFragment(position: Int): Fragment {
                return fragList[position]
            }
        }
        binding.pager2.adapter = tabAdapter

        // tab과 viewpager를 연결한다다
        TabLayoutMediator(
            binding.tabs,
            binding.pager2
        ) { tab: TabLayout.Tab, i: Int ->
            tab.text = tabNameList[i]
        }.attach()
    }
}