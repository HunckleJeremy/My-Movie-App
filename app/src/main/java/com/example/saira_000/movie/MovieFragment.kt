package com.example.saira_000.movie

import android.graphics.Movie
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MovieFragment : Fragment(R.layout.fragment_movie) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        GlobalScope.launch(Dispatchers.IO) {
            val response = ApiService.apiService.getPopularMovies()
            val adapter = response?.body()?.results?.let { RecyclerViewAdapter(it) }
            withContext(Dispatchers.Main){
                recylerview1.adapter = adapter
                recylerview2.adapter= adapter
            }

        }
    }
}