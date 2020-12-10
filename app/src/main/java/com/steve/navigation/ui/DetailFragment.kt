package com.steve.navigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentDetailBinding {
        return FragmentDetailBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}