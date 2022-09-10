package com.example.topmovieapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.topmovieapp.entities.MovieEntity


@Dao
interface MovieDao {

    @Query("SELECT * FROM MovieEntity")
    suspend fun getAll(): List<MovieEntity>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllOrders(order: List<MovieEntity>)

}