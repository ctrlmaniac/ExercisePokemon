import models.Pokemon;

public class App {
    public static void main(String[] args) {
        PokemonFactory pokemonFactory = new PokemonFactory();

        Pokemon p1 = pokemonFactory.createPokemon(new Pokemon("Bulbasaur", "Erba-Veleno", 1));
        Pokemon p2 = pokemonFactory.createPokemon(new Pokemon("Charmander", "Fuoco", 1));
        Pokemon p3 = pokemonFactory.createPokemon(new Pokemon("Squirtle", "Acqua", 1));

        pokemonFactory.getAllPokemon();

        System.out.println(pokemonFactory.getPokemonById(p3.getId()).equals(p3));
    }
}
