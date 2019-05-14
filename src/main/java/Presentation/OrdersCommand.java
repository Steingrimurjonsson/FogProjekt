/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.Order;
import Logic.LogicFacade;
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
          List<Order> orderList =  LogicFacade.getAllOrders();
          request.setAttribute("orders", orderList);
            return "orders";
    }
}
