/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author NoellZane
 */
public class Stock
{
    private int doorHingeStock;
    private int doorStock;
    private int doorHandleStock;
    private int roofScrewStock;
    private int screwStock;
    private int postStock;
    private int woodSideStock;
    private int woodRoofStock;
    private int roofStoneStock;
    private int roofPlastStock;

    public Stock(int doorHingeStock, int doorStock, int doorHandleStock, int roofScrewStock, int screwStock, int postStock, int woodSideStock, int woodRoofStock, int roofStoneStock, int roofPlastStock)
    {
        this.doorHingeStock = doorHingeStock;
        this.doorStock = doorStock;
        this.doorHandleStock = doorHandleStock;
        this.roofScrewStock = roofScrewStock;
        this.screwStock = screwStock;
        this.postStock = postStock;
        this.woodSideStock = woodSideStock;
        this.woodRoofStock = woodRoofStock;
        this.roofStoneStock = roofStoneStock;
        this.roofPlastStock = roofPlastStock;
    }

    public int getDoorHingeStock()
    {
        return doorHingeStock;
    }

    public void setDoorHingeStock(int doorHingeStock)
    {
        this.doorHingeStock = doorHingeStock;
    }

    public int getDoorStock()
    {
        return doorStock;
    }

    public void setDoorStock(int doorStock)
    {
        this.doorStock = doorStock;
    }

    public int getDoorHandleStock()
    {
        return doorHandleStock;
    }

    public void setDoorHandleStock(int doorHandleStock)
    {
        this.doorHandleStock = doorHandleStock;
    }

    public int getRoofScrewStock()
    {
        return roofScrewStock;
    }

    public void setRoofScrewStock(int roofScrewStock)
    {
        this.roofScrewStock = roofScrewStock;
    }

    public int getScrewStock()
    {
        return screwStock;
    }

    public void setScrewStock(int screwStock)
    {
        this.screwStock = screwStock;
    }

    public int getPostStock()
    {
        return postStock;
    }

    public void setPostStock(int postStock)
    {
        this.postStock = postStock;
    }

    public int getWoodSideStock()
    {
        return woodSideStock;
    }

    public void setWoodSideStock(int woodSideStock)
    {
        this.woodSideStock = woodSideStock;
    }

    public int getWoodRoofStock()
    {
        return woodRoofStock;
    }

    public void setWoodRoofStock(int woodRoofStock)
    {
        this.woodRoofStock = woodRoofStock;
    }

    public int getRoofStoneStock()
    {
        return roofStoneStock;
    }

    public void setRoofStoneStock(int roofStoneStock)
    {
        this.roofStoneStock = roofStoneStock;
    }

    public int getRoofPlastStock()
    {
        return roofPlastStock;
    }

    public void setRoofPlastStock(int roofPlastStock)
    {
        this.roofPlastStock = roofPlastStock;
    }
    

}