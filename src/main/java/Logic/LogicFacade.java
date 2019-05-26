package Logic;

import Logic.Exceptions.OrderException;
import Logic.Exceptions.CustomerException;
import Data.Models.Model_User;
import Data.Models.Model_Order;
import Data.Models.Model_Invoice;
import Data.Mappers.Mapper_User;
import Data.Models.Model_OrderDetails;
import Data.Mappers.Mapper_Order;
import Data.Models.Model_Stock;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sus
 */
public class LogicFacade {

    /**
     * Userlogin with email and password
     *
     * @param email
     * @param password
     * @return
     * @throws CustomerException
     */
    public static Model_User login(String email, String password) throws CustomerException {
        return Mapper_User.login(email, password);
    }

    /**
     *
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param phone
     * @param street
     * @param city
     * @param zip
     * @param country
     * @return
     * @throws CustomerException
     */
    public static Model_User createUser(String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws CustomerException {
        Model_User user = new Model_User(email, password, firstName, lastName, phone, street, city, zip, country, "customer");
        Mapper_User.createUser(user);
        return user;
    }

    /**
     *
     * @param idUser
     * @return
     * @throws Exception
     */
    public static List<Model_Invoice> getOrders(int idUser) throws Exception {
        List<Model_Invoice> orders = Mapper_Order.getInvoice(idUser);
        return orders;
    }

    /**
     *
     * @param userID
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param phone
     * @param street
     * @param city
     * @param zip
     * @param country
     * @return
     * @throws CustomerException
     */
    public static Model_User editUser(int userID, String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws CustomerException {
        Model_User user = new Model_User(userID, email, password, firstName, lastName, phone, street, city, zip, country, phone);
        Mapper_User.editUser(user);
        return user;
    }

    /**
     *
     * @return @throws Exception
     */
    public static List<Model_User> allUsers() throws Exception {
        return Mapper_User.allUsers();

    }

    /**
     *
     * @return @throws Exception
     */
    public static List<Model_Order> getAllOrders() throws Exception {
        return Mapper_Order.allOrders();
    }

    /**
     *
     * @param idUser
     * @return
     * @throws Exception
     */
    public static List<Model_Order> getAllOrdersByUserID(int idUser) throws Exception {
        return Mapper_Order.allOrdersByUserID(idUser);
    }

    /**
     *
     * @param userID
     * @param length
     * @param width
     * @param roofMat
     * @param shed
     * @param roofSlope
     * @param shedLength
     * @param shedWidth
     * @return
     * @throws OrderException
     */
    public static Model_Order createOrder(int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) throws OrderException {
        Model_Order order = new Model_Order(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);
        Mapper_Order.createOrder(order);
        return order;
    }

    /**
     *
     * @param idOrder
     * @return
     * @throws OrderException
     */
    public static Model_Order specificOrder(int idOrder) throws OrderException {
        return Mapper_Order.specificOrder(idOrder);
    }

    /**
     *
     * @param idOrder
     * @param doorHinge
     * @param door
     * @param doorHandle
     * @param roofScrew
     * @param screw
     * @param post
     * @param woodSide
     * @param woodRoof
     * @param roofStone
     * @param roofPlast
     * @return order details
     * @throws OrderException
     */
    public static Model_OrderDetails createOrderDetail(int idOrder, int doorHinge, int door, int doorHandle, int roofScrew, int screw, int post, int woodSide, int woodRoof, int roofStone, int roofPlast) throws OrderException {
        Model_OrderDetails orderD = new Model_OrderDetails(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);
        Mapper_Order.createOrderDetail(orderD);
        return orderD;
    }

    /**
     * calls the corrosponding method in the Mapper_Order and gives us the
 details for the specific order.
     *
     * @param idOrder
     * @return orderdetails for the order ID it's given.
     * @throws OrderException
     */
    public static Model_OrderDetails specificOrderDetails(int idOrder) throws OrderException {
        return Mapper_Order.specificOrderDetails(idOrder);
    }

    /**
     * Creates invoice, shows price and order ID.
     *
     * @param idOrder
     * @param totalPrice
     * @return invoice
     * @throws OrderException
     */
    public static Model_Invoice createInvoice(int idOrder, double totalPrice) throws OrderException {
        Model_Invoice invoice = new Model_Invoice(idOrder, totalPrice);
        Mapper_Order.createInvoice(invoice);
        return invoice;
    }

    /**
     * Shows invoice for specific order.
     *
     * @param idOrder
     * @return
     * @throws OrderException
     */
    public static Model_Invoice specificInvoiceDetails(int idOrder) throws OrderException {
        return Mapper_Order.specificInvoiceDetails(idOrder);
    }

    /**
     * Calls corrosponding method in Mapper_Order
     *
     * @param material
     * @return
     * @throws SQLException
     * @throws OrderException
     */
    public static int getStockIdByMaterial(String material) throws SQLException, OrderException {
        return Mapper_Order.getStockIdByMaterial(material);
    }

    /**
     * Updates stock
     *
     * @param stockUsed
     * @param idMaterial
     * @throws OrderException
     */
    public static void updateStockById(int stockUsed, int idMaterial) throws OrderException {
        Mapper_Order.updateStockById(stockUsed, idMaterial);
    }

    /**
     * Takes stock from the database and puts it into a list
     *
     * @return list of stock
     * @throws Exception
     */
    public static List<Model_Stock> getStock() throws Exception {
        return Mapper_Order.getStock();
    }

    /**
     * Updates stock
     *
     * @param idMaterial
     * @param stock
     * @throws OrderException
     */
    public static void addStockById(int idMaterial, int stock) throws OrderException {
        Mapper_Order.addStockById(idMaterial, stock);
    }

}
