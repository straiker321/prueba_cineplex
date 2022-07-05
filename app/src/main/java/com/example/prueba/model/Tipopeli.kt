package com.example.prueba.model


import com.google.gson.annotations.SerializedName

data class Tipopeli(
    @SerializedName("cod_tipo")
    val codTipo: Int,
    @SerializedName("tipo")
    val tipo: String
)