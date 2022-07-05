package com.example.prueba
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import com.example.prueba.databinding.ActivityLoginBinding
import com.example.prueba.databinding.ActivityRegisterBinding


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
            val lanzar2 = Intent(this,Register_activity::class.java)
            startActivity(lanzar2)
        }


//        firebaseAuth = FirebaseAuth.getInstance()
//        binding.btnRegistrar.setOnClickListener {
//            val intent = Intent(this, ActivityRegisterBinding::class.java)
//            startActivity(intent)
//        }
//        binding.btnInicar.setOnClickListener {
//            val email = binding.email.text.toString()
//            val password = binding.password.text.toString()
//            val pass = binding.confirmPass.text.toString()
//            if(email.isNotEmpty() && password.isNotEmpty() && pass.isNotEmpty()){
//                if(password == pass){
//                    firebaseAuth.createUserWithEmailAndPassword(email , password).addOnCompleteListener {
//                        if (it.isSuccessful){
//                            val intent = Intent(this, ActivityRegisterBinding::class.java)
//                            startActivity(intent)
//                        }else{
//                            Toast.makeText(this, it.exception.toString(),Toast.LENGTH_SHORT).show()
//                        }
//                    }
//
//                }else{
//                    Toast.makeText(this,"pass no encontrada", Toast.LENGTH_SHORT).show()
//                }
//            }else{
//                Toast.makeText(this,"empty fields are not Allowed !!", Toast.LENGTH_SHORT).show()
//            }
//        }
    }

}