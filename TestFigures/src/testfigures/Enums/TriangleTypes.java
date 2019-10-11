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
public enum TriangleTypes{
    OXYGON("Acute triangle"),
    RIGHT("Right triangle"),
    OBSTUSE("Obstuse triangle");

    private final String types;

    TriangleTypes(String types) {
        this.types = types;
    }

    public String types() {
        return types;
    }
}
