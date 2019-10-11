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
public abstract class Figure {
//base abstract class for all figures, with most of basic fields

    private String name;
    private Colors color;
    private FigureTypes type;
    private double area;

    public Figure(String name, Colors color, FigureTypes type, double area) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.area = area;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public Colors getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Colors color) {
        this.color = color;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the type
     */
    public FigureTypes getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(FigureTypes type) {
        this.type = type;
    }

    /**
     * @return square data
     */
    @Override
    public String toString() {
        return "Name - " + name + " - " + type.types() + "; Color - "
                + color.colors() + "; Area - " + area + " sq.units";
    }
}
