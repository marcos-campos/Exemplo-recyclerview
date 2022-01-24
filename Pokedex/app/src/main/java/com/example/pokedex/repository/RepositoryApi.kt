package com.example.pokedex.repository

import com.example.pokedex.model.Pokemon
import com.example.pokedex.network.EndPoints
import com.example.pokedex.network.RetrofitInit

class RepositoryApi {

    private var url = "https://pokeapi.co/api/v2/"

    private var service = EndPoints::class

    private val conectionService = RetrofitInit(url).create(service)

    suspend fun capturarPokemonCoroutine(): Pokemon = conectionService.capturarPokemon(6)


}