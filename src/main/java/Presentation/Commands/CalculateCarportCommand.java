/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Commands;

import Data.Models.Model_Carport;
import Data.Models.Model_OrderDetails;
import Data.Models.Model_Invoice;
import Logic.Exceptions.OrderException;
import Presentation.Command;
import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NoellZane
 */
public class CalculateCarportCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderException {
        try {
            HttpSession session = request.getSession();

            String lengthText = request.getParameter("length");
            String shedLengthTextC = request.getParameter("shedLength");
            int shedLengthC = Integer.parseInt(shedLengthTextC);
            int length = Integer.parseInt(lengthText);

            if (length < shedLengthC) {
                response.sendRedirect(request.getHeader("Referer") + "?error=true");
            } else {

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
                int doorHingePrice = 30;
                int doorPrice = 200;
                int doorHandlePrice = 100;

                int roofScrewPrice = 5;
                int screwPrice = 5;

                int postPrice = 150;
                int woodSidePrice = 125;
                int woodRoofPrice = 120;

                int roofStonePrice = 55;
                int roofPlastPrice = 250;

                //DEAFULT AMOUNTS
                //IF SHED
                //int doorHinge = 2; 
                //int door = 1;
                //int doorHandle = 1;
                //int woodSide = 15;  
                //woodRoof = woodRoof + 2;
                //roofScrew = roofScrew + 2;
                //screw = screw + 50;
                //post = post + 2;
                int roofScrew = 8;
                int screw = 12;

                int post = 4;
                int woodSide = 0;
                int woodRoof = 4;

                int roofStone = 0;
                int roofPlast = 0;

                //CARPORT LENGTH + WIDTH + HEIGHT
                int height = 220;

                String widthText = request.getParameter("width");
                int width = Integer.parseInt(widthText);

                //ROOF CAL
                int roofMatPrice = 0;
                int roofSlope = 0;
                String roofMat = "";
                String roofText = request.getParameter("Taghaeldning");

                //IF THERE IS NO SLOPE THEN 
                if (roofText == null) {
                    roofMat = "Plasttrapezplader";
                    roofPlast = 5;
                } else {
                    int roof = Integer.parseInt(roofText);
                    roofSlope = roof;
                    if (roofSlope > 1 && roofSlope < 25) {
                        roofStone = 30;
                    } else if (roofSlope > 26 && roofSlope < 35) {
                        roofStone = 40;
                    } else if (roofSlope > 36 && roofSlope < 45) {
                        roofStone = 50;
                    }

                    roofMat = request.getParameter("Tag");

                    byte[] bytes = roofMat.getBytes(StandardCharsets.ISO_8859_1);
                    roofMat = new String(bytes, StandardCharsets.UTF_8);

                }

                //SHED CAL
                int shedLength = 0;
                int shedWidth = 0;
                boolean shed = false;

                String shedLengthText = request.getParameter("shedLength");
                if (shedLengthText.equals("0")) {
                    shed = false;
                } else {
                    shed = true;
                    shedLength = Integer.parseInt(shedLengthText);
                    shedLength = shedLength - 30;
                    shedWidth = width - 30;
                }

                /*
        DEAFAULT ELEMENTS IN A CARPORT
        RULES:
        wood planks for sides? 6?
        wood planks for shed + a bit extra side?
        wood side planks 
                 */
                //DEAFAULT PRICES IN A CARPORT
                int lengthPrice = 0;
                int widthPrice = 0;

                //CARPORT LENGHT
                if (length > 1 && length < 250) {

                } else if (length > 250 && length < 500) {

                    woodRoof = woodRoof + 1;
                    roofScrew = roofScrew + 1;
                    screw = screw + 2;
                    post = post;
                    roofStone = roofStone + 3;
                    roofPlast = roofPlast + 1;

                } else if (length > 500 && length < 1000) {

                    woodRoof = woodRoof + 2;
                    roofScrew = roofScrew + 2;
                    screw = screw + 5;
                    post = post + 2;
                    roofStone = roofStone + 6;
                    roofPlast = roofPlast + 2;

                }

                //CARPORT WIDTH
                if (width > 1 && width < 250) {

                } else if (width > 250 && width < 500) {

                    woodRoof = woodRoof + 1;
                    roofScrew = roofScrew + 1;
                    screw = screw + 2;
                    roofStone = roofStone + 3;
                    roofPlast = roofPlast + 1;

                } else if (width > 500 && width < 1000) {

                    woodRoof = woodRoof + 2;
                    roofScrew = roofScrew + 2;
                    screw = screw + 5;
                    roofStone = roofStone + 6;
                    roofPlast = roofPlast + 2;
                }

                //SHED CALC
                int shedPrice = 0;
                int doorHinge = 0;
                int door = 0;
                int doorHandle = 0;
                //MAYBE MAKE THE VALUES FOR SHED AND CARPORT DIVED 
                if (shed == true) {
                    doorHinge = 2;
                    door = 1;
                    doorHandle = 1;

                    //CARPORT SHED WIDTH
                    if (shedWidth > 1 && shedWidth < 250) {

                        woodSide = woodSide + 10;
                        roofStone = roofStone + 2;
                        roofPlast = roofPlast + 1;

                    } else if (shedWidth > 250 && shedWidth < 500) {

                        woodSide = woodSide + 12;
                        roofStone = roofStone + 3;
                        roofPlast = roofPlast + 2;
                    } else if (shedWidth > 500 && shedWidth < 1000) {

                        woodSide = woodSide + 15;
                        roofStone = roofStone + 4;
                        roofPlast = roofPlast + 3;
                    }

                    //CARPORT SHED LENGHT
                    if (shedLength > 1 && shedLength < 250) {

                        woodSide = woodSide + 10;
                        roofStone = roofStone + 2;
                        roofPlast = roofPlast + 1;
                    } else if (shedLength > 250 && shedLength < 500) {

                        woodSide = woodSide + 12;
                        roofStone = roofStone + 3;
                        roofPlast = roofPlast + 2;
                    } else if (shedLength > 500 && shedLength < 1000) {

                        woodSide = woodSide + 15;
                        roofStone = roofStone + 4;
                        roofPlast = roofPlast + 3;
                    }

                    int woodRoofShed = woodRoof + 2;
                    int roofScrewShed = roofScrew + 2;
                    int screwShed = screw + 50;
                    int postShed = post + 2;
                    post = postShed;

                    int doorHingeFPrice = doorHingePrice * doorHinge;
                    int doorFPrice = doorPrice * door;
                    int doorHandleFPrice = doorHandlePrice * doorHandle;

                    int roofScrewFPriceShed = roofScrewPrice * roofScrewShed;
                    int screwFPriceShed = screwPrice * screwShed;

                    int postFPriceShed = postPrice * postShed;
                    int woodSideFPriceShed = woodSidePrice * woodSide;
                    int woodRoofFPriceShed = woodRoofPrice * woodRoofShed;

                    int roofStoneFPriceShed = roofStonePrice;
                    int roofPlastFPriceShed = roofPlastPrice;

                    if ("Plasttrapezplader".equals(roofMat)) {

                        roofStoneFPriceShed = 0;
                    } else {

                        roofPlastFPriceShed = 0;
                    }

                    //SHED PRICE
                    shedPrice = doorHingeFPrice + doorFPrice + doorHandleFPrice + roofScrewFPriceShed + screwFPriceShed + postFPriceShed + woodSideFPriceShed + woodRoofFPriceShed + roofStoneFPriceShed + roofPlastFPriceShed;

                }

                int roofScrewFPrice = roofScrewPrice * roofScrew;
                int screwFPrice = screwPrice * screw;

                int postFPrice = postPrice * post;
                int woodRoofFPrice = woodRoofPrice * woodRoof;

                int roofStoneFPrice = roofStonePrice;
                int roofPlastFPrice = roofPlastPrice;

                if ("Plasttrapezplader".equals(roofMat)) {
                    roofStone = roofStone - roofStone;
                    roofStoneFPrice = 0;
                } else {
                    roofPlast = roofPlast - roofPlast;
                    roofPlastFPrice = 0;
                }

                int carportPrice = roofScrewFPrice + screwFPrice + postFPrice + woodRoofFPrice + roofStoneFPrice + roofPlastFPrice;

                //TOTAL PRICE
                double totalPrice = Math.round((carportPrice + shedPrice) * 1.4);
                session.setAttribute("tPrice", totalPrice);

                int idOrder = 0;
                Model_OrderDetails orderD = new Model_OrderDetails(idOrder, doorHinge, door, doorHandle, roofScrew, screw, post, woodSide, woodRoof, roofStone, roofPlast);
                session.setAttribute("orderDetails", orderD);

                Model_Invoice invoice = new Model_Invoice(idOrder, totalPrice);
                session.setAttribute("invoice", invoice);

                //Carport Input
                Model_Carport carport = new Model_Carport(length, width, roofMat, shed, shedWidth, shedLength, roofSlope);
                session.setAttribute("carport", carport);

            }
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
        }

        return "cart";

    }
}
