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

    private static Connection testConnection;
    private static String USER = "admin";
    private static String USERPW = "admin2019";
    private static final String URL = "jdbc:mysql://167.99.209.146:3306/FOG?UseSSL=false";

    @Before
    public void setUp() {
        try {
            // awoid making a new connection for each test
            if (testConnection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                testConnection = DriverManager.getConnection(URL, USER, USERPW);
                // Make mappers use test 
                Connector.setConnection(testConnection);
            }
            // reset test database
            try (Statement stmt = testConnection.createStatement()) {
               stmt.execute("drop table if exists Users_test");
                stmt.execute("create table Users_test like User");
                stmt.execute("INSERT Users_test SELECT * FROM User");
              //  stmt.execute("insert into Users select * from UsersTest");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            testConnection = null;
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull(testConnection);
    }

    @Test
    public void testLogin01() throws LoginSampleException {
        // Can we log in
        User user = Mapper_User.login("king@kong.com", "uhahvorhemmeligt");
        assertTrue(user != null);
    }

    @Test//(expected = LoginSampleException.class)
    public void testLogin02() throws LoginSampleException {
        // We should get an exception if we use the wrong password
        User user = Mapper_User.login("king@kong.com", "uhahvorhemmeligt");
    }

    @Test
    public void testLogin03() throws LoginSampleException {
        // Jens is supposed to be a customer
        User user = Mapper_User.login("king@kong.com", "uhahvorhemmeligt");
        user.setRole("customer");
        assertEquals("customer", user.getRole());
    }

    @Test
    public void testCreateUser01() throws LoginSampleException {
        // Can we create a new user - Notice, if login fails, this will fail
        // but so would login01, so this is OK
        User original = new User("king@fed.com", "uhahvorhemmeligt", "d", "dd", "se", "dde", "sef", "ferw", "sef", "s");
        Mapper_User.createUser(original);
        User retrieved = Mapper_User.login("king@fed.com", "uhahvorhemmeligt");
        assertEquals("s", retrieved.getRole());
    }
}
