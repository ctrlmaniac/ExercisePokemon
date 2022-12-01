package persistance;

public class Queries {
    public static String createTablePokemon = """
            CREATE TABLE pokemon.pokemon(
                `id` INT PRIMARY KEY AUTOINCREMENT,
                `name` VARCHAR(50),
                `elementType` VARCHAR(50),
                `level` INT)
            """;
}
