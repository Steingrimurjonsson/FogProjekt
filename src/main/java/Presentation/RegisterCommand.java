package Presentation;

import Logic.LogicFacade;
import Logic.LoginSampleException;
import Logic.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        String firstName = request.getParameter( "fname" );
        String lastName = request.getParameter( "lname" );
        String phone = request.getParameter( "phone" );
        String street = request.getParameter( "street" );
        String city = request.getParameter( "city" );
        String zip = request.getParameter( "zip" );
        String country = request.getParameter( "country" );
        
        if ( password1.equals( password2 ) ) {
            User user = LogicFacade.createUser(email, password2, firstName,lastName, phone, street, city, zip, country);
            HttpSession session = request.getSession();
            session.setAttribute( "user", user );
           // session.setAttribute( "role", user.getRole() );
           // return user.getRole() + "page";
                   return user.getRole();

        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }

}
