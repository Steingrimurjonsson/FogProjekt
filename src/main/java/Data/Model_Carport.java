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
        private final int height;
    private final int length;
    private final int width; 
    private final boolean shed;
    private final String details;

    public Model_Carport(int height, int length, int width, boolean shed, String details) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.shed = shed;
        this.details = details;
    }
    
    public Model_Carport(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
        shed = false;
        details = "";
    }

    public int getHeight() {
        return height;
    }
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    public boolean hasToolshed() {
        return shed;
    }
    
    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Model_Carport{" + "height=" + height + ", length=" + length + ", width=" + width + ", shed=" + shed + ", details=" + details + '}';
    }
}
