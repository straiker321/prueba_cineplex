package com.example.prueba.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.prueba.model.Peliculas
import com.example.prueba.R

class PeliculasViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val tvnombre = view.findViewById<TextView>(R.id.tvnombre)
    val tvfechaestreno = view.findViewById<TextView>(R.id.tvfecha_estreno)
    val tvgenero = view.findViewById<TextView>(R.id.tvgenero)
    val tvduracion = view.findViewById<TextView>(R.id.tvduracion)
    val ivPeliculas =view.findViewById<ImageView>(R.id.ivPeliculas)

    fun render(peliculas: Peliculas){
        tvnombre.text = peliculas.nombre
        tvfechaestreno.text = peliculas.fechaEstreno
        tvgenero.text = peliculas.genero
        tvduracion.text = peliculas.duracion
        Glide.with(ivPeliculas.context).load(peliculas.imagen).into(ivPeliculas);
    }


}