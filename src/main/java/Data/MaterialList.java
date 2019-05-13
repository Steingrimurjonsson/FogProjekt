/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NoellZane
 */
public class MaterialList
{
   private Carport carport;
   private Map<Material, Integer> materials = new HashMap();

    public MaterialList(Carport carport)
    {
        this.carport = carport;
    }
   
   public void addToList(Material material, int count)
   {
       Integer oldCount = materials.get(material);
       if(oldCount == null)// do we have the thing?
       {
           materials.put(material, count); //if we do not have the thing, then we add the thing
       }
       else
       {
           materials.put(material, count + oldCount);//if we have the thing add more of the things
       }
   }

    public Carport getCarport()
    {
        return carport;
    }

    public Map<Material, Integer> getMaterials()
    {
        return materials;
    }
}
