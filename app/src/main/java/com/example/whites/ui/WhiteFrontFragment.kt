package com.example.whites.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.whites.R
import com.example.whites.databinding.FragmentWhiteFrontBinding


class WhiteFrontFragment : Fragment() {

    private var binding: FragmentWhiteFrontBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentWhiteFrontBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.whiteFrontFragment = this
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_whiteFrontFragment_to_whiteListFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}