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
    
    private int orderID;
    private int userID;
    private int length;
    private int width;
    private String roofMat;
    private boolean shed;
    private int roofSlope;
    private int shedLength;
    private int shedWidth;
      
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

    public Order(int orderID, int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) {
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

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getroofMat() {
        return roofMat;
    }

    public void setroofMat(String roofMat) {
        this.roofMat = roofMat;
    }

    public boolean isShed() {
        return shed;
    }

    public void setShed(boolean shed) {
        this.shed = shed;
    }

    public int getRoofSlope() {
        return roofSlope;
    }

    public void setRoofSlope(int roofSlope) {
        this.roofSlope = roofSlope;
    }

    public int getShedLength() {
        return shedLength;
    }

    public void setShedLength(int shedLength) {
        this.shedLength = shedLength;
    }

    public int getShedWidth() {
        return shedWidth;
    }

    public void setShedWidth(int shedWidth) {
        this.shedWidth = shedWidth;
    }

   
}
