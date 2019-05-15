package Logic;

import Data.Mapper_User;
import Data.OrderMapper;
import java.util.List;

public class LogicFacade
{

    public static User login(String email, String password) throws LoginSampleException
    {
        return Mapper_User.login(email, password);
    }

    public static User createUser(String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws LoginSampleException
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

    public static User editUser(int userID, String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country) throws LoginSampleException
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

    public static Order createOrder(int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) throws Exception
    {
        Order order = new Order(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);
        OrderMapper.createOrder(order);
        return order;
    }

    public static Order specificOrder(int idOrder) throws Exception
    {
        return OrderMapper.specificOrder(idOrder);
    }
}
