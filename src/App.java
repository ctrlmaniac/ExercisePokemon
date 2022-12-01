import java.util.ArrayList;

import models.Pokemon;

public class App {
    public static void main(String[] args) {
        PokemonFactory pokemonFactory = new PokemonFactory();

        Pokemon p1 = pokemonFactory.createPokemon(new Pokemon("Bulbasaur", "Erba-Veleno", 1));
        Pokemon p2 = pokemonFactory.createPokemon(new Pokemon("Charmander", "Fuoco", 1));
        Pokemon p3 = pokemonFactory.createPokemon(new Pokemon("Squirtle", "Acqua", 1));

        // Check if all pokemons where added
        pokemonFactory.getAllPokemon();

        // check if p3 is equals to pokemon with id 3
        System.out.println(pokemonFactory.getPokemonById(p1.getId()).equals(p1));

        // update p2
        p2.setName("Charmeleon");
        p2.setLevel(2);

        pokemonFactory.updatePokemon(p2);

        // Check if pokemon p2 where updated
        System.out.println(pokemonFactory.getPokemonById(p2.getId()));

        // Delete p3
        pokemonFactory.deletePokemon(p3);

        // Check if pokemon p3 where deleted
        pokemonFactory.getAllPokemon();

        // EX 2.1
        for (int id : Ex2.convertFromList2Array(pokemonFactory.getAllPokemon())) {
            System.out.println(id);
        }
    }
}
