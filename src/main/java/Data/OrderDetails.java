/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author stein
 */
public class OrderDetails {

    private int idOrder;

    private int doorHinge;
    private int door;
    private int doorHandle;
    private int roofScrew;
    private int screw;
    private int post;
    private int woodSide;
    private int woodRoof;
    private int roofStone;
    private int roofPlast;

    /**
     * A constructor for orderdetails.
     *
     * @param idOrder
     * @param doorHinge
     * @param door
     * @param doorHandle
     * @param roofScrew
     * @param screw
     * @param post
     * @param woodSide
     * @param woodRoof
     * @param roofStone
     * @param roofPlast
     */
    public OrderDetails(int idOrder, int doorHinge, int door, int doorHandle, int roofScrew, int screw, int post, int woodSide, int woodRoof, int roofStone, int roofPlast) {
        this.idOrder = idOrder;
        this.doorHinge = doorHinge;
        this.door = door;
        this.doorHandle = doorHandle;
        this.roofScrew = roofScrew;
        this.screw = screw;
        this.post = post;
        this.woodSide = woodSide;
        this.woodRoof = woodRoof;
        this.roofStone = roofStone;
        this.roofPlast = roofPlast;
    }

    /**
     *
     * @return order ID
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     *
     * @param idOrder
     */
    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    /**
     *
     * @return doorhinges
     */
    public int getDoorHinge() {
        return doorHinge;
    }

    /**
     *
     * @param doorHinge
     */
    public void setDoorHinge(int doorHinge) {
        this.doorHinge = doorHinge;
    }

    /**
     *
     * @return doors
     */
    public int getDoor() {
        return door;
    }

    /**
     *
     * @param door
     */
    public void setDoor(int door) {
        this.door = door;
    }

    /**
     *
     * @return doorhandles
     */
    public int getDoorHandle() {
        return doorHandle;
    }

    /**
     *
     * @param doorHandle
     */
    public void setDoorHandle(int doorHandle) {
        this.doorHandle = doorHandle;
    }

    /**
     *
     * @return roofscrews
     */
    public int getRoofScrew() {
        return roofScrew;
    }

    /**
     *
     * @param roofScrew
     */
    public void setRoofScrew(int roofScrew) {
        this.roofScrew = roofScrew;
    }

    /**
     *
     * @return screws
     */
    public int getScrew() {
        return screw;
    }

    /**
     *
     * @param screw
     */
    public void setScrew(int screw) {
        this.screw = screw;
    }

    /**
     *
     * @return the amount of posts
     */
    public int getPost() {
        return post;
    }

    /**
     *
     * @param post
     */
    public void setPost(int post) {
        this.post = post;
    }

    /**
     *
     * @return woodside
     */
    public int getWoodSide() {
        return woodSide;
    }

    /**
     *
     * @param woodSide
     */
    public void setWoodSide(int woodSide) {
        this.woodSide = woodSide;
    }

    /**
     *
     * @return woodroof
     */
    public int getWoodRoof() {
        return woodRoof;
    }

    /**
     *
     * @param woodRoof
     */
    public void setWoodRoof(int woodRoof) {
        this.woodRoof = woodRoof;
    }

    /**
     *
     * @return stoneroof
     */
    public int getRoofStone() {
        return roofStone;
    }

    /**
     *
     * @param roofStone
     */
    public void setRoofStone(int roofStone) {
        this.roofStone = roofStone;
    }

    /**
     *
     * @return plastroof
     */
    public int getRoofPlast() {
        return roofPlast;
    }

    /**
     *
     * @param roofPlast
     */
    public void setRoofPlast(int roofPlast) {
        this.roofPlast = roofPlast;
    }

}
