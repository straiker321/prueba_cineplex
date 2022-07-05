package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.prueba.databinding.ActivityLoginBinding
import com.example.prueba.databinding.ActivityRegisterBinding
import com.example.prueba.databinding.ActivityRegisterSiguiente2Binding


class Register_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_siguiente)

//        firebaseAuth = FirebaseAuth.getInstance()
//        binding.btnRegistrar.setOnClickListener {
//            val intent = Intent(this, ActivityLoginBinding::class.java)
//            startActivity(intent)
//        }
//
//        binding.btnRegistrar.setOnClickListener {
//            val corr = binding.editTextTextPersonName6.text.toString()
//            val password = binding.editTextTextPersonName7.text.toString()
//            if (corr.isNotEmpty() && password.isNotEmpty()) {
//
//                firebaseAuth.signInWithEmailAndPassword(corr, password).addOnCompleteListener {
//                    if (it.isSuccessful) {
//                        val intent = Intent(this, MainActivity::class.java)
//                        startActivity(intent)
//                    } else {
//                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//                    }
//                }
//            } else {
//                Toast.makeText(this, "empty fields are not Allowed !!", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        override fun onStart() {
//            super.onStart()
//
//            if (firebaseAuth.currentUser != null) {
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//            }
//        }
        val btn_siguiente=findViewById<Button>(R.id.btn_siguiente2)
        btn_siguiente.setOnClickListener{
            val lanzar2 = Intent(this,Register_siguiente::class.java)
            startActivity(lanzar2)
        }
    }
}