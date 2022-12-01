package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    public Connection connection;
    private String dbAddress = "jdbc:mysql://localhost:3306/thecoffeebreak";
    private String user = "root";
    private String password = "root";
    private String className = "com.mysql.cj.jdbc.Driver";

    public DatabaseManager() {
        connection = connect();
    }

    private Connection connect() {
        Connection conn = null;

        try {
            Class.forName(className);
            conn = DriverManager.getConnection(dbAddress, user, password);

            if (conn != null) {
                System.out.println("LOG: Connessione al database stabilita");
            } else {
                System.out.println("WARNING: Connessione al database non riuscita");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void resetTable(String tableName) {
        try {
            Statement st = connection.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS pokemon." + tableName);
            System.out.println("LOG: Eliminata tabella " + tableName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(String tableCreationQuery) {
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(tableCreationQuery);
            System.out.println("LOG: Tabella creata con successo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
