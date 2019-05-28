/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Logic.Models.Model_Invoice;
import Logic.Models.Model_Order;
import Logic.Models.Model_OrderDetails;
import Logic.Models.Model_Stock;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sus
 */
public class Mapper_OrderTest {
    
    public Mapper_OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createOrder method, of class Mapper_Order.
     */
    @Test
    public void testCreateOrder() throws Exception {
        System.out.println("createOrder");
        Model_Order order = null;
        Model_Order expResult = null;
        Model_Order result = Mapper_Order.createOrder(order);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvoice method, of class Mapper_Order.
     */
    @Test
    public void testGetInvoice() throws Exception {
        System.out.println("getInvoice");
        int idUser = 0;
        List<Model_Invoice> expResult = null;
        List<Model_Invoice> result = Mapper_Order.getInvoice(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allOrders method, of class Mapper_Order.
     */
    @Test
    public void testAllOrders() throws Exception {
        System.out.println("allOrders");
        List<Model_Order> expResult = null;
        List<Model_Order> result = Mapper_Order.allOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allOrdersByUserID method, of class Mapper_Order.
     */
    @Test
    public void testAllOrdersByUserID() throws Exception {
        System.out.println("allOrdersByUserID");
        int idUser = 0;
        List<Model_Order> expResult = null;
        List<Model_Order> result = Mapper_Order.allOrdersByUserID(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specificOrder method, of class Mapper_Order.
     */
    @Test
    public void testSpecificOrder() throws Exception {
        System.out.println("specificOrder");
        int idOrder = 0;
        Model_Order expResult = null;
        Model_Order result = Mapper_Order.specificOrder(idOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOrderDetail method, of class Mapper_Order.
     */
    @Test
    public void testCreateOrderDetail() throws Exception {
        System.out.println("createOrderDetail");
        Model_OrderDetails od = null;
        Model_OrderDetails expResult = null;
        Model_OrderDetails result = Mapper_Order.createOrderDetail(od);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specificOrderDetails method, of class Mapper_Order.
     */
    @Test
    public void testSpecificOrderDetails() throws Exception {
        System.out.println("specificOrderDetails");
        int idOrder = 0;
        Model_OrderDetails expResult = null;
        Model_OrderDetails result = Mapper_Order.specificOrderDetails(idOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInvoice method, of class Mapper_Order.
     */
    @Test
    public void testCreateInvoice() throws Exception {
        System.out.println("createInvoice");
        Model_Invoice invoice = null;
        Model_Invoice expResult = null;
        Model_Invoice result = Mapper_Order.createInvoice(invoice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specificInvoiceDetails method, of class Mapper_Order.
     */
    @Test
    public void testSpecificInvoiceDetails() throws Exception {
        System.out.println("specificInvoiceDetails");
        int idOrder = 0;
        Model_Invoice expResult = null;
        Model_Invoice result = Mapper_Order.specificInvoiceDetails(idOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockIdByMaterial method, of class Mapper_Order.
     */
    @Test
    public void testGetStockIdByMaterial() throws Exception {
        System.out.println("getStockIdByMaterial");
        String material = "";
        int expResult = 0;
        int result = Mapper_Order.getStockIdByMaterial(material);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStockById method, of class Mapper_Order.
     */
    @Test
    public void testUpdateStockById() throws Exception {
        System.out.println("updateStockById");
        int stockUsed = 0;
        int idMaterial = 0;
        Mapper_Order.updateStockById(stockUsed, idMaterial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class Mapper_Order.
     */
    @Test
    public void testGetStock() throws Exception {
        System.out.println("getStock");
        List<Model_Stock> expResult = null;
        List<Model_Stock> result = Mapper_Order.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStockById method, of class Mapper_Order.
     */
    @Test
    public void testAddStockById() throws Exception {
        System.out.println("addStockById");
        int idMaterial = 0;
        int stock = 0;
        Mapper_Order.addStockById(idMaterial, stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
