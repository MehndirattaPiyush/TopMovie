package com.example.topmovieapp.ui.adapter

import com.bumptech.glide.Glide
import com.example.topmovieapp.databinding.ListItemBinding
import com.example.topmovieapp.entities.MovieEntity

class MyViewHolder(val binding: ListItemBinding): BaseViewHolder<MovieEntity>(binding.root) {

    override fun bind(entity: MovieEntity) {
        with(entity){
            Glide.with(binding.ivImage.context).load(image).into(binding.ivImage)
            binding.tvName.text = name
            binding.tvRating.text = rating
            binding.tvPlaylist.text = playlist
        }

    }


}