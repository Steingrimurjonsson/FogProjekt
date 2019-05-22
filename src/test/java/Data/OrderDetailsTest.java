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
public class OrderDetailsTest {
    
    OrderDetails orderDetail = new OrderDetails(1,2,3,4,5,6,7,8,9,10);
    
    public OrderDetailsTest() {
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
     * Test of getDoorHinge method, of class OrderDetails.
     */
    @Test
    public void testGetDoorHinge() {
        System.out.println("getDoorHinge");
        OrderDetails instance = orderDetail;
        int expResult = 1;
        int result = instance.getDoorHinge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setDoorHinge method, of class OrderDetails.
     */
    @Test
    public void testSetDoorHinge() {
        System.out.println("setDoorHinge");
        int doorHinge = 1;
        OrderDetails instance = orderDetail;
        instance.setDoorHinge(doorHinge);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getDoor method, of class OrderDetails.
     */
    @Test
    public void testGetDoor() {
        System.out.println("getDoor");
        OrderDetails instance = orderDetail;
        int expResult = 2;
        int result = instance.getDoor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setDoor method, of class OrderDetails.
     */
    @Test
    public void testSetDoor() {
        System.out.println("setDoor");
        int door = 2;
        OrderDetails instance = orderDetail;
        instance.setDoor(door);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getDoorHandle method, of class OrderDetails.
     */
    @Test
    public void testGetDoorHandle() {
        System.out.println("getDoorHandle");
        OrderDetails instance = orderDetail;
        int expResult = 3;
        int result = instance.getDoorHandle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setDoorHandle method, of class OrderDetails.
     */
    @Test
    public void testSetDoorHandle() {
        System.out.println("setDoorHandle");
        int doorHandle = 3;
        OrderDetails instance = orderDetail;
        instance.setDoorHandle(doorHandle);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getRoofScrew method, of class OrderDetails.
     */
    @Test
    public void testGetRoofScrew() {
        System.out.println("getRoofScrew");
        OrderDetails instance = orderDetail;
        int expResult = 4;
        int result = instance.getRoofScrew();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setRoofScrew method, of class OrderDetails.
     */
    @Test
    public void testSetRoofScrew() {
        System.out.println("setRoofScrew");
        int roofScrew = 4;
        OrderDetails instance = orderDetail;
        instance.setRoofScrew(roofScrew);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getScrew method, of class OrderDetails.
     */
    @Test
    public void testGetScrew() {
        System.out.println("getScrew");
        OrderDetails instance = orderDetail;
        int expResult = 5;
        int result = instance.getScrew();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setScrew method, of class OrderDetails.
     */
    @Test
    public void testSetScrew() {
        System.out.println("setScrew");
        int screw = 5;
        OrderDetails instance = orderDetail;
        instance.setScrew(screw);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getPost method, of class OrderDetails.
     */
    @Test
    public void testGetPost() {
        System.out.println("getPost");
        OrderDetails instance = orderDetail;
        int expResult = 6;
        int result = instance.getPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setPost method, of class OrderDetails.
     */
    @Test
    public void testSetPost() {
        System.out.println("setPost");
        int post = 6;
        OrderDetails instance = orderDetail;
        instance.setPost(post);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getWoodSide method, of class OrderDetails.
     */
    @Test
    public void testGetWoodSide() {
        System.out.println("getWoodSide");
        OrderDetails instance = orderDetail;
        int expResult = 7;
        int result = instance.getWoodSide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setWoodSide method, of class OrderDetails.
     */
    @Test
    public void testSetWoodSide() {
        System.out.println("setWoodSide");
        int woodSide = 7;
        OrderDetails instance = orderDetail;
        instance.setWoodSide(woodSide);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getWoodRoof method, of class OrderDetails.
     */
    @Test
    public void testGetWoodRoof() {
        System.out.println("getWoodRoof");
        OrderDetails instance = orderDetail;
        int expResult = 8;
        int result = instance.getWoodRoof();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setWoodRoof method, of class OrderDetails.
     */
    @Test
    public void testSetWoodRoof() {
        System.out.println("setWoodRoof");
        int woodRoof = 8;
        OrderDetails instance = orderDetail;
        instance.setWoodRoof(woodRoof);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getRoofStone method, of class OrderDetails.
     */
    @Test
    public void testGetRoofStone() {
        System.out.println("getRoofStone");
        OrderDetails instance = orderDetail;
        int expResult = 9;
        int result = instance.getRoofStone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setRoofStone method, of class OrderDetails.
     */
    @Test
    public void testSetRoofStone() {
        System.out.println("setRoofStone");
        int roofStone = 9;
        OrderDetails instance = orderDetail;
        instance.setRoofStone(roofStone);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of getRoofPlast method, of class OrderDetails.
     */
    @Test
    public void testGetRoofPlast() {
        System.out.println("getRoofPlast");
        OrderDetails instance = orderDetail;
        int expResult = 10;
        int result = instance.getRoofPlast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }

    /**
     * Test of setRoofPlast method, of class OrderDetails.
     */
    @Test
    public void testSetRoofPlast() {
        System.out.println("setRoofPlast");
        int roofPlast = 10;
        OrderDetails instance = orderDetail;
        instance.setRoofPlast(roofPlast);
        // TODO review the generated test code and remove the default call to //.
        //("The test case is a prototype.");
    }
    
}
