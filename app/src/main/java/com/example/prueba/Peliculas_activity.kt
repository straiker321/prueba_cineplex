package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.api.ApiService
import com.example.prueba.model.Peliculas
import com.example.prueba_consumo.adapter.PeliculaAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Peliculas_activity : AppCompatActivity() {
    lateinit var service: ApiService
    lateinit var rvpeliculas: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peliculas)
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.105:8070/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        rvpeliculas = findViewById(R.id.rvpeliculas)
        rvpeliculas.layoutManager = LinearLayoutManager(this)
        service = retrofit.create<ApiService>(ApiService::class.java)
        obtenerLista()
    }

    private fun obtenerLista(){
        service.getPeliculas().enqueue(object: Callback<List<Peliculas>> {
            override fun onResponse(call: Call<List<Peliculas>>, response: Response<List<Peliculas>>) {
                val pelicula = response?.body()
                rvpeliculas.adapter = PeliculaAdapter(pelicula!!)
            }

            override fun onFailure(call: Call<List<Peliculas>>, t: Throwable) {
                t?.printStackTrace()
            }
        })
    }
}