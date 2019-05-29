package Presentation;

import Logic.LogicFacade;
import Logic.Exceptions.CustomerException;
import Logic.Models.Model_User;
import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomerException {
        //Changes the user information and makes it the right charset format
            String email = request.getParameter("email");
            byte[] bytes = email.getBytes(StandardCharsets.ISO_8859_1);
            email = new String(bytes, StandardCharsets.UTF_8);
            String password1 = request.getParameter("password1");
            String password2 = request.getParameter("password2");
            String firstName = request.getParameter("fname");
            byte[] FNbytes = firstName.getBytes(StandardCharsets.ISO_8859_1);
            firstName = new String(FNbytes, StandardCharsets.UTF_8);
            String lastName = request.getParameter("lname");
            byte[] LNbytes = lastName.getBytes(StandardCharsets.ISO_8859_1);
            lastName = new String(LNbytes, StandardCharsets.UTF_8);
            String phone = request.getParameter("phone");
            String street = request.getParameter("street");
            byte[] Sbytes = street.getBytes(StandardCharsets.ISO_8859_1);
            street = new String(Sbytes, StandardCharsets.UTF_8);
            String city = request.getParameter("city");
            byte[] Cbytes = city.getBytes(StandardCharsets.ISO_8859_1);
            city = new String(Cbytes, StandardCharsets.UTF_8);
            String zip = request.getParameter("zip");
            String country = request.getParameter("country");
            byte[] CObytes = country.getBytes(StandardCharsets.ISO_8859_1);
            country = new String(CObytes, StandardCharsets.UTF_8);
        HttpSession session = request.getSession();
        Model_User oldUserData = (Model_User) session.getAttribute("user");
        if (password1.equals(password2)) {
            Model_User user = LogicFacade.editUser(oldUserData.getId(), email, password1, firstName, lastName, phone, street, city, zip, country);
            session.setAttribute("user", user);
        }
        return "customerpage";
    }
}
