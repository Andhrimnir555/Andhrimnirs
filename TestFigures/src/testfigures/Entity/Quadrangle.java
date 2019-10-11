/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Entity;

import java.util.Arrays;
import testfigures.Enums.Colors;
import testfigures.Enums.FigureTypes;
import testfigures.Enums.QuadrangleTypes;

/**
 *
 * @author Boris
 */
public class Quadrangle extends FigureWithCorners {
//base class for all  quadrangles

    // special value for Quadrangle - diagonale
    private double[] diagonales;
    private QuadrangleTypes qType;

    public Quadrangle(String name, Colors color, double[] corners, double[] sides,
            QuadrangleTypes qtype, double area, double[] diagonales, double height) {
        super(name, color, corners, sides, FigureTypes.QUADRANGLE, area, height);
        this.diagonales = diagonales;
        this.qType = qtype;
    }

    /**
     * @return the diagonales
     */
    public double[] getDiagonales() {
        return diagonales;
    }

    /**
     * @param diagonales the diagonales to set
     */
    public void setDiagonales(double[] diagonales) {
        this.diagonales = diagonales;
    }

    /**
     * @return the qType
     */
    public QuadrangleTypes getqType() {
        return qType;
    }

    /**
     * @param qType the qType to set
     */
    public void setqType(QuadrangleTypes qType) {
        this.qType = qType;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll(FigureTypes.QUADRANGLE.types(),
                qType.types()) + "; " + System.lineSeparator() + "Diagonales - "
                + Arrays.toString(diagonales) + " units; Height - "
                + super.getHeight() + " units;";
    }
}
