/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Commands;

import Logic.LogicFacade;
import Data.Models.Model_Order;
import Data.Models.Model_User;
import Presentation.Command;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stein
 */
public class CustomerPageCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int idUser = ((Model_User) request.getSession().getAttribute("user")).getId();

        List<Model_Order> orderByUserIDList = LogicFacade.getAllOrdersByUserID(idUser);
        request.setAttribute("orders", orderByUserIDList);

        return "customerpage";

    }
}
