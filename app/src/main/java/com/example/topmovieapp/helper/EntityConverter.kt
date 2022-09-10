package com.example.topmovieapp.helper

import com.example.topmovieapp.entities.MovieEntity
import com.example.topmovieapp.models.Movie

object EntityConverter {

    fun movieToEntity(movie: Movie): MovieEntity{
        return MovieEntity(1, movie.name, movie.url, movie.rating, null, null)
    }

}