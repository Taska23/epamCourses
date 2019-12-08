package com.epam.courses.homework.task2.task2_1;

import java.util.Comparator;

public abstract class Shape implements Drawable, Comparable<Shape> {
    private String colorShape;

    public String getColorShape() {
        return colorShape;
    }
    public void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }

    public Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public String toString() {
        String color = new String();
        if (colorShape.equalsIgnoreCase("white")){
            color = "\u001B[30m";
        }if (colorShape.equalsIgnoreCase("red")){
            color = "\u001B[31m";
        }if (colorShape.equalsIgnoreCase("green")){
            color = "\u001B[32m";
        }if (colorShape.equalsIgnoreCase("yellow")){
            color = "\u001B[33m";
        }if (colorShape.equalsIgnoreCase("blue")){
            color = "\u001B[34m";
        }if (colorShape.equalsIgnoreCase("purple")){
            color = "\u001B[35m";
        }if (colorShape.equalsIgnoreCase("cyan")){
            color = "\u001B[36m";
        }if (colorShape.equalsIgnoreCase("black")){
            color = "\u001B[37m";
        }
        return getClass().getSimpleName() +
                ": colorShape=" + color + colorShape + "\u001B[0m";
    }

    public abstract double calcArea();

    @Override
    public int compareTo(Shape o) {
        return (int)(this.calcArea() - o.calcArea());
    }
}
