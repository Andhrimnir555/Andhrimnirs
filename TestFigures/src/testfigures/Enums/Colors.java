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
public enum Colors {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private final String colors;

    Colors(String colors) {
        this.colors = colors;
    }

    public String colors() {
        return colors;
    }
}
