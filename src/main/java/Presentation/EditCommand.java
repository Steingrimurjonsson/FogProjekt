package Presentation;

import Logic.LogicFacade;
import Logic.LoginSampleException;
import Logic.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        
        String email = request.getParameter( "email" );
        String password = request.getParameter( "password1" );
        String firstName = request.getParameter( "fname" );
        String lastName = request.getParameter( "lname" );
        String phone = request.getParameter( "phone" );
        String street = request.getParameter( "street" );
        String city = request.getParameter( "city" );
        String zip = request.getParameter( "zip" );
        String country = request.getParameter( "country" );
        
            HttpSession session = request.getSession();   
            User user = LogicFacade.editUser(email, password, firstName, lastName, phone, street, city, zip, country);
            session.setAttribute( "user", user );
           // session.setAttribute( "role", user.getRole() );
           // return user.getRole() + "page";
                   return "editcustomerinfo";
    }

}
