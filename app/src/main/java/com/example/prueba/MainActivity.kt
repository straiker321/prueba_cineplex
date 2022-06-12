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
import com.example.prueba.adapter.PeliculasAdapter
import com.example.prueba.adapter.PeliculasViewHolder
import com.google.android.material.navigation.NavigationView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

            item.isChecked = true

            when (item.itemId){
                R.id.nav_item_one -> replaceFragment(PeliculasFragment(),item.title.toString())
                R.id.nav_item_two -> Toast.makeText(this, "CINES", Toast.LENGTH_SHORT).show()
                R.id.nav_item_five -> Toast.makeText(this, "DULCERIA", Toast.LENGTH_SHORT).show()
                R.id.nav_item_nine -> replaceFragment(LoginFragment(),item.title.toString())
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

    private fun initRecycleView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPeliculas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PeliculasAdapter(PeliculasProvider.PeliculasList)
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