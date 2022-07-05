package com.example.prueba.model


import com.google.gson.annotations.SerializedName

data class Peliculas(
//    @SerializedName("censura")
//    val censura: String,
//    @SerializedName("cod_pelicula")
//    val codPelicula: Int,
//    @SerializedName("director")
//    val director: String,
    @SerializedName("nombre")
    val nombre: String,
    @SerializedName("duracion")
    val duracion: String,
    @SerializedName("fecha_estreno")
    val fechaEstreno: String,
    @SerializedName("genero")
    val genero: String,
    val imagen: String,
//    @SerializedName("productora")
//    val productora: String,
//    @SerializedName("sinopsis")
//    val sinopsis: String,
)