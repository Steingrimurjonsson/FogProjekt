package Presentation;

import Logic.LogicFacade;
import Logic.Exceptions.CustomerException;
import Data.Models.Model_User;
import Presentation.Command;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The purpose of LoginCommand is to enable a user to login with their email and
 * password
 *
 * @author stein
 */
public class LoginCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws CustomerException, IOException {
        try {
            String email = request.getParameter("email");
            byte[] bytes = email.getBytes(StandardCharsets.ISO_8859_1);
            email = new String(bytes, StandardCharsets.UTF_8);

            String password = request.getParameter("password");
            Model_User user = LogicFacade.login(email, password);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("role", user.getRole());
        } catch (CustomerException e) {
            request.setAttribute("error", e.getMessage());
            response.sendRedirect("jsp/login.jsp?error=true");
        }
        return "../index";
    }

}
