package com.example.pokedex.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.pokedex.R
import com.example.pokedex.model.Pokemon
import com.squareup.picasso.Picasso

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val teste = view?.findViewById<TextView>(R.id.message)
        val imgTeste = view?.findViewById<ImageView>(R.id.imagePokemon)

        viewModel.capturarPokemonCoroutinesOk()
        viewModel.pokemonLiveData.observe(this, Observer {

            teste?.text = it.name.toString().capitalize()

            Picasso.with(activity).load(it.sprites?.other?.officialArtwork?.frontDefault).into(imgTeste)

        })

    }

}