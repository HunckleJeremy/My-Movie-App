package com.example.saira_000.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.viewpageritem.view.*


class ViewPagerAdapter(val images: List<Result>): RecyclerView.Adapter<ViewPagerAdapter.MyViewHolder>() {
    
    inner class MyViewHolder(item: View): RecyclerView.ViewHolder(item){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewpageritem, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val image = "https://image.tmdb.org/t/p/w500${images[position].backdropPath}"
        Picasso.get().load(image).into(holder.itemView.viewPagerimage)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}