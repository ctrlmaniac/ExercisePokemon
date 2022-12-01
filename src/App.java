import models.Pokemon;

public class App {
    public static void main(String[] args) {
        PokemonFactory pokemonFactory = new PokemonFactory();

        Pokemon p1 = pokemonFactory.createPokemon(new Pokemon("Bulbasaur", "Erba-Veleno", 1));

        System.out.println(p1);
    }
}
