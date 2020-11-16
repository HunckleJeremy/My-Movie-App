package com.example.saira_000.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_view_item.view.*
import kotlinx.android.synthetic.main.viewpageritem.view.*

class RecyclerViewAdapter (private val movies: List<Result>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
   inner class ViewHolder (item:View): RecyclerView.ViewHolder(item){
       init {
           itemView.setOnClickListener { itemView.findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)}
       }

    }

    override fun getItemCount(): Int {
return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = "https://image.tmdb.org/t/p/w500${movies[position].backdropPath}"

        val name = movies[position].title
        holder.itemView.apply {
            Picasso.get().load(image).into(movieimage)

            textView2.text = name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(layoutInflater)
    }

}