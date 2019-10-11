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
public class SquareLogic {

    //constant for square corners
    static final double SQUARE_CORNERS = 90.0;

    //set random values to square fields and call createQuadrangle method
    public static Quadrangle randSquare() {
        double side = RandomValues.randLineOrCorner(0, 0);
        double area = setAreaSquare(side);
        double[] diagonales = setDiagonalesSquare(side);

        Quadrangle square = FiguresCreation.createQuadrangle("name of square", RandomValues.colorRandomizer(),
                new double[]{SQUARE_CORNERS, SQUARE_CORNERS, SQUARE_CORNERS, SQUARE_CORNERS},
                new double[]{side, side, side, side}, QuadrangleTypes.SQUARE, area, diagonales, side);
        return square;
    }

    //count diagonales
    private static double[] setDiagonalesSquare(double side) {
        return new double[]{Math.sqrt(2) * side, Math.sqrt(2) * side};
    }
    
    //count area
    private static double setAreaSquare(double side) {
        return Math.pow(side, 2);
    }
}
