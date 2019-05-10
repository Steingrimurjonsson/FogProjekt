/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Carport;
import Data.Cart;
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
        try
        {
        HttpSession session = request.getSession();
        int height = 220;
        String material = "DEFAULT";
        String details = "IDONTKNOW";
        String lengthText = request.getParameter("length");
        int length = Integer.parseInt(lengthText);
        
        String widthText = request.getParameter("width");
        int width = Integer.parseInt(widthText);
       
        String shedLengthText = request.getParameter("shedLength");
        int shedLength = 0;
        int shedWidth = 0;
        boolean shed = false;
        if(shedLengthText == null){
        shed = false;
        }else{
        shed = true;
        int shedLength1 = Integer.parseInt(shedLengthText);
        shedLength = shedLength1 - 30;
        shedWidth = width - 30;
        }
       
        int roofSlope = 0;
        String roofText = request.getParameter("roof");
        if(roofText == null){
        }else{
        int roof = Integer.parseInt(roofText);
        roofSlope = roof;
        }
    
        //Carport Input
        Carport carport = new Carport(length, width, material, shed, shedWidth, shedLength, details, roofSlope);
        session.setAttribute("carports", carport);
        Cart cart = new Cart();
        cart.addToCart(carport);
        System.out.println("this is yo cart, boi" + cart.getCarport());
        MaterialList materials = Calculator.calculateMaterials(carport);
        session.setAttribute("materials", materials);
        
       // Prints out the carport
        //request.setAttribute("message", carport);
        // request.setAttribute("message", "length=" + length + ", width=" + width + ", material=" + material + ", shed=" + shed + ", "
        //   + "Roofslope=" + roofSlope + ", shedwidth=" + shedWidth + ", shedlength=" + shedLength + ", details=" + details);
        


        }
        catch (Exception e){
        request.setAttribute("message", e.getMessage());
        }
        return "cart";
    }
        

}
