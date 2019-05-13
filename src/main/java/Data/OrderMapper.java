/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stein
 */
public class OrderMapper {
     public static List<Invoice> getInvoice(int idUser) throws Exception
    {
        List<Invoice> list;
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Invoice` where idUser = (?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next())
            {
                int idInvoice = rs.getInt("idInvoice");
                double price = rs.getDouble("price");
                

                Invoice iv = new Invoice(idInvoice, idUser, price);
                list.add(iv);
                
            }
              return list;

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new Exception(ex.getMessage());
        }
      
    }
      //This is not ready yet, it's just a draft of what orderlist COULD look like. Will edit once we decide on order structure
    
     /* public static List<Order> allOrders() throws Exception
    {
        List<Order> list = new ArrayList();
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `order`";
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int  = rs.getInt("idOrder");
                int idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int material = rs.getInt("idMaterial")
                boolean shed = rs.getBoolean("shed");
                int shedWidth = rs.getInt("shedWidth")
                int shedLength = rs.getInt("shedLength")
                String details = rs.getString("details")
                int roofslope = rs.getInt("slope")
              

                Order o = new Carport(idOrder,idUser, length, width, height,material, shed, shedWidth, shedLength, details, roofslope)
                list.add(o);
            }*/ 
}
