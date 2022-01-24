package com.example.pokedex.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokedex.model.Pokemon
import com.example.pokedex.repository.RepositoryApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val pokemonLiveData = MutableLiveData<Pokemon>()
    val repository = RepositoryApi()

    fun capturarPokemonCoroutinesOk(){
        CoroutineScope(Dispatchers.IO).launch {
            repository.capturarPokemonCoroutine().let {
                pokemonLiveData.postValue(it)
                }
            }
        }
}
