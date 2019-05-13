package Data;

import Logic.LoginSampleException;
import Logic.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Mapper_User
{

    public static void createUser(User user) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO User (email, password, firstName, lastName, phone, street, city, zip, country, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getPhone());
            ps.setString(6, user.getStreet());
            ps.setString(7, user.getCity());
            ps.setString(8, user.getZip());
            ps.setString(9, user.getCountry());
            ps.setString(10, user.getRole());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setId(id);
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static void editUser(User user) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "UPDATE User SET email =?, password =?, firstName =?, lastName =?, phone =?, street =?, city =?, zip =?, country =? WHERE id = ?;";
            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getPhone());
            ps.setString(6, user.getStreet());
            ps.setString(7, user.getCity());
            ps.setString(8, user.getZip());
            ps.setString(9, user.getCountry());
            ps.setInt(10, user.getId());

            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT id, firstName, lastName, phone, street, city, zip, country, role FROM User  "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                String role = rs.getString("role");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String phone = rs.getString("phone");
                String street = rs.getString("street");
                String city = rs.getString("city");
                String zip = rs.getString("zip");
                String country = rs.getString("country");
                int id = rs.getInt("id");
                User user = new User(email, password, firstName, lastName, phone, street, city, zip, country, role);
                user.setId(id);
                return user;
            } else
            {
                throw new LoginSampleException("Could not validate user");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static List<User> allUsers() throws Exception
    {
        List<User> userList = new ArrayList();
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from `user`";
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String phone = rs.getString("phone");
                String street = rs.getString("street");
                String city = rs.getString("city");
                String zip = rs.getString("zip");
                String country = rs.getString("country");
                String role = rs.getString("role");
                

                User user = new User(id, email, password, firstName, lastName, phone, street, city, zip, country, role);
                userList.add(user);
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new Exception(ex.getMessage());
        }
        return userList;
    }
}
