package com.example.topmovieapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.topmovieapp.data.ApiServiceImpl
import com.example.topmovieapp.data.MovieRepositoryImpl
import com.example.topmovieapp.db.AppDatabase
import com.example.topmovieapp.entities.MovieEntity
import com.example.topmovieapp.usecase.GetMovieUseCase

class MovieViewModel: ViewModel() {

    lateinit var database: AppDatabase

    suspend fun getMovieList(): List<MovieEntity>{
        val movieRepository = MovieRepositoryImpl(ApiServiceImpl(), database)
        val getMovieUseCase = GetMovieUseCase(movieRepository)
       return getMovieUseCase.get()
    }

    fun onClickFab() {
    }

    fun setDataBase(db: AppDatabase){
        database = db
    }
}