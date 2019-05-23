package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to connect to the database to get informationen
 * from the database and add to the database

 @author kasper
 */
public class Connector {

     private static final String URL = "jdbc:mysql://167.99.209.146:3306/FOG?UseSSL=false";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin2019";


    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    /**
     *
     * @return singleton
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        }
        return singleton;
    }

}
