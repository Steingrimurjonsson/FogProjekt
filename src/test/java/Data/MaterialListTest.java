/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.HashMap;
import java.util.Map;
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
public class MaterialListTest {

    Carport carport = new Carport(420, 69, "skur", true, 720, 35, "details", 50);
    MaterialList matList = new MaterialList(carport);

    public MaterialListTest() {
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
     * Test of addToList method, of class MaterialList.
     */
    @Test
    public void testAddToList() {
        System.out.println("addToList");
        Material material = new Material(420, "mats", 9001);
        int count = 12;
        MaterialList instance = matList;
        instance.addToList(material, count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarport method, of class MaterialList.
     */
    @Test
    public void testGetCarport() {
        System.out.println("getCarport");
        MaterialList instance = matList;
        Carport expResult = carport;
        Carport result = instance.getCarport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterials method, of class MaterialList.
     */
    @Test//TODO SPØRG ANDERS
    public void testGetMaterials() {
        System.out.println("getMaterials");
        Material material = new Material(420, "mats", 9001);
        Map<Material, Integer> mats = new HashMap();
        MaterialList instance = matList;
        mats.put(material, 0);
        Map<Material, Integer> expResult = mats<"mats","0">;
        Map<Material, Integer> result = instance.getMaterials();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
