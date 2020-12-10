package com.steve.navigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.steve.navigation.databinding.FragmentTermBinding

class TermFragment : Fragment() {
    private lateinit var binding: FragmentTermBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTermBinding.inflate(inflater, container, false)
        return binding.root
    }
}