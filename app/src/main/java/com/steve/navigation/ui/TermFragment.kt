package com.steve.navigation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.steve.navigation.base.BaseFragment
import com.steve.navigation.databinding.FragmentTermBinding

class TermFragment : BaseFragment<FragmentTermBinding>() {

    override fun initBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentTermBinding {
        return FragmentTermBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }
}