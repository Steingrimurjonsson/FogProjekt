/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Invoice;
import Logic.Order;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stoff
 */
public class OrderMapperTest {

    private static Connection testConnection;
    private static String USER = "admin";
    private static String USERPW = "admin2019";
    private static final String URL = "jdbc:mysql://167.99.209.146:3306/FOG?UseSSL=false";

    OrderDetails orderDetail = new OrderDetails(1, 2, 34, 4, 5, 6, 7, 8, 9, 10);

    @Before
    public void setUp() throws SQLException {
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

    public OrderMapperTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createOrder method, of class OrderMapper.
     */
    @Test
    public void testCreateOrder() throws Exception {
        System.out.println("createOrder");
        Order order = null;
        OrderMapper.createOrder(order);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvoice method, of class OrderMapper.
     */
    @Test
    public void testGetInvoice() throws Exception {
        System.out.println("getInvoice");
        int idUser = 0;
        List<Invoice> expResult = null;
        List<Invoice> result = OrderMapper.getInvoice(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allOrders method, of class OrderMapper.
     */
    @Test
    public void testAllOrders() throws Exception {
        System.out.println("allOrders");
        List<Order> expResult = null;
        List<Order> result = OrderMapper.allOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allOrdersByUserID method, of class OrderMapper.
     */
    @Test
    public void testAllOrdersByUserID() throws Exception {
        System.out.println("allOrdersByUserID");
        int idUser = 0;
        List<Order> expResult = null;
        List<Order> result = OrderMapper.allOrdersByUserID(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specificOrder method, of class OrderMapper.
     */
    @Test
    public void testSpecificOrder() throws Exception {
        System.out.println("specificOrder");
        int idOrder = 0;
        Order expResult = null;
        Order result = OrderMapper.specificOrder(idOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOrderDetail method, of class OrderMapper.
     */
    @Test
    public void testCreateOrderDetail() throws Exception {
        System.out.println("createOrderDetail");
        OrderDetails od = orderDetail;
        OrderMapper.createOrderDetail(od);
   
    }

}
