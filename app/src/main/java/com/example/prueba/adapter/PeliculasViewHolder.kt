package com.example.prueba.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.Peliculas
import com.example.prueba.R

class   PeliculasViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val titulo = view.findViewById<TextView>(R.id.tvTitulo)
    val descripcion = view.findViewById<TextView>(R.id.tvDescripcion)
    val photo = view.findViewById<ImageView>(R.id.ivPeliculas)

    fun render(peliculasModel: Peliculas){
        titulo.text = peliculasModel.titulo
        descripcion.text = peliculasModel.descripcion

    }
}