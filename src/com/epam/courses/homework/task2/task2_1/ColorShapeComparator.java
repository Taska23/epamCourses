package com.epam.courses.homework.task2.task2_1;

import java.util.Comparator;

public class ColorShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getColorShape().compareTo(o2.getColorShape());
    }
}
