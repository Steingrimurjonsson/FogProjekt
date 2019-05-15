/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.LogicFacade;
import Logic.Order;
import Logic.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NoellZane
 */
public class ShowOrderCommand extends Command
{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        int idUser = ((User) request.getSession().getAttribute("user")).getId();

        List<Order> orderByUserIDList = LogicFacade.getAllOrdersByUserID(idUser);
        request.setAttribute("orders", orderByUserIDList);

        return "showOrder";

    }
}
