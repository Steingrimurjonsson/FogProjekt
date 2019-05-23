package Logic;

import Data.Invoice;
import Data.UserMapper;
import Data.OrderDetails;
import Data.OrderMapper;
import Data.Stock;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sus
 */
public class LogicFacade
{

    /**
     * Userlogin with email and password
     * @param email
     * @param password
     * @return 
     * @throws CustomerException
     */
    public static User login(String email, String password) throws CustomerException
    {
        return UserMapper.login(email, password);
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
    public static User createUser(String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws CustomerException
    {
        User user = new User(email, password, firstName, lastName, phone, street, city, zip, country, "customer");
        UserMapper.createUser(user);
        return user;
    }

    /**
     *
     * @param idUser
     * @return
     * @throws Exception
     */
    public static List<Invoice> getOrders(int idUser) throws Exception
    {
        List<Invoice> orders = OrderMapper.getInvoice(idUser);
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
    public static User editUser(int userID, String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws CustomerException
    {
        User user = new User(userID, email, password, firstName, lastName, phone, street, city, zip, country, phone);
        UserMapper.editUser(user);
        return user;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public static List<User> allUsers() throws Exception
    {
        return UserMapper.allUsers();

    }

    /**
     *
     * @return
     * @throws Exception
     */
    public static List<Order> getAllOrders() throws Exception
    {
        return OrderMapper.allOrders();
    }

    /**
     *
     * @param idUser
     * @return
     * @throws Exception
     */
    public static List<Order> getAllOrdersByUserID(int idUser) throws Exception
    {
        return OrderMapper.allOrdersByUserID(idUser);
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
    public static Order createOrder(int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) throws OrderException
    {
        Order order = new Order(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);
        OrderMapper.createOrder(order);
        return order;
    }

    /**
     *
     * @param idOrder
     * @return
     * @throws OrderException
     */
    public static Order specificOrder(int idOrder) throws OrderException
    {
        return OrderMapper.specificOrder(idOrder);
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
    public static OrderDetails createOrderDetail(int idOrder, int doorHinge, int door, int doorHandle, int roofScrew, int screw, int post, int woodSide, int woodRoof, int roofStone, int roofPlast) throws OrderException {
        OrderDetails orderD = new OrderDetails(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);
        OrderMapper.createOrderDetail(orderD);
        return orderD;    
    }
    
    /**
     * calls the corrosponding method in the OrderMapper and gives us the details for the specific order.
     * @param idOrder
     * @return orderdetails for the order ID it's given.
     * @throws OrderException
     */
    public static OrderDetails specificOrderDetails(int idOrder) throws OrderException
    {
        return OrderMapper.specificOrderDetails(idOrder);
    }

    /**
     * Creates invoice, shows price and order ID.
     * @param idOrder
     * @param totalPrice
     * @return invoice
     * @throws OrderException
     */
    public static Invoice createInvoice(int idOrder, double totalPrice) throws OrderException {
        Invoice invoice = new Invoice(idOrder, totalPrice);
        OrderMapper.createInvoice(invoice);
        return invoice; 
    }

    /**
     * Shows invoice for specific order.
     * @param idOrder
     * @return
     * @throws OrderException
     */
    public static Invoice specificInvoiceDetails(int idOrder) throws OrderException
    {
        return OrderMapper.specificInvoiceDetails(idOrder);
    }

    /**
     *Calls corrosponding method in OrderMapper
     * @param material
     * @return
     * @throws SQLException
     * @throws OrderException
     */
    public static int getStockIdByMaterial(String material) throws SQLException, OrderException
     {
         return OrderMapper.getStockIdByMaterial(material);
     }
     
    /**
     *Updates stock
     * @param stockUsed
     * @param idMaterial
     * @throws OrderException
     */
    public static void updateStockById(int stockUsed, int idMaterial) throws OrderException
     {
        OrderMapper.updateStockById(stockUsed, idMaterial);
     }
    
    /**
     * Takes stock from the database and puts it into a list
     * @return list of stock
     * @throws Exception
     */
    public static List<Stock> getStock() throws Exception
    {
        return OrderMapper.getStock();
    }

    /**
     * Updates stock
     * @param idMaterial
     * @param stock
     * @throws OrderException
     */
    public static void addStockById(int idMaterial, int stock) throws OrderException
     {
        OrderMapper.addStockById(idMaterial, stock);
     }
    
}
