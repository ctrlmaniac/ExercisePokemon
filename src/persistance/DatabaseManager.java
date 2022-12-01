package persistance;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private Connection conn;

    public DatabaseManager() {
        conn = ConnectionFactory.getConnection();
        resetTable("pokemon");
        createTable(Queries.createTablePokemon);
    }

    private void resetTable(String tableName) {
        try {
            Statement st = conn.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS pokemon." + tableName);
            System.out.println("Eliminata tabella " + tableName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable(String tableCreationQuery) {
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(tableCreationQuery);
            System.out.println("LOG: Tabella creata con successo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
