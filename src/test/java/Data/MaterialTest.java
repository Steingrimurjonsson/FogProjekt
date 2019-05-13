/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stoff
 */
public class MaterialTest {
    
    Material mat = new Material(420,"mats", 9001);

    
    /**
     * Test of getId method, of class Material.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Material instance = mat;
        int expResult = 420;
        int result = instance.getId();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getMaterial method, of class Material.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        Material instance = mat;
        String expResult = "mats";
        String result = instance.getMaterial();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPrice method, of class Material.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Material instance = mat;
        double expResult = 9001;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
 
    }
    
}
