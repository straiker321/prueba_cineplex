package com.example.prueba.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.Peliculas
import com.example.prueba.R

class PeliculasAdapter(private val PeliculasList:List<Peliculas>) : RecyclerView.Adapter<PeliculasViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculasViewHolder(layoutInflater.inflate(R.layout.item_peliculas,parent,false))
    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val item = PeliculasList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = PeliculasList.size
}