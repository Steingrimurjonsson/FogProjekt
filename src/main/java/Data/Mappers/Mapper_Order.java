/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Mappers;

import Data.Connector;
import Data.Models.Model_Invoice;
import Data.Models.Model_OrderDetails;
import Data.Models.Model_Stock;
import Data.Models.Model_Order;
import Logic.Exceptions.CustomerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Logic.Exceptions.OrderException;
import java.sql.Statement;

/**
 *
 * @author stein
 */
public class Mapper_Order {

    /**
     * Method to create an order of a carport, and add it to the database
     *
     * @param order (Which contains idUser, length, width, roofMat, shed, slope,
     * shedLength, shedWidth)
     * @return order
     * @throws OrderException
     */
    public static Model_Order createOrder(Model_Order order) throws OrderException {
        try {
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
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());

        }
        return order;
    }

    /**
     * Gets the invoice of the user based on the userID from the database.
     *
     * @param idUser
     * @return list
     * @throws OrderException
     */
    public static List<Model_Invoice> getInvoice(int idUser) throws OrderException {
        List<Model_Invoice> list;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Invoice` where idUser = (?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                int idInvoice = rs.getInt("idInvoice");
                double price = rs.getDouble("price");

                Model_Invoice iv = new Model_Invoice(idInvoice, idUser, price);
                list.add(iv);

            }
            return list;

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }

    }

    /**
     * This method takes all orders in the database and puts them in an
     * arraylist.
     *
     * @return an arraylist (orderList) filled with all orders in the system
     * @throws OrderException
     */
    public static List<Model_Order> allOrders() throws OrderException {
        List<Model_Order> orderList = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Order`";
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idOrder = rs.getInt("idOrder");
                int idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                String roofMat = rs.getString("roofMat");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");

                Model_Order o = new Model_Order(idOrder, idUser, length, width, roofMat, shed, roofslope, shedLength, shedWidth);
                orderList.add(o);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return orderList;
    }

    /**
     * Gets all orders made by a specific user, from the UserID from the
     * database
     *
     * @param idUser
     * @return orderByUserIDList
     * @throws OrderException
     */
    public static List<Model_Order> allOrdersByUserID(int idUser) throws OrderException {
        List<Model_Order> orderByUserIDList;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Order` WHERE idUser=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            orderByUserIDList = new ArrayList<>();

            while (rs.next()) {
                int idOrder = rs.getInt("idOrder");
                idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                String roofMat = rs.getString("roofMat");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");

                Model_Order o = new Model_Order(idOrder, idUser, length, width, roofMat, shed, roofslope, shedLength, shedWidth);
                orderByUserIDList.add(o);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return orderByUserIDList;
    }

    /**
     * Gets a specific order based on the order's ID from the database.
     *
     * @param idOrder
     * @return order
     * @throws OrderException
     */
    public static Model_Order specificOrder(int idOrder) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Order` WHERE idOrder=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idUser = rs.getInt("idUser");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                String roofMat = rs.getString("roofMat");
                boolean shed = rs.getBoolean("shed");
                int roofslope = rs.getInt("slope");
                int shedLength = rs.getInt("shedLength");
                int shedWidth = rs.getInt("shedWidth");

                Model_Order order = new Model_Order(idOrder, idUser, length, width, roofMat, shed, roofslope, shedLength, shedWidth);
                return order;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return null;
    }

    /**
     * Creates orderdetails and inserts set order into the database
     *
     * @param od
     * @return od
     * @throws OrderException
     */
    public static Model_OrderDetails createOrderDetail(Model_OrderDetails od) throws OrderException {

        try {
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

        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());
        }
        return od;
    }

    /**
     * Retrives the specific order and the details based on the Id of set order.
     *
     * @param idOrder
     * @return od
     * @throws OrderException
     */
    public static Model_OrderDetails specificOrderDetails(int idOrder) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `OrderDetails` WHERE idOrder=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
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

                Model_OrderDetails od = new Model_OrderDetails(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);
                return od;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return null;
    }

    /**
     * Creates invoice and inserts into database.
     *
     * @param invoice
     * @return invoice
     * @throws OrderException
     */
    public static Model_Invoice createInvoice(Model_Invoice invoice) throws OrderException {
        try {
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

        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());

        }
        return invoice;

    }

    /**
     * Gets specific invoice based on orderID
     *
     * @param idOrder
     * @return inv
     * @throws OrderException
     */
    public static Model_Invoice specificInvoiceDetails(int idOrder) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Invoice` WHERE idOrder=(?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double totalPrice = rs.getDouble("totalPrice");
                Model_Invoice inv = new Model_Invoice(idOrder, totalPrice);
                return inv;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return null;
    }

    /**
     * gets materialId based on material description, so that we can use it in
     * updateStockById.
     *
     * @param material
     * @return idMaterial
     * @throws SQLException
     * @throws OrderException
     */
    public static int getStockIdByMaterial(String material) throws SQLException, OrderException {

        int idMaterial = 0;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT idMaterial FROM FOG.Stock where materialDesc = ?;";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, material);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idMaterial = rs.getInt("idMaterial");
                return idMaterial;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return idMaterial;
    }

    /**
     * Updates the stocklist, by using the materials used, when the order is
     * created, and using the id we got from getStockIdByMaterial.
     *
     * @param stockUsed
     * @param idMaterial
     * @throws OrderException
     */
    public static void updateStockById(int stockUsed, int idMaterial) throws OrderException {

        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE FOG.Stock set stock= stock- ? where idMaterial = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, stockUsed);
            ps.setInt(2, idMaterial);
            System.out.println(ps);
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }

    }

    public static List<Model_Stock> getStock() throws OrderException {
        List<Model_Stock> getStock;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `Stock`;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            getStock = new ArrayList<>();

            while (rs.next()) {
                int idMat = rs.getInt("idMaterial");
                String materialDesc = rs.getString("materialDesc");
                int stock = rs.getInt("stock");

                Model_Stock sL = new Model_Stock(idMat, materialDesc, stock);
                getStock.add(sL);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
        return getStock;
    }

    public static void addStockById(int idMaterial, int stock) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE FOG.Stock set stock= stock+ ? where idMaterial = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, stock);
            ps.setInt(2, idMaterial);
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }

    }

}
