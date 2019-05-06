/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author jojus1101
 */
public class Carport {

    private final int length;
    private final int width;
    private final String material;
    private final boolean shed;
    private final int roofSlope;
    private final int shedWidth;
    private final int shedLength;
    private final String details;

    public Carport(int length, int width, String material, boolean shed, int shedwidth, int shedlength, String details, int roofslope) {
        this.length = length;
        this.width = width;
        this.material = material;
        this.shed = shed;
        this.shedWidth = shedwidth;
        this.shedLength = shedlength;
        this.details = details;
        this.roofSlope = roofslope;
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

    public int getRoofslope() {
        return roofSlope;
    }

    public int getShedwidth() {
        return shedWidth;
    }

    public int getShedlength() {
        return shedLength;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Carport{" + "length=" + length + ", width=" + width + ", material=" + material + ", shed=" + shed + ", Roofslope=" + roofSlope + ", shedwidth=" + shedWidth + ", shedlength=" + shedLength + ", details=" + details + '}';
    }
    
}
