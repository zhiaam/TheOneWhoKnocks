package com.example.lefishes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lefishes.R
import com.example.lefishes.databinding.FragmentLefisheListBinding


class LefisheListFragment : Fragment() {
    private val viewModel: LefisheViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLefisheListBinding.inflate(inflater)
        viewModel.getLefisheList()
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.recyclerView.adapter = LefisheListAdapter(LefisheListener { lefishe ->
            viewModel.onLefisheClicked(lefishe)
            findNavController()
                .navigate(R.id.action_lefisheListFragment_to_lefisheDetailFragment)
        })

        return binding.root
    }
}