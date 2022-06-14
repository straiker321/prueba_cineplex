package com.example.prueba.apis

import com.example.prueba.Peliculas
import retrofit2.Call
import retrofit2.http.GET

interface ApiServicePeli
{
    @GET("/pelicula")
    fun getAllPosts(): Call<List<Peliculas>>
    
}