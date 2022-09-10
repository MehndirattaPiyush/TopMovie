package com.example.topmovieapp.data

import com.example.topmovieapp.models.Movie

interface ApiService {

    suspend fun getMovies(): List<Movie>

}