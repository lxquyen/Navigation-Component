package com.steve.navigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.steve.navigation.R
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentMainBinding {
        return FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnSetting.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
        }

        binding.btnDetail.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_detailFragment)
        }
    }
}