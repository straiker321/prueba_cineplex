package com.example.prueba.api




import com.example.prueba.Peliculas
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("pelicula/")
    fun getPeliculas() : Call<List<Peliculas>>
}