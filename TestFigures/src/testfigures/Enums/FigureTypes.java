/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Enums;

/**
 *
 * @author Boris
 */
public enum FigureTypes {
    CIRCLE("Circle"),
    TRIANGLE("Triangle"),
    QUADRANGLE("Quadrangle");

    private final String types;

    FigureTypes(String types) {
        this.types = types;
    }

    public String types() {
        return types;
    }
}
