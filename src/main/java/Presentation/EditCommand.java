package Presentation;

import Logic.LogicFacade;
import Logic.CustomerException;
import Logic.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomerException {

        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String phone = request.getParameter("phone");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String zip = request.getParameter("zip");
        String country = request.getParameter("country");

        HttpSession session = request.getSession();
        User oldUserData = (User) session.getAttribute("user");

        if (password1.equals(password2)) {
            User user = LogicFacade.editUser(oldUserData.getId(), email, password1, firstName, lastName, phone, street, city, zip, country);

            session.setAttribute("user", user);

            // session.setAttribute( "role", user.getRole() );
            // return user.getRole() + "page";
        }
        return "customerpage";
    }
}
