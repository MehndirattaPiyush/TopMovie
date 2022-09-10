package com.example.topmovieapp.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.topmovieapp.entities.MovieEntity

abstract class BaseRecyclerAdapter<T : Any, VH : BaseViewHolder<T>>(): RecyclerView.Adapter<VH>() {

    var data: List<MovieEntity>? = null


    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

}