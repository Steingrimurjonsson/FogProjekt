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
public class Material {

    private int id;
    private String material;
    private int stock;

    /**
     * constructor for materials.
     *
     * @param id
     * @param material
     * @param stock
     */
    public Material(int id, String material, int stock) {
        this.id = id;
        this.material = material;
        this.stock = stock;
    }

    /**
     *
     * @return material id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return material description
     */
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     *
     * @return stock amount
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
