package models.dao;

import java.util.ArrayList;

import models.Pokemon;

public interface PokemonDao {
    public Pokemon createPokemon(Pokemon pokemon);

    public Pokemon getPokemonById(int id);

    public ArrayList<Pokemon> getAllPokemon();

    public void updatePokemon(Pokemon pokemon);

    public void deletePokemon(Pokemon pokemon);
}
