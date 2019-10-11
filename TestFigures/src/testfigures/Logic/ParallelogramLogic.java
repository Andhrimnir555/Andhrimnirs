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
public class ParallelogramLogic {

    //set rand values to parallelogram fields and call createQuadrangle method
    public static Quadrangle randParallelogram() {
        double[] corners = new double[4];
        double[] sides = new double[4];
        corners[0] = RandomValues.randLineOrCorner(0, 180.0 - 0.3);
        corners[1] = 180.0 - corners[0];
        corners[2] = corners[0];
        corners[3] = corners[1];
        sides[0] = RandomValues.randLineOrCorner(0, 0);
        sides[1] = RandomValues.randLineOrCorner(0, 0);
        sides[2] = sides[0];
        sides[3] = sides[1];
        double[] diagonales = setDiagonalesParallelogram(sides, corners);
        double area = setAreaParallelogram(sides, corners);
        double height = setParallHeight(corners, sides);
        Quadrangle paral = FiguresCreation.createQuadrangle("name of parallelogram", RandomValues.colorRandomizer(),
                corners, sides, QuadrangleTypes.PARALLEROGRAM, area, diagonales, height);
        return paral;
    }
    
    //count diagonales
    private static double[] setDiagonalesParallelogram(double[] sides, double[] corners) {
        double[] res = new double[2];
        res[1] = Math.sqrt(Math.pow(sides[1], 2) + Math.pow(sides[0], 2) - 2 * sides[0] * sides[1] * Math.cos(Math.toRadians(corners[3])));
        res[0] = Math.sqrt(Math.pow(sides[1], 2) + Math.pow(sides[0], 2) + 2 * sides[0] * sides[1] * Math.cos(Math.toRadians(corners[3])));
        return res;
    }
    
    //count area
    private static double setAreaParallelogram(double[] sides, double[] corners) {
        return sides[0] * sides[1] * Math.sin(Math.toRadians(corners[3]));
    }
    
    //count height
    private static double setParallHeight(double[] corners, double[] sides) {
        return sides[1] * Math.sin(corners[0]);
    }
}
