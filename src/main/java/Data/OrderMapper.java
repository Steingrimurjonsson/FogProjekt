/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.CustomerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Logic.Order;
import Logic.OrderException;
import Logic.User;
import java.sql.Statement;

/**
 *
 * @author stein
 */
public class OrderMapper
{

    public static Order createOrder(Order order) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Order` (idUser, length, width, roofMat, shed, slope, shedLength, shedWidth) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, order.getUserID());
            ps.setInt(2, order.getLength());
            ps.setInt(3, order.getWidth());
            ps.setString(4, order.getroofMat());
            ps.setBoolean(5, order.isShed());
            ps.setInt(6, order.getRoofSlope());
            ps.setInt(7, order.getShedLength());
            ps.setInt(8, order.getShedWidth());

            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            order.setOrderID(id);
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderException(ex.getMessage());

        }
        return order;
    }

    public static List<Invoice> getInvoice(int idUser) throws OrderException
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
            throw new OrderException(ex.getMessage());
        }

    }
    //This is not ready yet, it's just a draft of what orderlist COULD look like. Will edit once we decide on order structure

    public static List<Order> allOrders() throws OrderException
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
                String roofMat = rs.getString("roofMat");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");

                Order o = new Order(idOrder, idUser, length, width, roofMat, shed, roofslope, shedLength, shedWidth);
                orderList.add(o);
            }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return orderList;
    }

    public static List<Order> allOrdersByUserID(int idUser) throws OrderException
    {
        List<Order> orderByUserIDList;
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Order` WHERE idUser=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            orderByUserIDList = new ArrayList<>();

            while (rs.next())
            {
                int idOrder = rs.getInt("idOrder");
                idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                String roofMat = rs.getString("roofMat");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");

                Order o = new Order(idOrder, idUser, length, width, roofMat, shed, roofslope, shedLength, shedWidth);
                orderByUserIDList.add(o);
            }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return orderByUserIDList;
    }

    public static Order specificOrder(int idOrder) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Order` WHERE idOrder=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                int idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                String roofMat = rs.getString("roofMat");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");

                Order order = new Order(idOrder, idUser, length, width, roofMat, shed, roofslope, shedLength, shedWidth);
                return order;
            }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return null;
    }

    public static OrderDetails createOrderDetail(OrderDetails od) throws OrderException
    {

        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `OrderDetails` (idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, od.getIdOrder());
            ps.setInt(2, od.getDoorHinge());
            ps.setInt(3, od.getDoor());
            ps.setInt(4, od.getDoorHandle());
            ps.setInt(5, od.getRoofScrew());
            ps.setInt(6, od.getScrew());
            ps.setInt(7, od.getPost());
            ps.setInt(8, od.getWoodSide());
            ps.setInt(9, od.getWoodRoof());
            ps.setInt(10, od.getRoofStone());
            ps.setInt(11, od.getRoofPlast());

            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return od;
    }

    public static OrderDetails specificOrderDetails(int idOrder) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `OrderDetails` WHERE idOrder=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                int doorHinge = rs.getInt("doorHinge");
                int door = rs.getInt("door");
                int doorHandle = rs.getInt("doorHandle");
                int roofScrew = rs.getInt("roofScrew");
                int screw = rs.getInt("screw");
                int post = rs.getInt("post");
                int woodSide = rs.getInt("woodSide");
                int woodRoof = rs.getInt("woodRoof");
                int roofStone = rs.getInt("roofStone");
                int roofPlast = rs.getInt("roofPlast");

                OrderDetails od = new OrderDetails(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);
                return od;
            }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return null;
    }

    public static Invoice createInvoice(Invoice invoice) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Invoice` (idOrder, totalPrice) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, invoice.getIdOrder());
            ps.setDouble(2, invoice.getPrice());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            invoice.setIdInvoice(id);

        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderException(ex.getMessage());

        }
        return invoice;

    }

    public static Invoice specificInvoiceDetails(int idOrder) throws OrderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Invoice` WHERE idOrder=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                double totalPrice = rs.getDouble("totalPrice");
                Invoice inv = new Invoice(idOrder, totalPrice);
                return inv;
            }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return null;
    }

    public static int getStockIdByMaterial(String material) throws SQLException, OrderException
    {

        int idMaterial = 0;
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT idMaterial FROM FOG.Stock where materialDesc = ?;";
            
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, material);
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                idMaterial = rs.getInt("idMaterial");
                return idMaterial;
            }

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
        return idMaterial;
    }

    public static void updateStockById(int stockUsed, int idMaterial) throws OrderException
    {

        try
        {
            Connection con = Connector.connection();
            String SQL = "UPDATE FOG.Stock set stock= stock- ? where idMaterial = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, stockUsed);
            ps.setInt(2, idMaterial);
            System.out.println(ps);
             ps.executeUpdate();
            

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderException(ex.getMessage());
        }
     
    }
}

