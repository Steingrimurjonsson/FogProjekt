/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author NoellZane
 */
public class Order
{
    
    private final int orderID;
    private final int userID;
    private final int length;
    private final int width;
    private final String roofMat;
    private final boolean shed;
    private final int roofSlope;
    private final int shedLength;
    private final int shedWidth;
   
      /*
    public Order(int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth)
    {
        this.userID = userID;
        this.length = length;
        this.width = width;
        this.roofMat = roofMat;
        this.shed = shed;
        this.roofSlope = roofSlope;
        this.shedLength = shedLength;
        this.shedWidth = shedWidth;
  
    }
 */
    public Order(int orderID, int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth)
    {
        this.orderID = orderID;
        this.userID = userID;
        this.length = length;
        this.width = width;
        this.roofMat = roofMat;
        this.shed = shed;
        this.roofSlope = roofSlope;
        this.shedLength = shedLength;
        this.shedWidth = shedWidth;
       
    }



    public int getOrderID()
    {
        return orderID;
    }

    public int getUserID()
    {
        return userID;
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public String getroofMat()
    {
        return roofMat;
    }

    public boolean isShed()
    {
        return shed;
    }

    public int getRoofSlope()
    {
        return roofSlope;
    }

    public int getShedWidth()
    {
        return shedWidth;
    }

    public int getShedLength()
    {
        return shedLength;
    }

   
}
