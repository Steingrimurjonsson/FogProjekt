/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author artin
 */
public class UserTest {
     User instance = new User(47,"Test@TestMail.com","Password","Hans","The Destroyer Of Worlds","12345678","Street","City","zip","country","Harbringer of Doom");
    
    public UserTest() {
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
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        //User instance = null;
        String expResult = "Hans";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Hans";
      //  User instance = null;
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
       // User instance = new User(1,"he","er","we","ad","fd","fe","sq","qw","ss","aa");
        String expResult = "The Destroyer Of Worlds";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "The Destroyer Of Worlds";
      //  User instance = null;
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class User.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
       // User instance = null;
        String expResult = "12345678";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class User.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "12345678";
      //  User instance = null;
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStreet method, of class User.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
     //   User instance = null;
        String expResult = "Street";
        String result = instance.getStreet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStreet method, of class User.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "Street";
      //  User instance = null;
        instance.setStreet(street);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class User.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        //User instance = null;
        String expResult = "City";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class User.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "City";
      //  User instance = null;
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getZip method, of class User.
     */
    @Test
    public void testGetZip() {
        System.out.println("getZip");
     //   User instance = null;
        String expResult = "zip";
        String result = instance.getZip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setZip method, of class User.
     */
    @Test
    public void testSetZip() {
        System.out.println("setZip");
        String zip = "zip";
      //  User instance = null;
        instance.setZip(zip);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class User.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
       // User instance = null;
        String expResult = "country";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class User.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "country";
     //   User instance = null;
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
       // User instance = null;
        String expResult = "Test@TestMail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "Test@TestMail.com";
     //   User instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
       // User instance = null;
        String expResult = "Password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "Password";
      //  User instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
       // User instance = null;
        String expResult = "Harbringer of Doom";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String role = "Harbringer of Doom";
       // User instance = null;
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
     //   User instance = null;
        int expResult = 47;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 47;
       // User instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}