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

    public OrderDetails(int doorHinge, int door, int doorHandle, int roofScrew, int screw, int post, int woodSide, int woodRoof, int roofStone, int roofPlast) {
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

    public int getDoorHinge() {
        return doorHinge;
    }

    public void setDoorHinge(int doorHinge) {
        this.doorHinge = doorHinge;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getDoorHandle() {
        return doorHandle;
    }

    public void setDoorHandle(int doorHandle) {
        this.doorHandle = doorHandle;
    }

    public int getRoofScrew() {
        return roofScrew;
    }

    public void setRoofScrew(int roofScrew) {
        this.roofScrew = roofScrew;
    }

    public int getScrew() {
        return screw;
    }

    public void setScrew(int screw) {
        this.screw = screw;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getWoodSide() {
        return woodSide;
    }

    public void setWoodSide(int woodSide) {
        this.woodSide = woodSide;
    }

    public int getWoodRoof() {
        return woodRoof;
    }

    public void setWoodRoof(int woodRoof) {
        this.woodRoof = woodRoof;
    }

    public int getRoofStone() {
        return roofStone;
    }

    public void setRoofStone(int roofStone) {
        this.roofStone = roofStone;
    }

    public int getRoofPlast() {
        return roofPlast;
    }

    public void setRoofPlast(int roofPlast) {
        this.roofPlast = roofPlast;
    }



    
}
