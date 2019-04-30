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
public class CartLogic 
{
    private ArrayList<Model_Carport> carports = new ArrayList();
    
    public ArrayList<Model_Carport> getCarport()
    {
        return carports;
    }
    
    public void setCarport(ArrayList<Model_Carport> carport)
    {
        this.carports = carport;
    }
    
    public void addToCart(Model_Carport carport)
    {
        carports.add(carport);
    }
}
