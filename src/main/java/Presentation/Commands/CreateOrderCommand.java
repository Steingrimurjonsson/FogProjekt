/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Commands;

import Data.Models.Model_Carport;
import Data.Models.Model_OrderDetails;
import Data.Models.Model_Invoice;
import Logic.LogicFacade;
import Data.Models.Model_Order;
import Logic.Exceptions.OrderException;
import Data.Models.Model_User;
import Presentation.Command;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stein
 */
public class CreateOrderCommand extends Command {

    /**
     *
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderException, SQLException {
        try {
            HttpSession session = request.getSession();

            if (session.getAttribute("user") == null) {
                return "login";
            } else {

                // session.getAttribute("carport");
                Model_User user = (Model_User) request.getSession().getAttribute("user");
                Model_Carport carport = (Model_Carport) session.getAttribute("carport");
                int userID = user.getId();
                int length = carport.getLength();
                int width = carport.getWidth();
                String roofMat = carport.getroofMat();
                boolean shed = carport.isShed();
                int roofSlope = carport.getRoofSlope();
                int shedLength = carport.getShedLength();
                int shedWidth = carport.getShedWidth();
                Model_Order order = LogicFacade.createOrder(userID, length, width, roofMat, shed, roofSlope, shedLength, shedWidth);

                Model_OrderDetails orderD = (Model_OrderDetails) session.getAttribute("orderDetails");
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

                Model_Invoice invoiceD = (Model_Invoice) session.getAttribute("invoice");

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
                int woodSideId = LogicFacade.getStockIdByMaterial("woodSide");
                LogicFacade.updateStockById(woodSide, woodSideId);
                int woodRoofId = LogicFacade.getStockIdByMaterial("woodRoof");
                LogicFacade.updateStockById(woodRoof, woodRoofId);
                int roofStoneId = LogicFacade.getStockIdByMaterial("roofStone");
                LogicFacade.updateStockById(roofStone, roofStoneId);
                int roofPlastId = LogicFacade.getStockIdByMaterial("roofPlast");
                LogicFacade.updateStockById(roofPlast, roofPlastId);

            }
            session.removeAttribute("carport");
            session.removeAttribute("tPrice");
            session.removeAttribute("orderDetails");

        } catch (OrderException e) {

            request.setAttribute("message", e.getMessage());

        }

        return "cart";
    }

}
