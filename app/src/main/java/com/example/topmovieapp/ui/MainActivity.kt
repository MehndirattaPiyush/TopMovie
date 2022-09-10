package com.example.topmovieapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.topmovieapp.databinding.ActivityMainBinding
import com.example.topmovieapp.db.AppDatabase
import com.example.topmovieapp.ui.adapter.MyAdapter
import com.example.topmovieapp.viewmodel.MovieViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        setupDatabase()

        setUpRecyclerView(binding.mainContent.rlMovies)

        binding.fab.setOnClickListener { view ->
            viewModel.onClickFab()
        }
    }

    private fun setupDatabase() {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-movie"
        ).build()

        viewModel.setDataBase(db)
    }

    private fun setUpRecyclerView(rlMovies: RecyclerView) {
        val adapter = MyAdapter()
        rlMovies.adapter = adapter
        lifecycleScope.launch{
            adapter.data = viewModel.getMovieList()
            adapter.notifyDataSetChanged()
        }
    }

}