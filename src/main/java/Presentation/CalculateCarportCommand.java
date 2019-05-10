/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Carport;
import Data.MaterialList;
import Data.Cart;
import Logic.Calculator;
import java.util.ArrayList;
import java.util.List;
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
        
        
        String details = "IDONTKNOW";
        String lengthText = request.getParameter("length");
        int length = Integer.parseInt(lengthText);
        
        String widthText = request.getParameter("width");
        int width = Integer.parseInt(widthText);
       
        String roofMaterial = "Plasttrapezplader";
        /*  String roofMaterialText = request.getParameter("Tag");
        if(roofMaterialText == null){
        }else{
        roofMaterial = request.getParameter("Tag");
        }
        */
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
        String roofText = request.getParameter("Taghaeldning");
        if(roofText == null){
        }else{
        int roof = Integer.parseInt(roofText);
        roofSlope = roof;
        }
    
        //Carport Input
        Carport carport = new Carport(length, width, roofMaterial, shed, shedWidth, shedLength, details, roofSlope);
        session.setAttribute("carport", carport);
        
        MaterialList materials = Calculator.calculateMaterials(carport);
        session.setAttribute("materials", materials);
        
       // Prints out the carport
        request.setAttribute("message", carport);
        // request.setAttribute("message", "length=" + length + ", width=" + width + ", material=" + material + ", shed=" + shed + ", "
        //   + "Roofslope=" + roofSlope + ", shedwidth=" + shedWidth + ", shedlength=" + shedLength + ", details=" + details);
        
        //List<Carport> carports = new ArrayList<Carport>();
        //carports.add(carport);

        }
        catch (Exception e){
        request.setAttribute("message", e.getMessage());
        }
        return "calculatedCarport";
    }
        

}
