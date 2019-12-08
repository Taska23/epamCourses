package com.epam.courses.homework.task2.task2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Shape rectanle = new Rectangle("RED", 10, 4);
        rectanle.draw();
        Shape rectanle2 = new Rectangle("Black", 15, 3);
        rectanle2.draw();
        Shape rectanle3 = new Rectangle("CyAn", 5, 3);
        rectanle3.draw();
        Shape rectanle4 = new Rectangle("White", 1, 1);
        rectanle4.draw();

        Shape triangle = new Triangle("Green", new double[]{3, 4, 5});
        triangle.draw();
        Shape triangle2 = new Triangle("Green", new double[]{10, 20, 15});
        triangle2.draw();
        Shape triangle3 = new Triangle("purple", new double[]{6, 7, 7});
        triangle3.draw();
        Shape triangle4 = new Triangle("Blue", new double[]{2, 5, 5});
        triangle4.draw();

        Shape circle = new Circle("Yellow",15);
        circle.draw();
        Shape circle2 = new Circle("Black",30);
        circle2.draw();
        Shape circle3 = new Circle("white",10);
        circle3.draw();
        Shape circle4 = new Circle("pUrPlE",7);
        circle4.draw();


        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(rectanle,rectanle2,rectanle3,rectanle4,triangle,triangle2,triangle3,triangle4,circle,circle2,circle3,circle4));
        Collections.sort(shapes);
        System.out.println("\nSorted by area");
        System.out.println(shapes);
        System.out.println("\nSorted by color (alphabet, case sensitive)");
        Comparator colorComparator = new ColorShapeComparator();
        Collections.sort(shapes, colorComparator);
        System.out.println(shapes);

    }
}
