package com.example.entrega.pantallas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.entrega.R
import com.example.entrega.databinding.FragmentSegundaBinding

class SegundaFragment : Fragment() {
    private var _binding: FragmentSegundaBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSegundaBinding.inflate(inflater,container, false)

        val view = binding.root
        binding.btnAdelante.setOnClickListener{
            view.findNavController().navigate(R.id.action_segundaFragment_to_menuFragment)
        }
        binding.btnAtras.setOnClickListener{
            view.findNavController().navigate(R.id.action_primeraFragment_to_menuFragment)
        }
        // Inflate the layout for this fragment
        return view
    }
}