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
public class Model_Carport {
    private final int length;
    private final int width;
    private final String material;
    private final boolean shed;
    private final String details;

    public Model_Carport(int length, int width,String material , boolean shed, String details) {
        this.length = length;
        this.width = width;
        this.shed = shed;
        this.details = details;
        this.material= material;
    }
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    public boolean hasShed() {
        return shed;
    }
    
    public String getDetails() {
        return details;
    }

    public String getMaterial() {
        return material;
    }
    

    @Override
    public String toString() {
        return "Model_Carport{" + ", length=" + length + ", width=" + width + ", shed=" + shed + ", details=" + details + '}';
    }
}
