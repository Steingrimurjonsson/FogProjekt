/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noell
 */
public class ConnectorTest {
    
   @Test
    public void testGetConnection() throws  ClassNotFoundException, SQLException {
        Connector singleton = new Connector();
        Connection con = singleton.connection();
        boolean expResult = true;
        boolean result = con != null;
        assertEquals(expResult, result);
    }
}