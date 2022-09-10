package com.example.topmovieapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MovieEntity(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "image") val image: String?,
    @ColumnInfo(name = "rating") val rating: String?,
    @ColumnInfo(name = "playlist") val playlist: String?,
    @ColumnInfo(name = "favorite") val favorite: Boolean?

){

}
