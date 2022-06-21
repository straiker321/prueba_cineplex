package com.example.prueba

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.prueba.api.ApiService


import com.google.android.material.navigation.NavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
//    lateinit var service: ApiService
//    lateinit var rvcliente: RecyclerView
//    lateinit var rvpeliculas: RecyclerView
    lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //conexion base url para los servicios de peliculas en proceso de llamado a fragmentos

        //val retrofit: Retrofit = Retrofit.Builder()
            //.baseUrl("http://192.168.0.105:8070/")
            //.addConverterFactory(GsonConverterFactory.create())
            //.build()
        //rvpeliculas = findViewById(R.id.rvpeliculas)
        //rvpeliculas.layoutManager = LinearLayoutManager(this)
        //service = retrofit.create<ApiService>(ApiService::class.java)
        //obtenerLista()
        //obtenerCliente()
        val homeFragment = HomeFragment()
        val fragment : Fragment?=
            supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
        if (fragment !is HomeFragment){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentLayout,homeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
        val toolbar: androidx.appcompat.widget.Toolbar= findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        drawer = findViewById(R.id.drawer_layout)

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.app_navigation_drawer_open, R.string.app_navigation_drawer_close)
        drawer.addDrawerListener(toggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }
    //private fun obtenerLista(){
        //service.fetchAllPelicula().enqueue(object: Callback<List<Peliculas>>{
            //override fun onResponse(call: Call<List<Peliculas>>, response: Response<List<Peliculas>>) {
                //val pelicula = response?.body()
                //rvpeliculas.adapter = PeliculasAdapter(pelicula!!)
            //}

            //override fun onFailure(call: Call<List<Peliculas>>, t: Throwable) {
                //t?.printStackTrace()
            //}
        //})
    //}
            //private fun obtenerCliente(){
                //service.getAllPosts().enqueue(object: Callback<List<Cliente>>{
                    //override fun onResponse(call: Call<List<Cliente>>, response: Response<List<Cliente>>) {
                        //val cliente = response?.body()
                        //rvcliente.adapter = ClienteAdapter(cliente!!)
                    //}

                    //override fun onFailure(call: Call<List<Cliente>>, t: Throwable) {
                        //t?.printStackTrace()
                    //}
                //})
            //}

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

            item.isChecked = true

            when (item.itemId){
                R.id.nav_item_two -> Toast.makeText(this, "CINES", Toast.LENGTH_SHORT).show()
                R.id.nav_item_five -> Toast.makeText(this, "DULCERIA", Toast.LENGTH_SHORT).show()
                R.id.nav_item_nine -> replaceFragment(ProfileFragment(),item.title.toString())
            }

        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout,fragment)
        fragmentTransaction.commit()
        drawer.closeDrawers()
        setTitle(title)

    }



    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}