/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import testfigures.Entity.Figure;

/**
 *
 * @author Boris
 */
public class ArrayLogic {
//print array

    public static void getArrayData(Figure[] figures) {
        if (figures.length <= 0) {
            System.err.println("Array length is invalid");
        } else {
            for (int i = 0; i < figures.length; i++) {
                System.out.println(figures[i]);
                if (i < figures.length - 1) {
                    System.out.println("________________________________________");
                }
            }
        }
    }
//fill random length array with random figures

    public static Figure[] fillArray() {
        Figure[] arrFigures = new Figure[1 + (int) RandomValues.randLineOrCorner(0, 100)];
        System.out.println("array of figures length " + arrFigures.length + " was created");
        for (int i = 0; i < arrFigures.length; i++) {
            arrFigures[i] = RandomValues.randFigure();
            arrFigures[i].setName("Figure #" + (i + 1));
        }
        return arrFigures;
    }
}
