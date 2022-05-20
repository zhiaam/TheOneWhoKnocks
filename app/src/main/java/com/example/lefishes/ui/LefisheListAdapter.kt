package com.example.lefishes.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lefishes.databinding.ListViewItemBinding
import com.example.lefishes.network.Lefishe

class LefisheListAdapter(val clickListener: LefisheListener) :
    ListAdapter<Lefishe, LefisheListAdapter.LefisheViewHolder>(DiffCallback) {

    class LefisheViewHolder(
        var binding: ListViewItemBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: LefisheListener, lefishe: Lefishe) {
            binding.lefishe = lefishe
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Lefishe>() {

        override fun areItemsTheSame(oldItem: Lefishe, newItem: Lefishe): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Lefishe, newItem: Lefishe): Boolean {
            return oldItem.description == newItem.description && oldItem.photo == newItem.photo
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LefisheViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LefisheViewHolder(
            ListViewItemBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LefisheViewHolder, position: Int) {
        val lefishe = getItem(position)
        holder.bind(clickListener, lefishe)
    }
}

class LefisheListener(val clickListener: (lefishe: Lefishe) -> Unit) {
    fun onClick(lefishe: Lefishe) = clickListener(lefishe)
}