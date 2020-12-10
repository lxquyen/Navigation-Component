package com.steve.navigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : BaseFragment<FragmentForgotPasswordBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentForgotPasswordBinding {
        return FragmentForgotPasswordBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }
}