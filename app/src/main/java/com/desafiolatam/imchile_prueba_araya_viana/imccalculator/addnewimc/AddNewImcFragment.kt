package com.imchile_prueba_araya_viana.imccalculator.addnewimc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.desafiolatam.imchile_prueba_araya_viana.databinding.AddNewImcFragmentBinding

class AddNewImcFragment : Fragment()
{
    private lateinit var binding: AddNewImcFragmentBinding
    //private val viewModel by viewModels<AddNewImcViewModel>()  despues   import androidx.fragment.app.viewModels

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        binding = AddNewImcFragmentBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }
}