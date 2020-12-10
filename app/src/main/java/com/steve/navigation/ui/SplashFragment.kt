package com.steve.navigation.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.steve.navigation.R
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }

        binding.btnMain.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("QuyenLx", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("QuyenLx", "onDestroy")
    }
}