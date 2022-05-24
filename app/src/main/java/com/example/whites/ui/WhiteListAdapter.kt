package com.example.whites.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.whites.databinding.ListViewItemBinding
import com.example.whites.network.White

class WhiteListAdapter(val clickListener: WhiteListener) :
    ListAdapter<White, WhiteListAdapter.WhiteViewHolder>(DiffCallback) {

    class WhiteViewHolder(
        var binding: ListViewItemBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: WhiteListener, white: White) {
            binding.white = white
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<White>() {

        override fun areItemsTheSame(oldItem: White, newItem: White): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: White, newItem: White): Boolean {
            return oldItem.occupation == newItem.occupation && oldItem.photo == newItem.photo
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhiteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return WhiteViewHolder(
            ListViewItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: WhiteViewHolder, position: Int) {
        val white = getItem(position)
        holder.bind(clickListener, white)
    }
}

class WhiteListener(val clickListener: (white: White) -> Unit) {
    fun onClick(white: White) = clickListener(white)
}