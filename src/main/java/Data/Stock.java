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
    private int idMaterial;
    private String materialDesc;
    private int stock;


    /**
     * Constructor for the stock of materials
     * @param idMaterial
     * @param materialDesc
     * @param stock
     */
    public Stock(int idMaterial, String materialDesc, int stock)
    {
        this.idMaterial = idMaterial;
        this.materialDesc = materialDesc;
        this.stock = stock;
    
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}