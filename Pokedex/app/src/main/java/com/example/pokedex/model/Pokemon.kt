package com.example.pokedex.model

import com.google.gson.annotations.SerializedName

data class Pokemon(

    val abilities: List<Ability>?,

    val base_experience: Int?,

    val forms: List<Form>?,

    @SerializedName("game_indices")
    val gameIndices: List<GameIndice>?,

    val height: Int?,

    @SerializedName("held_items")
    val heldItems: List<HeldItem>?,

    val id: Int?,

    @SerializedName("is_default")
    val isDefault: Boolean?,

    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String?,

    val moves: List<Move>?,

    val name: String?,

    val order: Int?,

    val species: Species?,

    val sprites: Sprites?,

    val stats: List<Stat>?,

    val types: List<Type>?,

    val weight: Int?
)