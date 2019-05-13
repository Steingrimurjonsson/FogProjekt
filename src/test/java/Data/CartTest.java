/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
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
public class CartTest {

    ArrayList<Carport> carports = new ArrayList();
    Cart cart = new Cart(47);
    /**
     * Test of getCarport method, of class Cart.
     */
    @Test
    public void testGetCarport() {
        System.out.println("getCarport");
        Cart instance = cart;
        ArrayList<Carport> expResult = carports;
        ArrayList<Carport> result = instance.getCarport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setCarport method, of class Cart.
     */
    @Test
    public void testSetCarport() {
        System.out.println("setCarport");
        ArrayList<Carport> carport = carports;
        Cart instance = cart;
        instance.setCarport(carport);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of addToCart method, of class Cart.
     */
    @Test
    public void testAddToCart() {
        System.out.println("addToCart");
        Carport carport = new Carport(420,69,"skur",true,720,35,"details",50);
        Cart instance = cart;
        instance.addToCart(carport);
        // TODO review the generated test code and remove the default call to fail.        fail("The test case is a prototype.");
    }

    /**
     * Test of clearCart method, of class Cart.
     */
    @Test
    public void testClearCart() {
        System.out.println("clearCart");
        Cart instance = cart;
        instance.clearCart();
        // TODO review the generated test code and remove the default call to fail.        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSpecificItem method, of class Cart.
     */
    @Test
    public void testRemoveSpecificItem() {
        System.out.println("removeSpecificItem");
        Carport carport =  new Carport(420,69,"skur",true,720,35,"details",50);
        cart.addToCart(carport);
        int itemNumber = 0;
        Cart instance = cart;
        instance.removeSpecificItem(itemNumber);
        // TODO review the generated test code and remove the default call to fail        fail("The test case is a prototype.");
    }

}
