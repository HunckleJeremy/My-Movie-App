package com.example.saira_000.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerViewAdapter (private val movies: List<Movies>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
   inner class ViewHolder (item:View): RecyclerView.ViewHolder(item){
       init {
           itemView.setOnClickListener { itemView.findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)}
       }

    }

    override fun getItemCount(): Int {
return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val image = movies[position].image
        val name = movies[position].name
        holder.itemView.apply {
            movieimage.setImageResource (image)
            textView2.text = name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(layoutInflater)
    }

}