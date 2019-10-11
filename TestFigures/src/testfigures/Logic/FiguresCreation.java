/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import testfigures.Entity.Quadrangle;
import testfigures.Entity.Circle;
import testfigures.Enums.Colors;
import testfigures.Enums.QuadrangleTypes;

/**
 *
 * @author Boris
 */
public class FiguresCreation {

    //method to create circles
    public static Circle createCircle(double radius, String name, Colors color, Double area, double circumference) {
        Circle c = new Circle(radius, name, color, area, circumference);
        return c;
    }

    //method to create quadrangles
    public static Quadrangle createQuadrangle(String name, Colors color, double[] corners, double[] sides, QuadrangleTypes qType, Double area, double[] diagonales, double height) {
        Quadrangle q = new Quadrangle(name, color, corners, sides, qType, area, diagonales, height);
        return q;
    }
}
