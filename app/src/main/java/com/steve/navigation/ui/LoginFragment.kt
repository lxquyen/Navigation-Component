package com.steve.navigation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.steve.navigation.R
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("QuyenLx", "LoginFragment - onCreate")
    }

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnMain.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }

        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.btnForgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("QuyenLx", "LoginFragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("QuyenLx", "LoginFragment - onDestroy")
    }
}