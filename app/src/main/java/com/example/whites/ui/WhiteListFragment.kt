package com.example.whites.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.whites.R
import com.example.whites.databinding.FragmentWhiteListBinding


class WhiteListFragment : Fragment() {
    private val viewModel: WhiteViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentWhiteListBinding.inflate(inflater)
        viewModel.getWhiteList()
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.recyclerView.adapter = WhiteListAdapter(WhiteListener { white ->
            viewModel.onWhiteClicked(white)
            findNavController()
                .navigate(R.id.action_whiteListFragment_to_whiteDetailFragment)
        })

        return binding.root
    }
}