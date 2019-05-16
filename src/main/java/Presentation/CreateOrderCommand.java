/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Carport;
import Data.OrderDetails;
import Logic.LogicFacade;
import Logic.Order;
import Logic.OrderException;
import Logic.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stein
 */

public class CreateOrderCommand extends Command
{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderException
    {
        try
        {
        HttpSession session = request.getSession();
  
        if(session.getAttribute("user") == null){
            return "login";
        }else {
            
           // session.getAttribute("carport");
          User user = (User) request.getSession().getAttribute("user");
          Carport carport = (Carport) session.getAttribute("carport");
         int userID = user.getId();
         int length = carport.getLength();
         int width = carport.getWidth();
         String roofMat = carport.getroofMat();
         boolean shed = carport.isShed();
         int roofSlope = carport.getRoofSlope();
         int shedLength = carport.getShedLength();
         int shedWidth = carport.getShedLength();
         
         
        OrderDetails orderDetail = (OrderDetails) session.getAttribute("orderDetails");
        int doorHinge = orderDetail.getDoorHinge(); 
        int door = orderDetail.getDoor(); 
        int doorHandle = orderDetail.getDoorHandle(); 
        int roofScrew = orderDetail.getRoofScrew(); 
        int screw = orderDetail.getScrew(); 
        int post = orderDetail.getPost(); 
        int woodSide = orderDetail.getWoodSide(); 
        int woodRoof = orderDetail.getWoodRoof(); 
        int roofStone = orderDetail.getRoofStone(); 
        int roofPlast = orderDetail.getRoofPlast(); 

        Order order = LogicFacade.createOrder(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);
        OrderDetails orderD = LogicFacade.createOrderDetail(doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);

        }
       session.removeAttribute("carport");
       session.removeAttribute("tPrice");
       session.removeAttribute("orderDetails");
       
        }
        catch (OrderException e){
        request.setAttribute("message", e.getMessage());
        }
        
        return "cart";
    }
        

}
