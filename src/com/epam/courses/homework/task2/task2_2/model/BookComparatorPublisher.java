package com.epam.courses.homework.task2.task2_2.model;

import java.util.Comparator;

public class BookComparatorPublisher implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublisher().compareTo(o2.getPublisher());
    }
}