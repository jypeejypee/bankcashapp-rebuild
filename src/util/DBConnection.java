package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/bankcashapp_rebuild";
    private static final String USER = "postgres";
    private static final String PASS = System.getenv("BANKCASH_DB_PASS");

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }

}
