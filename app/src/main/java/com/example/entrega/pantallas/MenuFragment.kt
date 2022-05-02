package com.example.entrega.pantallas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.entrega.R

class MenuFragment : Fragment() {
    private var _binding: com.example.entrega.databinding.FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = com.example.entrega.databinding.FragmentMenuBinding.inflate(inflater,container, false)

        val view = binding.root
        binding.button.setOnClickListener{
            view.findNavController().navigate(R.id.action_menuFragment_to_primeraFragment)
        }
        binding.button2.setOnClickListener{
            view.findNavController().navigate(R.id.action_menuFragment_to_segundaFragment)
        }
        // Inflate the layout for this fragment
        return view
    }

}