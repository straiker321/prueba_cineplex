package com.example.prueba

import com.google.gson.annotations.SerializedName

data class Peliculas(
    @SerializedName("duracion")
    val duracion: String,
    @SerializedName("fecha_estreno")
    val fechaEstreno: String,
    @SerializedName("genero")
    val genero: String,
    @SerializedName("imagen")
    val imagen: String,
    @SerializedName("nombre")
    val nombre: String,
)
