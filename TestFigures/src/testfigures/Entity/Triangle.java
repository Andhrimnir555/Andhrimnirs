/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Entity;

import testfigures.Enums.Colors;
import testfigures.Enums.FigureTypes;
import testfigures.Enums.TriangleHeights;
import testfigures.Enums.TriangleTypes;

/**
 *
 * @author Boris
 */
public class Triangle extends FigureWithCorners {
//base class for all  triangles

    // special values for Triangles
    private TriangleTypes triangleType;
    private TriangleHeights hName;

    public Triangle(String name, Colors color, double[] corners, double[] sides,
            double area, TriangleHeights tHeight, double height, TriangleTypes tType) {
        super(name, color, corners, sides, FigureTypes.TRIANGLE, area, height);
        this.triangleType = tType;
        this.hName = tHeight;
    }

    /**
     * @return the triangleType
     */
    public TriangleTypes getTriangleType() {
        return triangleType;
    }

    /**
     * @return the hName
     */
    public TriangleHeights gethName() {
        return hName;
    }

    /**
     * @param triangleType the triangleType to set
     */
    public void setTriangleType(TriangleTypes triangleType) {
        this.triangleType = triangleType;
    }

    /**
     * @param hName the hName to set
     */
    public void sethName(TriangleHeights hName) {
        this.hName = hName;
    }

    /**
     * @return triangle data
     */
    @Override
    public String toString() {
        return super.toString().replace(FigureTypes.TRIANGLE.types(),
                getTriangleType().types()) + "; " + gethName() + " - " 
                + getHeight() + ";";
    }

}
