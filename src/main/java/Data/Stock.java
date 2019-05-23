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

    /**
     * Constructor for the stock of materials
     * @param doorHingeStock
     * @param doorStock
     * @param doorHandleStock
     * @param roofScrewStock
     * @param screwStock
     * @param postStock
     * @param woodSideStock
     * @param woodRoofStock
     * @param roofStoneStock
     * @param roofPlastStock
     */
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

    /**
     *
     * @return doorhinges in stock
     */
    public int getDoorHingeStock()
    {
        return doorHingeStock;
    }

    /**
     *
     * @param doorHingeStock
     */
    public void setDoorHingeStock(int doorHingeStock)
    {
        this.doorHingeStock = doorHingeStock;
    }

    /**
     *
     * @return doors in stock
     */
    public int getDoorStock()
    {
        return doorStock;
    }

    /**
     *
     * @param doorStock
     */
    public void setDoorStock(int doorStock)
    {
        this.doorStock = doorStock;
    }

    /**
     *
     * @return doorhandles in stock
     */
    public int getDoorHandleStock()
    {
        return doorHandleStock;
    }

    /**
     *
     * @param doorHandleStock
     */
    public void setDoorHandleStock(int doorHandleStock)
    {
        this.doorHandleStock = doorHandleStock;
    }

    /**
     *
     * @return roofscrews in stock
     */
    public int getRoofScrewStock()
    {
        return roofScrewStock;
    }

    /**
     *
     * @param roofScrewStock
     */
    public void setRoofScrewStock(int roofScrewStock)
    {
        this.roofScrewStock = roofScrewStock;
    }

    /**
     *
     * @return screws in stock
     */
    public int getScrewStock()
    {
        return screwStock;
    }

    /**
     *
     * @param screwStock
     */
    public void setScrewStock(int screwStock)
    {
        this.screwStock = screwStock;
    }

    /**
     *
     * @return posts in stock
     */
    public int getPostStock()
    {
        return postStock;
    }

    /**
     *
     * @param postStock
     */
    public void setPostStock(int postStock)
    {
        this.postStock = postStock;
    }

    /**
     *
     * @return woodside stock
     */
    public int getWoodSideStock()
    {
        return woodSideStock;
    }

    /**
     *
     * @param woodSideStock
     */
    public void setWoodSideStock(int woodSideStock)
    {
        this.woodSideStock = woodSideStock;
    }

    /**
     *
     * @return woodroof stock
     */
    public int getWoodRoofStock()
    {
        return woodRoofStock;
    }

    /**
     *
     * @param woodRoofStock
     */
    public void setWoodRoofStock(int woodRoofStock)
    {
        this.woodRoofStock = woodRoofStock;
    }

    /**
     *
     * @return stone roof stock
     */
    public int getRoofStoneStock()
    {
        return roofStoneStock;
    }

    /**
     *
     * @param roofStoneStock
     */
    public void setRoofStoneStock(int roofStoneStock)
    {
        this.roofStoneStock = roofStoneStock;
    }

    /**
     *
     * @return plast woof stock
     */
    public int getRoofPlastStock()
    {
        return roofPlastStock;
    }

    /**
     *
     * @param roofPlastStock
     */
    public void setRoofPlastStock(int roofPlastStock)
    {
        this.roofPlastStock = roofPlastStock;
    }
    

}