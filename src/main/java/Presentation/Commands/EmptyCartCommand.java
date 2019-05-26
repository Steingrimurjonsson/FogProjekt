/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Commands;

import Presentation.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stein
 */
public class EmptyCartCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            HttpSession session = request.getSession();

            session.removeAttribute("carport");
            session.removeAttribute("tPrice");
            session.removeAttribute("orderDetails");

        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
        }
        return "cart";
    }

}
