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
public class Material
{
    private final int id;
    private final String material;
    private final double price;

    public Material(int id, String material, double price)
    {
        this.id = id;
        this.material = material;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public String getMaterial()
    {
        return material;
    }

    public double getPrice()
    {
        return price;
    }
    
    
    
}
