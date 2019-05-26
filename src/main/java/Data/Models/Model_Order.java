/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Models;

/**
 *
 * @author NoellZane
 */
public class Model_Order {

    private int orderID;
    private int userID;
    private int length;
    private int width;
    private String roofMat;
    private boolean shed;
    private int roofSlope;
    private int shedLength;
    private int shedWidth;

    /**
     *
     * @param userID
     * @param length
     * @param width
     * @param roofMat
     * @param shed
     * @param roofSlope
     * @param shedLength
     * @param shedWidth
     */
    public Model_Order(int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) {

        this.userID = userID;
        this.length = length;
        this.width = width;
        this.roofMat = roofMat;
        this.shed = shed;
        this.roofSlope = roofSlope;
        this.shedLength = shedLength;
        this.shedWidth = shedWidth;

    }

    /**
     *
     * @param orderID
     * @param userID
     * @param length
     * @param width
     * @param roofMat
     * @param shed
     * @param roofSlope
     * @param shedLength
     * @param shedWidth
     */
    public Model_Order(int orderID, int userID, int length, int width, String roofMat, boolean shed, int roofSlope, int shedLength, int shedWidth) {
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

    /**
     *
     * @return
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     *
     * @param orderID
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     *
     * @return
     */
    public int getUserID() {
        return userID;
    }

    /**
     *
     * @param userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @return
     */
    public String getroofMat() {
        return roofMat;
    }

    /**
     *
     * @param roofMat
     */
    public void setroofMat(String roofMat) {
        this.roofMat = roofMat;
    }

    /**
     *
     * @return
     */
    public boolean isShed() {
        return shed;
    }

    /**
     *
     * @param shed
     */
    public void setShed(boolean shed) {
        this.shed = shed;
    }

    /**
     *
     * @return
     */
    public int getRoofSlope() {
        return roofSlope;
    }

    /**
     *
     * @param roofSlope
     */
    public void setRoofSlope(int roofSlope) {
        this.roofSlope = roofSlope;
    }

    /**
     *
     * @return
     */
    public int getShedLength() {
        return shedLength;
    }

    /**
     *
     * @param shedLength
     */
    public void setShedLength(int shedLength) {
        this.shedLength = shedLength;
    }

    /**
     *
     * @return
     */
    public int getShedWidth() {
        return shedWidth;
    }

    /**
     *
     * @param shedWidth
     */
    public void setShedWidth(int shedWidth) {
        this.shedWidth = shedWidth;
    }

}
