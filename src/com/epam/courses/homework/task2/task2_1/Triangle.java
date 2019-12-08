package com.epam.courses.homework.task2.task2_1;

public class Triangle extends Shape{

    private double side [] = new double[3];

    public Triangle(String colorShape, double[] side) {
        super(colorShape);
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + ", sides: " + side[0] + ", " + side[1] + ", " + side[2];
    }

    @Override
    public double calcArea() {
        double p = (side[0]+side[1]+side[2]) / 2 ;
        return Math.sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
    }

    @Override
    public void draw() {
        System.out.println(this + ", area = " + calcArea());
    }
}
