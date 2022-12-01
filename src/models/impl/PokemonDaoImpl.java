package models.impl;

import java.sql.Connection;
import java.util.List;

import models.Pokemon;
import models.dao.PokemonDao;
import persistance.DatabaseManager;

public class PokemonDaoImpl implements PokemonDao {
    private DatabaseManager db;
    private Connection conn;

    public PokemonDaoImpl() {
        db = new DatabaseManager();
        conn = db.connection;
        createTable();
    }

    private void createTable() {
        db.resetTable("pokemon");
        db.createTable("""
                CREATE TABLE pokemon.pokemon(
                    `id` INT PRIMARY KEY AUTO_INCREMENT,
                    `name` VARCHAR(50),
                    `elementType` VARCHAR(50),
                    `level` INT
                )
                """);
    }

    @Override
    public Pokemon createPokemon(Pokemon pokemon) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pokemon getPokemonById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updatePokemon(Pokemon pokemon) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deletePokemon(Pokemon pokemon) {
        // TODO Auto-generated method stub

    }

}
