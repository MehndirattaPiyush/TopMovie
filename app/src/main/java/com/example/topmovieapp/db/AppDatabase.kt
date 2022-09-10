package com.example.topmovieapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.topmovieapp.entities.MovieEntity

@Database(entities = [MovieEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}