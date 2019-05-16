package Logic;

import Data.Mapper_User;
import Data.OrderDetails;
import Data.OrderMapper;
import java.util.List;

public class LogicFacade
{

    public static User login(String email, String password) throws CustomerException
    {
        return Mapper_User.login(email, password);
    }

    public static User createUser(String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws CustomerException
    {
        User user = new User(email, password, firstName, lastName, phone, street, city, zip, country, "customer");
        Mapper_User.createUser(user);
        return user;
    }

    public static List<Invoice> getOrders(int idUser) throws Exception
    {
        List<Invoice> orders = OrderMapper.getInvoice(idUser);
        return orders;
    }

    public static User editUser(int userID, String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws CustomerException
    {
        User user = new User(userID, email, password, firstName, lastName, phone, street, city, zip, country, phone);
        Mapper_User.editUser(user);
        return user;
    }

    public static List<User> allUsers() throws Exception
    {
        return Mapper_User.allUsers();

    }

    public static List<Order> getAllOrders() throws Exception
    {
        return OrderMapper.allOrders();
    }

    public static List<Order> getAllOrdersByUserID(int idUser) throws Exception
    {
        return OrderMapper.allOrdersByUserID(idUser);
    }

    public static Order createOrder(int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) throws OrderException
    {
        Order order = new Order(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);
        OrderMapper.createOrder(order);
        return order;
    }

    public static Order specificOrder(int idOrder) throws OrderException
    {
        return OrderMapper.specificOrder(idOrder);
    }

    public static OrderDetails createOrderDetail(int idOrder, int doorHinge, int door, int doorHandle, int roofScrew, int screw, int post, int woodSide, int woodRoof, int roofStone, int roofPlast) throws OrderException {
        OrderDetails orderD = new OrderDetails(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);
        OrderMapper.createOrderDetail(orderD);
        return orderD;    
    }
}
