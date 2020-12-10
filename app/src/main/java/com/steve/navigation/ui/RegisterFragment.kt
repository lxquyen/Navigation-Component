package com.steve.navigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.steve.navigation.R
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentRegisterBinding

class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentRegisterBinding {
        return FragmentRegisterBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnTerm.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_termFragment)
        }

        binding.btnMain.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_mainFragment)
        }
    }
}