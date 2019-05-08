/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Carport;
import Data.MaterialList;
import Logic.Calculator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NoellZane
 */
public class CalculateCarportCommand extends Command
{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        
        HttpSession session = request.getSession();
        String lengthText = request.getParameter("length");
        int length = Integer.parseInt(lengthText);
        String widthText = request.getParameter("width");
        int width = Integer.parseInt(widthText);
        int height = 220;
        String shedLengthText = request.getParameter("shedLength");
        int shedLength = Integer.parseInt(shedLengthText);

        //Skal laves i databasen
        Carport carport = new Carport(length, width, "", true, width, shedLength, "generated by carport command", 0);
        MaterialList materials = Calculator.calculateMaterials(carport);
        
        session.setAttribute("materials", materials);
        return "calculatedCarport";
    }

}
