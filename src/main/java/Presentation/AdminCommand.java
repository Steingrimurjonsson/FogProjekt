/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Stock;
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
public class AdminCommand extends Command
{
          @Override
          String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
          
          List<Stock> stockList = LogicFacade.getStock();
          List<User> userList = LogicFacade.allUsers();
          List<Order> orderList =  LogicFacade.getAllOrders();
          request.setAttribute("orders", orderList);
          request.setAttribute("userList", userList);
          request.setAttribute("stockList", stockList);
            return "admin";
    }
}

