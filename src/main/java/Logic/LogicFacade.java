package Logic;

import Data.Mapper_User;
import Data.OrderMapper;
import java.util.List;

public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return Mapper_User.login( email, password );
    } 

    public static User createUser(String email, String password, String firstName, String lastName, String phone, String street, String city, String zip, String country ) throws LoginSampleException {
        User user = new User(email, password, firstName, lastName, phone, street, city, zip, country, "customer");
        Mapper_User.createUser( user );
        return user;
    }

     public static List<Invoice> getOrders(int idUser) throws Exception
   {
        List<Invoice> orders = OrderMapper.getInvoice(idUser);
        return orders;
   }
}
