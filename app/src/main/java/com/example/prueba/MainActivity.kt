package com.example.prueba

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
//import com.example.prueba.api.ApiService


import com.google.android.material.navigation.NavigationView
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    private lateinit var currentFragment : Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // set home fragment as launcher
        supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout,HomeFragment()).commit()
        // now create a menu
        val bottomNav : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNav.setOnNavigationItemSelectedListener(bottomListener)

        val toolbar: Toolbar= findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        drawer = findViewById(R.id.drawer_layout)

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.app_navigation_drawer_open, R.string.app_navigation_drawer_close)
        drawer.addDrawerListener(toggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }
    private val bottomListener = BottomNavigationView.OnNavigationItemSelectedListener {
        // switch between ids of menu
        when(it.itemId){
            R.id.nav_home-> {
                currentFragment = HomeFragment()
            }
            R.id.nav_dulceria -> {
                currentFragment = DulceriaFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout,currentFragment).commit()
        true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

            item.isChecked = true

            when (item.itemId){

                R.id.nav_item_five -> replaceFragment(DulceriaFragment(),item.title.toString())
                R.id.nav_item_three -> replaceFragment(PromocionFragment(),item.title.toString())
                R.id.nav_item_four -> replaceFragment(SocioFragment(),item.title.toString())
                R.id.nav_item_nine -> replaceFragment(ProfileFragment(),item.title.toString())
                R.id.nav_item_six -> replaceFragment(ContactFragment(),item.title.toString())
                R.id.nav_item_seven -> replaceFragment(VtsFragment(),item.title.toString())
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


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
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