package com.example.testrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(val songs: List<Songs>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_vew,parent,false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return  songs.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txt_title.text = songs[position].title
        holder.txt_description.text = songs[position].description
        holder.song_image.setImageResource(songs[position].picture)

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt_title =itemView.findViewById<TextView>(R.id.txt_title_id)
        var txt_description =  itemView.findViewById<TextView>(R.id.txt_description_id)
        var song_image = itemView.findViewById<ImageView>(R.id.song_image_id)

    }
}
