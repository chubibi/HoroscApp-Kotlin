package com.example.horoscapp.ui.horoscope

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.horoscapp.databinding.FrgHoroscopeBinding
import com.example.horoscapp.ui.horoscope.vm.HoroscopeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FrgHoroscope : Fragment() {

    private val horoscopeViewModel by viewModels<HoroscopeViewModel>() //Forma de llamar al vm y que esten enlazados

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
        initUI()
    }

    private fun initUI() {
        initUIState()
    }

    private fun initUIState(){
        /*Aqui vamos a crear una corutina lifecycleScope porque esta se engancha al ciclo de vida del fragmento.*/
        //Siempre se usa lifecycleScope en Fragment
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeViewModel.horoscope.collect{
                    Log.i("Jos", it.toString())
                }
            }
        }
    }
}