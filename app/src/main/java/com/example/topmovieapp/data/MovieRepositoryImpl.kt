package com.example.topmovieapp.data

import com.example.topmovieapp.db.AppDatabase
import com.example.topmovieapp.entities.MovieEntity
import com.example.topmovieapp.helper.EntityConverter

class MovieRepositoryImpl(
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) : MovieRepository {

    override suspend fun getMovieList(): List<MovieEntity> {
        val entities = appDatabase.movieDao().getAll()
        return if (entities == null || entities.isNotEmpty()) {
            entities!!
        } else {
            val list: List<MovieEntity> = apiService.getMovies().map {
                EntityConverter.movieToEntity(it)
            }
            appDatabase.movieDao().insertAllOrders(list)
            list
        }
    }

}