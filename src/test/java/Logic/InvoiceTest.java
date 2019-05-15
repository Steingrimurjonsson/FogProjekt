/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;



/**
 *
 * @author stoff
 */
public class InvoiceTest  {
    
    Invoice invoice = new Invoice(69,240,420);
    
    public InvoiceTest() {
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
     * Test of getIdInvoice method, of class Invoice.
     */
    @Test
    public void testGetIdInvoice() {
        System.out.println("getIdInvoice");
        Invoice instance = invoice;
        int expResult = 69;
        int result = instance.getIdInvoice();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setIdInvoice method, of class Invoice.
     */
    @Test
    public void testSetIdInvoice() {
        System.out.println("setIdInvoice");
        int idInvoice = 69;
        Invoice instance = invoice;
        instance.setIdInvoice(idInvoice);
  
    }

    /**
     * Test of getIdUser method, of class Invoice.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Invoice instance = invoice;
        int expResult = 240;
        int result = instance.getIdUser();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setIdUser method, of class Invoice.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        int idUser = 240;
        Invoice instance = invoice;
        instance.setIdUser(idUser);
 
    }

    /**
     * Test of getPrice method, of class Invoice.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Invoice instance = invoice;
        double expResult = 420;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of setPrice method, of class Invoice.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 420;
        Invoice instance = invoice;
        instance.setPrice(price);
    }

    
   @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = null;
        Invoice instance = invoice;
        String expResult = "";
        String result = instance.execute(request, response);
        assertEquals(expResult, result);

    }
    
}
