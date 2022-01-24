package com.example.pokedex.network

import com.example.pokedex.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface EndPoints {

    @GET("pokemon/{id}")
    suspend fun capturarPokemon(
        @Path("id") id: Int
    ): Pokemon

}