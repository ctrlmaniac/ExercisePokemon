package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(Credentials.className);
            connection = DriverManager.getConnection(Credentials.dbAddress, Credentials.user, Credentials.password);

            if (connection != null) {
                System.out.println("LOG: Connessione al database stabilita");
            } else {
                System.out.println("WARNING: Connessione al database non riuscita");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
