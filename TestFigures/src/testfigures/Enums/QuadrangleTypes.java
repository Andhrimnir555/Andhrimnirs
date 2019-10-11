/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Enums;

import testfigures.Entity.Quadrangle;

/**
 *
 * @author Boris
 */
public enum QuadrangleTypes {
    SQUARE("Square"),
    TRAPEZOID("Trapezoid"),
    PARALLEROGRAM("Parallelogram");

    private final String types;

    QuadrangleTypes(String types) {
        this.types = types;
    }

    public String types() {
        return types;
    }
}
