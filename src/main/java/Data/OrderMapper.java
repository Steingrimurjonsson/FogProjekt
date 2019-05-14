/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Invoice;
import Logic.LoginSampleException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Logic.Order;
import Logic.User;
import java.sql.Statement;

/**
 *
 * @author stein
 */
public class OrderMapper {
    
      public static void createOrder(Order order) throws Exception
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Order` (idOrder, idUser, length, width, material, shed, slope, shedLength, shedWidth, details) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getOrderID());
            ps.setInt(2, order.getUserID());
            ps.setInt(3, order.getLength());
            ps.setInt(4, order.getWidth());
            ps.setInt(5, order.getMaterialID());
            ps.setBoolean(6, order.isShed());
            ps.setInt(7, order.getRoofSlope());
            ps.setInt(8, order.getShedLength());
            ps.setInt(9, order.getShedWidth());
            ps.setString(10, order.getDetails());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
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
    
      public static List<Order> allOrders() throws Exception
    {
        List<Order> orderList = new ArrayList();
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Order`";
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int idOrder = rs.getInt("idOrder");
                int idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int material = rs.getInt("idMaterial");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");
                String details = rs.getString("details");

                Order o = new Order(idOrder, idUser, length, width, material, shed, roofslope, shedLength, shedWidth, details);
                orderList.add(o);
             }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new Exception(ex.getMessage());
        }
        return orderList;
    }
}