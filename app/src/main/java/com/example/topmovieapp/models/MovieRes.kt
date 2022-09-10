package com.example.topmovieapp.models

import com.google.gson.annotations.SerializedName

class MovieRes {
    @SerializedName("results") var movieList: List<Movie>? = null
}