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
    private final int materialID;
    private final boolean shed;
    private final int roofSlope;
    private final int shedLength;
    private final int shedWidth;
    private final String details;

    public Order(int orderID, int userID, int length, int width, int materialID, boolean shed, int roofSlope, int shedLength, int shedWidth, String details)
    {
        this.orderID = orderID;
        this.userID = userID;
        this.length = length;
        this.width = width;
        this.materialID = materialID;
        this.shed = shed;
        this.roofSlope = roofSlope;
        this.shedLength = shedLength;
        this.shedWidth = shedWidth;
        this.details = details;
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

    public int getMaterialID()
    {
        return materialID;
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

    public String getDetails()
    {
        return details;
    }
}
