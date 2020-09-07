package com.imchile_prueba_araya_viana.imccalculator.imcs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.desafiolatam.imchile_prueba_araya_viana.databinding.ImcsFragmentBinding
import com.imchile_prueba_araya_viana.imccalculator.databinding.BmisFragmentBinding

class ImcsFragment : Fragment()
{
    private lateinit var binding: ImcsFragmentBinding
    // private val viewModel by viewModels<ImcsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        binding = ImcsFragmentBinding.inflate(
            inflater, container, false
        )
        return binding.root
    }
}