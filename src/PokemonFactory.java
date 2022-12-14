import java.util.ArrayList;

import models.Pokemon;
import models.dao.PokemonDao;
import models.impl.PokemonDaoImpl;

public class PokemonFactory {
    private PokemonDao pokemonDao;

    public PokemonFactory() {
        pokemonDao = new PokemonDaoImpl();
    }

    public Pokemon createPokemon(Pokemon pokemon) {
        return pokemonDao.createPokemon(pokemon);
    }

    public ArrayList<Pokemon> getAllPokemon() {
        ArrayList<Pokemon> pokemons = pokemonDao.getAllPokemon();

        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }

        return pokemons;
    }

    public Pokemon getPokemonById(int id) {
        return pokemonDao.getPokemonById(id);
    }

    public void updatePokemon(Pokemon pokemon) {
        pokemonDao.updatePokemon(pokemon);
    }

    public void deletePokemon(Pokemon pokemon) {
        pokemonDao.deletePokemon(pokemon);
    }
}
