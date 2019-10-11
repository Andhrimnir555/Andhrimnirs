/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import java.util.Arrays;
import testfigures.Entity.Quadrangle;
import testfigures.Entity.Triangle;
import testfigures.Enums.TriangleHeights;
import testfigures.Enums.TriangleTypes;

/**
 *
 * @author Boris
 */
public class TriangleLogic {

    //constant for triangleû sum of the angles 
    static final double MIN_MAX_DEGREE = 180.0;

    //create a random parallelogramm and divide diagonally to get a triangle
    public static Triangle randTriangle() {

        Quadrangle temp = ParallelogramLogic.randParallelogram();
        double[] corners = new double[3];
        double[] sides = new double[3];
        sides[0] = temp.getDiagonales()[0];
        sides[1] = temp.getSides()[2];
        sides[2] = temp.getSides()[3];
        corners[1] = temp.getCorners()[1];
        corners[0] = temp.getCorners()[0] / 2;
        corners[2] = MIN_MAX_DEGREE - (corners[0] + corners[1]);

        double area = setTriangleArea(sides);
        double height = setTriangleHeight(area, sides[0]);
        TriangleTypes tT = setTriangleType(corners);
        TriangleHeights tH = setTriangleHeightName(tT);

        Triangle triangle = new Triangle("name of triangle",
                RandomValues.colorRandomizer(), corners, sides,
                area, tH, height, tT);
        return triangle;
    }

    //count area
    private static double setTriangleArea(double[] sides) {
        double halfPerimetr = setTriangleHalfPerimetr(sides);
        return Math.sqrt(halfPerimetr * (halfPerimetr - sides[0]) *
                (halfPerimetr - sides[1]) * (halfPerimetr - sides[2]));
    }

    //count  half perimetr
    private static double setTriangleHalfPerimetr(double[] sides) {
        double halfPerimetr = 0;
        for (int i = 0; i < sides.length; i++) {
            halfPerimetr += sides[i];
        }
        return halfPerimetr / 2;
    }

    //count height
    private static double setTriangleHeight(double area, double side) {
        return (2 * area) / side;
    }

    //set triangle type
    private static TriangleTypes setTriangleType(double corners[]) {
        Arrays.sort(corners);
        if (corners[2] > 90) {
            return TriangleTypes.OXYGON;
        }
        if (corners[2] < 90) {
            return TriangleTypes.OBSTUSE;
        } else {
            return TriangleTypes.RIGHT;
        }
    }

    //set triangle hipotenuse or height
    private static TriangleHeights setTriangleHeightName(TriangleTypes type) {
        if (type == TriangleTypes.RIGHT) {
            return TriangleHeights.HIPOTENUSE;
        } else {
            return TriangleHeights.HEIGHT;
        }
    }
}
