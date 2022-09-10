package com.example.topmovieapp.data

import com.example.topmovieapp.entities.MovieEntity

interface MovieRepository {

    suspend fun getMovieList(): List<MovieEntity>

}