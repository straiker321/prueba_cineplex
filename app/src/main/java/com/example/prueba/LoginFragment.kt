package com.example.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.prueba.databinding.FragmentLoginBinding


class LoginFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentLoginBinding.inflate(layoutInflater)
        val registerFragment = RegisterFragment()
        bind.btnRegistrar.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragmentLayout, registerFragment, RegisterFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
        return bind.root

    }


}