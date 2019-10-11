/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import testfigures.Entity.Quadrangle;
import testfigures.Enums.QuadrangleTypes;

/**
 *
 * @author Boris
 */
public class TrapezoidLogic {

    /**
     * create a random parallelogramm to be a base for trapezoid,
     *
     * and adding some random value
     *
     * @return random trapezoid
     */
    public static Quadrangle randTrapezoid() {
        Quadrangle temp = ParallelogramLogic.randParallelogram();
        double height = temp.getSides()[1] * Math.sin(temp.getCorners()[0]);
        double[] corners = new double[4];
        corners[0] = temp.getCorners()[0];
        corners[1] = temp.getCorners()[1];
        double[] sides = new double[4];
        sides[0] = temp.getSides()[0];
        sides[1] = temp.getSides()[1];
        corners[2] = RandomValues.randLineOrCorner(0, TriangleLogic.MIN_MAX_DEGREE);
        corners[3] = TriangleLogic.MIN_MAX_DEGREE - corners[2];
        double middleLine = setMidLineTrapez(sides, corners, height);
        sides[2] = 2 * middleLine - sides[0];
        sides[3] = Math.abs(height / Math.sin(corners[3]));
        double area = setAreaTrapez(middleLine, height);
        double[] diagonales = setDiagonalesTrapez(sides, corners);
        Quadrangle trapez = FiguresCreation.createQuadrangle("name of trapezoid",
                RandomValues.colorRandomizer(), corners, sides,
                QuadrangleTypes.TRAPEZOID, Math.abs(area), diagonales, Math.abs(height));
        return trapez;
    }

    //count middle line
    private static double setMidLineTrapez(double[] sides, double[] corners, double height) {
        return sides[0] - height * ((1.0 / Math.tan(corners[0]) + (1.0 / Math.tan(corners[3]))) / 2);
    }

    //count diagonales
    private static double[] setDiagonalesTrapez(double[] sides, double[] corners) {
        double[] res = new double[2];
        res[1] = Math.sqrt(Math.pow(sides[0], 2) + Math.pow(sides[3], 2) - 2
                * sides[0] * sides[3] * Math.cos(Math.toRadians(corners[3])));
        res[0] = Math.sqrt(Math.pow(sides[1], 2) + Math.pow(sides[0], 2) - 2
                * sides[0] * sides[1] * Math.cos(Math.toRadians(corners[0])));
        return res;
    }

    //count area
    private static double setAreaTrapez(double midLine, double height) {
        return midLine * height;
    }
}
