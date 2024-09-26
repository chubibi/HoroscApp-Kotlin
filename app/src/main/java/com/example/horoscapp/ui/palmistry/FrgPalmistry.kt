package com.example.horoscapp.ui.palmistry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscapp.databinding.FrgPalmistryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FrgPalmistry : Fragment() {

    private var _binding: FrgPalmistryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FrgPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}