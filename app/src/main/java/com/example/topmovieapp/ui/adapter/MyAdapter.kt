package com.example.topmovieapp.ui.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.topmovieapp.databinding.ListItemBinding
import com.example.topmovieapp.entities.MovieEntity

class MyAdapter(): BaseRecyclerAdapter<MovieEntity, BaseViewHolder<MovieEntity>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MovieEntity> {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context))
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MovieEntity>, position: Int) {
        when(holder){
            is MyViewHolder -> {
                holder.bind(data?.get(position) ?: throw IllegalStateException())
            }
            else -> IllegalStateException()
        }
    }


}