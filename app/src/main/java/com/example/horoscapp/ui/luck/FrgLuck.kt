package com.example.horoscapp.ui.luck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscapp.databinding.FrgLuckBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FrgLuck : Fragment() {
    private var _binding: FrgLuckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FrgLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}