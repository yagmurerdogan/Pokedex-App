package com.yagmurerdogan.pokedexapp.data.remote.responses

data class PokemonList(
    val abilities: List<AbilityXX>,
    val base_experience: Int,
    val forms: List<FormX>,
    val game_indices: List<GameIndiceX>,
    val height: Int,
    val held_items: List<Any>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<MoveXX>,
    val name: String,
    val order: Int,
    val past_types: List<Any>,
    val species: SpeciesX,
    val sprites: SpritesX,
    val stats: List<StatXX>,
    val types: List<TypeXX>,
    val weight: Int
)