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
 * @author jojus1101
 */
public class CarportMapper {

    public static void makeCarportFlat(Carport carport) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO 'CarportMain'(length, width, material, shed, shedwidth, shedlength) VALUES ?,?,?,?,?,?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, carport.getLength());
            ps.setInt(2, carport.getWidth());
            ps.setString(3, carport.getMaterial());
            ps.setBoolean(4, false);
            ps.setInt(5, carport.getShedWidth());
            ps.setInt(6, carport.getShedLength());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static void makeCarportRoof(Carport carport) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO 'CarportMain'(length, width, material, roofslope, shed, shedwidth, shedlength) VALUES ?,?,?,?,?,?,?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, carport.getLength());
            ps.setInt(2, carport.getWidth());
            ps.setString(3, carport.getMaterial());
            ps.setInt(7, carport.getRoofSlope());
            ps.setBoolean(4, false);
            ps.setInt(5, carport.getShedWidth());
            ps.setInt(6, carport.getShedLength());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
}
