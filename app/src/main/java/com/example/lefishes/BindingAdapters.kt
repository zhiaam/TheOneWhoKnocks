package com.example.lefishes

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lefishes.network.Lefishe
import com.example.lefishes.ui.LefisheApiStatus
import com.example.lefishes.ui.LefisheListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Lefishe>?) {
    val adapter = recyclerView.adapter as LefisheListAdapter
    adapter.submitList(data)
}

@BindingAdapter("apiStatus")
fun bindStatus(statusImageView: ImageView, status: LefisheApiStatus?) {
    when(status) {
        LefisheApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        LefisheApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
        LefisheApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
    }
}
