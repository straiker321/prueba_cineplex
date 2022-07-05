package com.example.prueba.adapter

import com.example.prueba.model.Cines

class CinesProvider {
    companion object{
        val  cineslist= listOf<Cines>(
            Cines(
                "CP Alcazar",
                "Av.Santa Cruz 814-816",
                "2D,REGULAR,3D",
                "https://cdn.cineplanet.com.pe/contentAsset/raw-data/b70aa8b9-f9f9-49c5-8f7e-28e6afd5646f",

            ),
            Cines(
                "CP Arequipa Mall Plaza",
                "Av.Ejercito 793 Cayma",
                "2D,3D,REGULAR",
                "https://cdn.cineplanet.com.pe/contentAsset/raw-data/f0c0deba-02e8-4e07-9d70-ab29336bc551",

            )
        )
    }
}