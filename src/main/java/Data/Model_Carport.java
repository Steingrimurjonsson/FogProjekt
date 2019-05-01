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
    private final int shedwidth;
    private final int shedlength;
    private final String details;

    public Model_Carport(int length, int width, String material, boolean shed, int shedwidth, int shedlength, String details) {
        this.length = length;
        this.width = width;
        this.material = material;
        this.shed = shed;
        this.shedwidth = shedwidth;
        this.shedlength = shedlength;
        this.details = details;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isShed() {
        return shed;
    }

    public int getShedwidth() {
        return shedwidth;
    }

    public int getShedlength() {
        return shedlength;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Model_Carport{" + "length=" + length + ", width=" + width + ", material=" + material + ", shed=" + shed + ", shedwidth=" + shedwidth + ", shedlength=" + shedlength + ", details=" + details + '}';
    }

    

    
}
