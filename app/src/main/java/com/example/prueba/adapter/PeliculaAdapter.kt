package com.example.prueba_consumo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.Peliculas
import com.example.prueba.R


class PeliculaAdapter(private var listaPelicula : List<Peliculas>) : RecyclerView.Adapter<PeliculaAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvnombre : TextView = itemView.findViewById(R.id.tvnombre)
        val tvfecha_estreno : TextView = itemView.findViewById(R.id.tvfecha_estreno)
        val tvgenero : TextView = itemView.findViewById(R.id.tvgenero)
        val tvduracion : TextView = itemView.findViewById(R.id.tvduracion)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater
            .from(parent.context)
        return PeliculaAdapter.ViewHolder(
            layoutInflater.inflate(
                R.layout.item_peliculas,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaPelicula[position]
        holder.tvfecha_estreno.text = item.fechaEstreno
        holder.tvnombre.text = item.nombre
        holder.tvgenero.text = item.genero
        holder.tvduracion.text = item.duracion
    }

    override fun getItemCount(): Int {
        return listaPelicula.size
    }
}