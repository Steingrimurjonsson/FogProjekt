/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Logic.LoginSampleException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author stein
 */
public class Mapper_Carport {
    public static void makeCarportFlat (Model_Carport carport) throws LoginSampleException {
        try{
            Connection con = Connector.connection();
            String SQL = "INSERT INTO 'CarportMain'(length, width, material, shed) VALUES ?,?,?,?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, carport.getLength());
            ps.setInt(2, carport.getWidth());
            ps.setString(3, carport.getMaterial());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
    }
}
    public static void makeCarportRoof(Model_Carport carport) throws LoginSampleException{
        
    }
}