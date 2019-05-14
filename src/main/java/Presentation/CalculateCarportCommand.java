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
      

        /*
        DEAFULT PRICES
        post            50  DKK
        skrue           2   DKK
        hinges          5   DKK
        door            100 DKK
        doorhandle      20  DKK
        wooden planks   10  DKK
        
        SALES PRICE VS CUSTOMER PRICE 40% ? 
        
        
        */
        
        //CARPORT LENGTH + WIDTH + HEIGHT
        int height = 220;
        String lengthText = request.getParameter("length");
        int length = Integer.parseInt(lengthText);
        String widthText = request.getParameter("width");
        int width = Integer.parseInt(widthText);

        //ROOF CAL
        int roofMatPrice = 0;
        int roofSlope = 0;
        String roofMat= "";
        String roofText = request.getParameter("Taghaeldning");
        
        //IF THERE IS NO SLOPE THEN 
        if(roofText == null){
                roofMat = "Plasttrapezplader";
                roofMatPrice = 500;
        }
        else
        {
                int roof = Integer.parseInt(roofText);
                roofSlope = roof;
                roofMat = request.getParameter("Tag");
                roofMatPrice = 600;
        }
        
        //SHED CAL
        int shedLength = 0;
        int shedWidth = 0;
        boolean shed = false;

        String shedLengthText = request.getParameter("shedLength");
        if(shedLengthText == ""){
        shed = false;
        }else{
        shed = true;
        int shedLength1 = Integer.parseInt(shedLengthText);
        shedLength = shedLength1 - 30;
        shedWidth = width - 30;
        }
            
        
        /*
        DEAFAULT ELEMENTS IN A CARPORT
        RULES:
        wood planks for sides? 6?
        wood planks for shed + a bit extra side?
        wood side planks 
        
        
       */
        int post = 4;
        int skruer = 12;
        int wood = 6;
       
        
        if(shed == true){
            int doorHandle = 1;
            int hinges = 2;
            skruer = skruer + 50;
            post = post + 4; 
            wood = wood + 2;
            int woodSides = 20;
           
        }
        
        
        //DEAFAULT PRICES IN A CARPORT
        int lengthPrice = 0;
        int widthPrice = 0;
        int shedWidthPrice = 0;
        int shedLengthPrice = 0;
        
        //CARPORT LENGHT
        if(length > 1 && length < 250){
             lengthPrice = 500;
            
        } else if (length > 250 && length < 500) {
            
             lengthPrice = 1000;
            
        } else if (length > 500 && length < 1000) {
            
             lengthPrice = 1500;
            
        }
        
        //CARPORT WIDTH
        if(width > 1 && width < 250){
            
             widthPrice = 500;
            
        } else if (width > 250 && width < 500) {
            
             widthPrice = 1000;
            
        } else if (width > 500 && width < 1000) {
            
             widthPrice = 1500;
            
        }
        
         //CARPORT SHED WIDTH
         if(shedWidth > 1 && shedWidth < 250){
             
             shedWidthPrice = 500;
            
        } else if (shedWidth > 250 && shedWidth < 500) {
            
             shedWidthPrice = 1000;
            
        } else if (shedWidth > 500 && shedWidth < 1000) {
            
             shedWidthPrice = 1500;
            
        }
        
         //CARPORT SHED LENGHT
          if(shedLength > 1 && shedLength < 250){
              
             shedLengthPrice = 500;
            
        } else if (shedLength > 250 && shedLength < 500) {
            
             shedWidthPrice = 1000;
            
        } else if (shedLength > 500 && shedLength < 1000) {
            
             shedLengthPrice = 1500;
             skruer = 1;
        }
          
          
        
          
        //TOTAL ELEMENTS (ADD IDS FROM MAT LIST)
        /* 
        skruer ()
        post
        wood (check how much based on their pdf)
        tag
        IF SHED door
        
        */
        
          
        //TOTAL PRICE
        int totalPrice = lengthPrice + widthPrice + shedWidthPrice + shedLengthPrice;
        
      
        //Carport Input
        Carport carport = new Carport(length, width, roofMat, shed, shedWidth, shedLength, roofSlope);
        session.setAttribute("carport", carport);

        MaterialList materials = Calculator.calculateMaterials(carport);
        session.setAttribute("materials", materials);
        }
        catch (Exception e){
        request.setAttribute("message", e.getMessage());
        }
        return "cart";
    }
        

}
