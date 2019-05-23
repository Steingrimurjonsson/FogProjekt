package Presentation;

import Logic.LogicFacade;
import Logic.CustomerException;
import Logic.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 The purpose of LoginCommand is to enable a user to login with their email and password

 @author stein
 */ 
public class LoginCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws CustomerException, Exception {
        String email = request.getParameter( "email" );
        String password = request.getParameter( "password" );
        User user = LogicFacade.login( email, password );
        HttpSession session = request.getSession();
        session.setAttribute( "user", user );
        session.setAttribute( "role", user.getRole() );
        //            int idUser = ((User) request.getSession().getAttribute("user")).getId();

    //    List<Order> orderByUserList =  LogicFacade.getAllOrdersByUserID(idUser);
      //    session.setAttribute("ordersByUser", orderByUserList);
        return "../index";
    }

}
