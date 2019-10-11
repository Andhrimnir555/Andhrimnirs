/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Entity;

import java.util.Arrays;
import testfigures.Enums.Colors;
import testfigures.Enums.FigureTypes;

/**
 *
 * @author Boris
 */
public abstract class FigureWithCorners extends Figure {
//base abstract class for all triangles, quadrangles and polygons

    // special values for Figures 
    private int cornersCount;
    private double height;

    private double[] corners = new double[cornersCount];
    private double[] sides = new double[cornersCount];

    public FigureWithCorners(String name, Colors color, double[] corner, double[] sides, FigureTypes type, double area, double height) {
        super(name, color, type, area);
        this.cornersCount = corner.length;
        this.sides = sides;
        this.corners = corner;
        this.height = height;
    }

    /**
     * @return the cornersCount
     */
    public int getCornersCount() {
        return cornersCount;
    }

    /**
     * @param cornersCount the cornersCount to set
     */
    public void setCornersCount(int cornersCount) {
        this.cornersCount = cornersCount;
    }

    /**
     * @return the corners
     */
    public double[] getCorners() {
        return corners;
    }

    /**
     * @param corners the corners to set
     */
    public void setCorners(double[] corners) {
        this.corners = corners;
    }

    /**
     * @return the sides
     */
    public double[] getSides() {
        return sides;
    }

    /**
     * @param sides the sides to set
     */
    public void setSides(double[] sides) {
        this.sides = sides;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + System.lineSeparator() + "Sides length - " + Arrays.toString(sides)
                .replaceAll(",", " units, ").replaceAll("]", " units").replaceAll("\\[", "")
                + System.lineSeparator() + "Angels - " + Arrays.toString(corners)
                .replaceAll(",", " degrees, ").replaceAll("]", " degrees").replaceAll("\\[", "");
    }

}
