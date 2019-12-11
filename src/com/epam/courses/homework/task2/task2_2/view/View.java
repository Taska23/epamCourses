package com.epam.courses.homework.task2.task2_2.view;

import com.epam.courses.homework.task2.task2_2.model.Book;


public class View {
    public void printAllCommands() {
        System.out.println("Select:" +
                "\n1.Sort books by author\n" +
                "2.Sort books by Publisher\n" +
                "3.Sort books after entered year\n" +
                "4.Sort books by publishers\n" +
                "5.Print all\n" +
                "6.Exit\n");
    }

    public void printAll(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
