package com.example.horoscapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscapp.databinding.FrgHoroscopeBinding

class FrgHoroscope : Fragment() {

    private var _binding: FrgHoroscopeBinding? = null
    private val binding get() = _binding!! // !! = Esto nunca sera nulo

    //Método principal cuando un activity carga el fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FrgHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}