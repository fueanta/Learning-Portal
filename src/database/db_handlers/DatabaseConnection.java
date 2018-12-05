package database.db_handlers;

import java.sql.Connection;
import java.sql.DriverManager;

class DatabaseConnection {
    private static volatile Connection connect; // multi thread supported
    private DatabaseConnection() { /* no access for outsiders */ }

    static Connection getConnection() {
        Connection locallyConnect = connect;
        if (locallyConnect == null) {
            synchronized (DatabaseConnection.class) { // multi thread supported, double checker lock
                locallyConnect = connect;
                if (locallyConnect == null) {
                    try {
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        // oracle driver: oracle.jdbc.driver.OracleDriver
                        // mysql driver: com.mysql.jdbc.Driver
                        connect = locallyConnect = DriverManager.getConnection(
                                "jdbc:oracle:thin:@localhost:1521:XE", "portal", "portal");
                        // mysql url: jdbc:mysql://localhost:3306/world
                        // oracle url: jdbc:oracle:thin:@localhost:1521:XE
                    }
                    catch(Exception ex) {
                        System.out.println("Could not connect with database, make sure the database is running.");
                    }
                }
            }
        }
        return locallyConnect;
    }
}                          