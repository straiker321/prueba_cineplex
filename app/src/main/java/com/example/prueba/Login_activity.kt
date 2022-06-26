package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btn_inicar=findViewById<Button>(R.id.btn_inicar)
        btn_inicar.setOnClickListener{
            val lanzar = Intent(this,MainActivity::class.java)
            startActivity(lanzar)
        }
//        val btn_inicar=findViewById<Button>(R.id.btn_inicar)
//        btn_inicar.setOnClickListener{
//            val lanzar = Intent(this,Peliculas_activity::class.java)
//            startActivity(lanzar)
//        }
        val btn_registrar=findViewById<Button>(R.id.btn_registrar)
        btn_registrar.setOnClickListener{
            val lanzar1 = Intent(this,Register_activity::class.java)
            startActivity(lanzar1)
        }

    }
}