/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Entity;

import testfigures.Enums.Colors;
import testfigures.Enums.FigureTypes;

/**
 *
 * @author Boris
 */
public class Circle extends Figure {
// base class for all circles

    private double radius;
    private double circumference;

    public Circle(double radius, String name, Colors color, double area, double circumference) {
        super(name, color, FigureTypes.CIRCLE, area);
        this.radius = radius;
        this.circumference = circumference;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the circumference
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * @param circumference the circumference to set
     */
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    /**
     * @return circle data
     */
    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "; Radius - " + radius + " units; Circumference - " 
                + circumference + " units;";
    }

}
