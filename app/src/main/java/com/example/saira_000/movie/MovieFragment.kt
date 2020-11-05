package com.example.saira_000.movie

import android.graphics.Movie
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment(R.layout.fragment_movie) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val movieimage: Int = R.drawable.aquaman
        val movies: List<Movies> = listOf(
                Movies("Aquaman", R.drawable.aquaman),
                Movies("The Godfather", R.drawable.thegodfather),
                Movies("No Time To Die", R.drawable.notimetodie),
                Movies("Shaft", R.drawable.shaft),
                Movies("Joker", R.drawable.joker),

        )
        recylerview1.adapter = RecyclerViewAdapter(movies)
        recylerview2.adapter= RecyclerViewAdapter(movies)
    }
}