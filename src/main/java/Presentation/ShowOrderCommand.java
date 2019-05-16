/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.LogicFacade;
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

      //  int idUser = ((User) request.getSession().getAttribute("user")).getId();
         int idOrder = Integer.parseInt(request.getParameter("id"));
         request.setAttribute("id", idOrder);
         LogicFacade.specificOrder(idOrder);
         LogicFacade.specificInvoiceDetails(idOrder);
         request.setAttribute("order", LogicFacade.specificOrder(idOrder));
         request.setAttribute("invoice", LogicFacade.specificInvoiceDetails(idOrder));
 


        return "showorder";

    }
}
