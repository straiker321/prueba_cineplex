package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.prueba.databinding.ActivityLoginBinding
import com.example.prueba.databinding.ActivityRegisterBinding
import com.example.prueba.databinding.ActivityRegisterSiguiente2Binding
import com.google.firebase.auth.FirebaseAuth


class Register_activity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.btnRegistro.setOnClickListener {
            val intent = Intent(this, Login_activity::class.java)
            startActivity(intent)
        }

        binding.btnRegistro.setOnClickListener {
            val email = binding.email.text.toString()
            val password = binding.pass.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {

                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "empty fields are not Allowed !!", Toast.LENGTH_SHORT).show()
            }
        }
    }
        override fun onStart() {
            super.onStart()

            if (firebaseAuth.currentUser != null) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
//        val btn_siguiente=findViewById<Button>(R.id.btn_siguiente2)
//        btn_siguiente.setOnClickListener{
//            val lanzar2 = Intent(this,Register_siguiente::class.java)
//            startActivity(lanzar2)
//        }
    }
