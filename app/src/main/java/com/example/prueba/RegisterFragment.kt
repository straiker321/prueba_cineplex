package com.example.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.prueba.databinding.FragmentLoginBinding
import com.example.prueba.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentRegisterBinding.inflate(layoutInflater)
        val loginFragment = LoginFragment()
        bind.button.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragmentLayout, loginFragment, LoginFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
        return bind.root
    }


}