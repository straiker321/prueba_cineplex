package com.example.prueba.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.model.Cines


class CinesAdapter (val listaCines : List<Cines>) : RecyclerView.Adapter<CinesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinesViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CinesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = listaCines.size

}