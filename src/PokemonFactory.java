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
}
