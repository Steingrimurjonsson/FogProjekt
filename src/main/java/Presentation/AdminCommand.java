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
import javax.servlet.http.HttpSession;

/**
 *
 * @author NoellZane
 */
public class AdminCommand extends Command
{
          @Override
          String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
          try
        {
          HttpSession session = request.getSession();

          String changeStock = "no";
          changeStock = request.getParameter("changeStock");
          if("yes".equals(changeStock)){
          String matIdText = request.getParameter("matID");
          String stockText = request.getParameter("stock");
          int matID = Integer.parseInt(matIdText);     
          int stock = Integer.parseInt(stockText);
          LogicFacade.addStockById(matID, stock);
        
          }
          
          
          List<Stock> stockList = LogicFacade.getStock();
          List<User> userList = LogicFacade.allUsers();
          List<Order> orderList =  LogicFacade.getAllOrders();
          request.setAttribute("orders", orderList);
          request.setAttribute("userList", userList);
      
          request.setAttribute("stockList", stockList);
        }
        catch (Exception e){
        request.setAttribute("message", e.getMessage());
        }
    
        return "admin";
         
    }
}


