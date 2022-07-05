package com.example.prueba_consumo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.model.Peliculas

import com.example.prueba.R
import com.example.prueba.adapter.PeliculasViewHolder


class PeliculaAdapter(private val listaPelicula : List<Peliculas>) : RecyclerView.Adapter<PeliculasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculasViewHolder(layoutInflater.inflate(R.layout.item_peliculas, parent, false)
        )

    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val item = listaPelicula[position]
        holder.render(item)

    }

    override fun getItemCount(): Int {
        return listaPelicula.size
    }
}