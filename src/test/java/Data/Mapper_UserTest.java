/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.LoginSampleException;
import Logic.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stoff
 */
public class Mapper_UserTest {

    private static Connection con;
    private static final String URL = "jdbc:mysql://167.99.209.146:3306/FOG?UseSSL=false";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin2019";

    public static void setConnection(Connection con) {
        con = con;
    }

    @Before
    public void setUp() {
        try {
            // awoid making a new connection for each test
            if (con == null) {
                String url = URL;
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(url);
                // Make mappers use test 
                Connector.setConnection(con);
            }
            // reset test database
            try (Statement stmt = con.createStatement()) {
                stmt.execute("drop table if exists Users");
                stmt.execute("create table Users like UsersTest");
                stmt.execute("insert into Users select * from UsersTest");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            con = null;
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull(con);
    }

    @Test
    public void testLogin01() throws LoginSampleException {
        // Can we log in
        User user = Mapper_User.login("jens@somewhere.com", "jensen");
        assertTrue(user != null);
    }

    @Test
    public void testLogin03() throws LoginSampleException {
        // Jens is supposed to be a customer
        User user = Mapper_User.login("jens@somewhere.com", "jensen");
        assertEquals("customer", user.getRole());
    }

    @Test
    public void testCreateUser01() throws LoginSampleException {
        // Can we create a new user - Notice, if login fails, this will fail
        // but so would login01, so this is OK
        User original = new User("king@kong.com", "uhahvorhemmeligt", "konge", "", "", "", "", "", "", "");
        Mapper_User.createUser(original);
        User retrieved = Mapper_User.login("king@kong.com", "uhahvorhemmeligt");
        assertEquals("konge", retrieved.getRole());
    }

}
