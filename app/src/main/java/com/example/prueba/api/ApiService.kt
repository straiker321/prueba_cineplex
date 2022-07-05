package com.example.prueba.api




import com.example.prueba.model.Peliculas
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("pelicula/")
    fun getPeliculas() : Call<List<Peliculas>>
}