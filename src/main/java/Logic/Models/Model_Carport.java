/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Models;

/**
 *
 * @author jojus1101
 */
public class Model_Carport {

    private final int length;
    private final int width;
    private final String roofMat;
    private final boolean shed;
    private final int roofSlope;
    private final int shedWidth;
    private final int shedLength;

    /**
     * A constructor that makes it possible to create a carport
     *
     * @param length
     * @param width
     * @param roofMat
     * @param shed
     * @param shedwidth
     * @param shedlength
     * @param roofslope
     */
    public Model_Carport(int length, int width, String roofMat, boolean shed, int shedwidth, int shedlength, int roofslope) {
        this.length = length;
        this.width = width;
        this.roofMat = roofMat;
        this.shed = shed;
        this.shedWidth = shedwidth;
        this.shedLength = shedlength;
        this.roofSlope = roofslope;
    }

    /**
     * Returns length of carport
     *
     * @return
     */
    public int getLength() {
        return length;
    }

    /**
     * Returns width of carport
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @return roof material
     */
    public String getroofMat() {
        return roofMat;
    }

    /**
     *
     * @return if the carport has a shed
     */
    public boolean isShed() {
        return shed;
    }

    /**
     *
     * @return degrees of slope
     */
    public int getRoofSlope() {
        return roofSlope;
    }

    /**
     *
     * @return width of shed
     */
    public int getShedWidth() {
        return shedWidth;
    }

    /**
     *
     * @return length of shed
     */
    public int getShedLength() {
        return shedLength;
    }

    @Override
    public String toString() {
        return "Carport{" + "length=" + length + ", width=" + width + ", roofMat=" + roofMat + ", shed=" + shed + ", Roofslope=" + roofSlope + ", shedwidth=" + shedWidth + ", shedlength=" + shedLength + '}';
    }

}
