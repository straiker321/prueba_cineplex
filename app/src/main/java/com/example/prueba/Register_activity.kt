package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btn_siguiente=findViewById<Button>(R.id.btn_siguiente)
        btn_siguiente.setOnClickListener{
            val lanzar2 = Intent(this,Register_siguiente::class.java)
            startActivity(lanzar2)
        }
    }
}