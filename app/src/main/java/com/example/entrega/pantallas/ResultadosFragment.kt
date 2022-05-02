package com.example.entrega.pantallas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.entrega.R
import com.example.entrega.databinding.FragmentResultadosBinding


class ResultadosFragment : Fragment() {
    private var _binding:FragmentResultadosBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultadosBinding.inflate(inflater, container, false)

        val view = binding.root
        binding.btnAtras.setOnClickListener {
            view.findNavController().navigate(R.id.action_resultadosFragment_to_primeraFragment)
        }
        binding.btnHome.setOnClickListener {
            view.findNavController().navigate(R.id.action_resultadosFragment_to_menuFragment)
        }
        // Inflate the layout for this fragment
        return view
    }
}