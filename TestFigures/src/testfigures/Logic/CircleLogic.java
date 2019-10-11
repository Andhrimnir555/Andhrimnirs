/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import testfigures.Entity.Circle;

/**
 *
 * @author Boris
 */
public class CircleLogic {

    //set random value to circle radius and call createCircle method
    public static Circle randCircle() {
        double radius = RandomValues.randLineOrCorner(0, 0);
        double area = setAreaCircle(radius);
        double circumference = setCircumference(radius);
        Circle circle = FiguresCreation.createCircle(radius, "name of circle", RandomValues.colorRandomizer(), area, circumference);
        return circle;
    }

    //set area of circle
    private static double setAreaCircle(double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }
    
        //set area of circle
    private static double setCircumference(double radius) {
        return (Math.PI * 2) * radius;
    }
}
