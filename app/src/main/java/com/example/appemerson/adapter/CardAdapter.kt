package com.example.appemerson.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appemerson.R
import com.example.appemerson.models.CardItem

class CardAdapter (private val items: List<CardItem>) : RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivCoach: ImageView = itemView.findViewById(R.id.ivCoach)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvGame: TextView = itemView.findViewById(R.id.tvGame)
        val tvLocation: TextView = itemView.findViewById(R.id.tvLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.ivCoach.setImageResource(item.photo)
        holder.tvName.text = item.name
        holder.tvGame.text = item.game
        holder.tvLocation.text = item.location
    }

    override fun getItemCount(): Int {
        return items.size
    }
}