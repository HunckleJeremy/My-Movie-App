package com.example.saira_000.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.fragment_movie.*

class DetailsFragment : Fragment(R.layout.fragment_details) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        toolbar3.setNavigationOnClickListener {
            it.findNavController().navigateUp()
        }


        val movieimage: Int = R.drawable.aquaman
        val movies: List<Movies> = listOf(
            Movies("Aquaman", R.drawable.aquaman),
            Movies("The Godfather", R.drawable.thegodfather),
            Movies("No Time To Die", R.drawable.notimetodie),
            Movies("Shaft", R.drawable.shaft),
            Movies("Joker", R.drawable.joker),)
        rvCast.adapter = RecyclerViewAdapter(movies)
    }

}