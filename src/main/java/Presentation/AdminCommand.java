/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import Logic.Models.Model_Stock;
import Logic.LogicFacade;
import Logic.Models.Model_Order;
import Logic.Models.Model_User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author NoellZane
 */
public class AdminCommand extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            if (request.getParameter("stock") != null) {
                String matIdText = request.getParameter("matID");
                String stockText = request.getParameter("stock");
                int matID = Integer.parseInt(matIdText);
                int stock = Integer.parseInt(stockText);
                LogicFacade.addStockById(matID, stock);
            }
            List<Model_Stock> stockList = LogicFacade.getStock();
            List<Model_User> userList = LogicFacade.allUsers();
            List<Model_Order> orderList = LogicFacade.getAllOrders();
            request.setAttribute("orders", orderList);
            request.setAttribute("userList", userList);
            request.setAttribute("stockList", stockList);
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
        }

        return "admin";

    }
}
