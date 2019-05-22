/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Carport;
import Data.OrderDetails;
import Data.Invoice;
import Logic.LogicFacade;
import Logic.Order;
import Logic.OrderException;
import Logic.User;
import java.sql.SQLException;
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
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderException, SQLException
    {
        try
        {
            HttpSession session = request.getSession();

            if (session.getAttribute("user") == null)
            {
                return "login";
            } else
            {

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
                int shedWidth = carport.getShedWidth();
                Order order = LogicFacade.createOrder(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);

                OrderDetails orderD = (OrderDetails) session.getAttribute("orderDetails");
                int idOrder = order.getOrderID();
                int doorHinge = orderD.getDoorHinge();
                int door = orderD.getDoor();
                int doorHandle = orderD.getDoorHandle();
                int roofScrew = orderD.getRoofScrew();
                int screw = orderD.getScrew();
                int post = orderD.getPost();
                int woodSide = orderD.getWoodSide();
                int woodRoof = orderD.getWoodRoof();
                int roofStone = orderD.getRoofStone();
                int roofPlast = orderD.getRoofPlast();

                LogicFacade.createOrderDetail(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);

                Invoice invoiceD = (Invoice) session.getAttribute("invoice");

                double totalPrice = invoiceD.getPrice();

                LogicFacade.createInvoice(idOrder, totalPrice);

                int doorHingeId = LogicFacade.getStockIdByMaterial("doorHinge"); 
                LogicFacade.updateStockById(doorHinge, doorHingeId);
                int doorId = LogicFacade.getStockIdByMaterial("door");
                LogicFacade.updateStockById(door, doorId);
                int doorHandleId = LogicFacade.getStockIdByMaterial("doorHandle");
                LogicFacade.updateStockById(doorHandle, doorHandleId);
                int roofScrewId = LogicFacade.getStockIdByMaterial("roofScrew");
                LogicFacade.updateStockById(roofScrew, roofScrewId);
                int screwId = LogicFacade.getStockIdByMaterial("screw");
                LogicFacade.updateStockById(screw, screwId);
                int postId = LogicFacade.getStockIdByMaterial("post");
                LogicFacade.updateStockById(post, postId);
                int woodSideId  = LogicFacade.getStockIdByMaterial("woodSide");
                LogicFacade.updateStockById(woodSide, woodSideId);
                int woodRoofId  = LogicFacade.getStockIdByMaterial("woodRoof");
                LogicFacade.updateStockById(woodRoof, woodRoofId);
                int roofStoneId  = LogicFacade.getStockIdByMaterial("roofStone");
                LogicFacade.updateStockById(roofStone, roofStoneId);
                int roofPlastId = LogicFacade.getStockIdByMaterial("roofPlast");
                LogicFacade.updateStockById(roofPlast, roofPlastId);
                
                
            }
            session.removeAttribute("carport");
            session.removeAttribute("tPrice");
            session.removeAttribute("orderDetails");

        } catch (OrderException e)
        {

            request.setAttribute("message", e.getMessage());

        }

        return "cart";
    }

}
