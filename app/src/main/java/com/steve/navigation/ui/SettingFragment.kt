package com.steve.navigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.steve.navigation.R
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentSettingBinding

class SettingFragment : BaseFragment<FragmentSettingBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSettingBinding {
        return FragmentSettingBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_settingFragment_to_loginFragment)
        }
    }
}