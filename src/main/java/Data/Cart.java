/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author stoff
 */
public class Cart 
{
    private ArrayList<Carport> carports = new ArrayList();
    private int id;
    
    public Cart(int id)
    {
        this.id = id;
    }
    public ArrayList<Carport> getCarport()
    {
        return carports;
    }
    
    public void setCarport(ArrayList<Carport> carport)
    {
        this.carports = carport;
    }
    
    public void addToCart(Carport carport)
    {
        carports.add(carport);
    }
    
    //deltes contents of the arraylist and returns a new cart
    public void clearCart()
    {
        carports = new ArrayList();
    }
}
