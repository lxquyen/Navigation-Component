package com.steve.navigation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.steve.navigation.R
import com.steve.navigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("QuyenLx", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        Log.i("QuyenLx", "onCreateView")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSetting.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
        }

        binding.btnDetail.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_detailFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("QuyenLx", "Main - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("QuyenLx", "Main - onDestroy")
    }
}