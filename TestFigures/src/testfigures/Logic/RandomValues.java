/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import testfigures.Entity.Figure;
import testfigures.Enums.Colors;

/**
 *
 * @author Boris
 */
public class RandomValues {

    //set min value for random
    static final double DEFAULT_MIN = 0.1;

    //set thresholds to avoid VERY big values
    static final double DEFAULT_MAX = 1000;

    //set value for avaible figures
    static final double FIGURES = 4;

    //select random number between param values or default
    public static double randLineOrCorner(double min, double max) {
        double minVal = min;
        double maxVal = max;
        if (minVal == 0) {
            minVal = DEFAULT_MIN;
        }
        if (maxVal == 0) {
            maxVal = DEFAULT_MAX;
        }
        return minVal + Math.random() * (maxVal - minVal);
    }

    //select random color from enum
    public static Colors colorRandomizer() {
        int random = (int) (Math.random() * (Colors.values().length));
        switch (random) {
            case 0:
                return Colors.BLACK;
            case 1:
                return Colors.BLUE;
            case 2:
                return Colors.GREEN;
            case 3:
                return Colors.RED;
            default:
                return Colors.WHITE;
        }
    }
    //select random figure

    public static Figure randFigure() {
        double RAND_FIGURE = Math.random() * FIGURES;
        switch ((int) RAND_FIGURE) {
            case 0:
                return CircleLogic.randCircle();
            case 1:
                return SquareLogic.randSquare();
            case 2:
                return TrapezoidLogic.randTrapezoid();
            default:
                return TriangleLogic.randTriangle();
        }
    }
}
