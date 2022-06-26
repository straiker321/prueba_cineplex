package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register_siguiente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_siguiente)
        val btn_siguiente2=findViewById<Button>(R.id.btn_siguiente2)
        btn_siguiente2.setOnClickListener{
            val lanzar2 = Intent(this,Register_siguiente2::class.java)
            startActivity(lanzar2)
        }
    }
}