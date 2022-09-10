package com.example.topmovieapp.data

import com.example.topmovieapp.db.AppDatabase
import com.example.topmovieapp.entities.MovieEntity
import com.example.topmovieapp.helper.EntityConverter

class MovieRepositoryImpl(private val apiService: ApiService, private val appDatabase: AppDatabase): MovieRepository {

    override suspend fun getMovieList(): List<MovieEntity> {
       return appDatabase.movieDao().getAll()?.let {
            it
        } ?: run {
           val list: List<MovieEntity> = apiService.getMovies().map {
               EntityConverter.movieToEntity(it)
           }
           appDatabase.movieDao().insertAllOrders(list)
           list
       }
    }

}