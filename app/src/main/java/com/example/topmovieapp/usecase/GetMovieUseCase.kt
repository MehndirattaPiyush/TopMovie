package com.example.topmovieapp.usecase

import com.example.topmovieapp.data.MovieRepository
import com.example.topmovieapp.entities.MovieEntity

class GetMovieUseCase(val movieRepository: MovieRepository) {

    suspend fun get():  List<MovieEntity>{
       return movieRepository.getMovieList()
    }
}