/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.Invoice;
import Logic.LogicFacade;
import Logic.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stein
 */
public class OrdersCommand extends Command {
      @Override
      String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
    int idUser = ((User) request.getSession().getAttribute("user")).getId();
           
          List<Invoice> iv;
          iv = LogicFacade.getOrders(idUser);
            return "orders";
        
    }
}
