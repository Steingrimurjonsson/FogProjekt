/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
public class CarportTest {
    
    Carport carportInstance = new Carport(420,69,"skur",true,720,35,"details",50);
    
    public CarportTest() {
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
     * Test of getLength method, of class Carport.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Carport instance = carportInstance;
        int expResult = 420;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Carport.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Carport instance = carportInstance;
        int expResult = 69;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterial method, of class Carport.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        Carport instance = carportInstance;
        String expResult = "skur";
        String result = instance.getMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isShed method, of class Carport.
     */
    @Test
    public void testIsShed() {
        System.out.println("isShed");
        Carport instance = carportInstance;
        boolean expResult = true;
        boolean result = instance.isShed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRoofSlope method, of class Carport.
     */
    @Test
    public void testGetRoofSlope() {
        System.out.println("getRoofSlope");
        Carport instance = carportInstance;
        int expResult = 50;
        int result = instance.getRoofSlope();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getShedWidth method, of class Carport.
     */
    @Test
    public void testGetShedWidth() {
        System.out.println("getShedWidth");
        Carport instance = carportInstance;
        int expResult = 720;
        int result = instance.getShedWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getShedLength method, of class Carport.
     */
    @Test
    public void testGetShedLength() {
        System.out.println("getShedLength");
        Carport instance = carportInstance;
        int expResult = 35;
        int result = instance.getShedLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDetails method, of class Carport.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Carport instance = carportInstance;
        String expResult = "details";
        String result = instance.getDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    
   
     
    public void testToString() {
        System.out.println("toString");
        Carport instance = carportInstance;
        String expResult = "Carport{" + "length="  + ", width="  + ", material=" +  ", shed=" +  ", Roofslope=" +  ", shedwidth=" +  ", shedlength=" +  ", details=" + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
