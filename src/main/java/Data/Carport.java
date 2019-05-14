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
    private final String roofMat;
    private final boolean shed;
    private final int roofSlope;
    private final int shedWidth;
    private final int shedLength;


    public Carport(int length, int width, String roofMat, boolean shed, int shedwidth, int shedlength, int roofslope) {
        this.length = length;
        this.width = width;
        this.roofMat = roofMat;
        this.shed = shed;
        this.shedWidth = shedwidth;
        this.shedLength = shedlength;
        this.roofSlope = roofslope;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return roofMat;
    }

    public boolean isShed() {
        return shed;
    }

    public int getRoofSlope() {
        return roofSlope;
    }

    public int getShedWidth() {
        return shedWidth;
    }

    public int getShedLength() {
        return shedLength;
    }

    
    @Override
    public String toString() {
        return "Carport{" + "length=" + length + ", width=" + width + ", roofMat=" + roofMat + ", shed=" + shed + ", Roofslope=" + roofSlope + ", shedwidth=" + shedWidth + ", shedlength=" + shedLength + '}';
    }
    
}
