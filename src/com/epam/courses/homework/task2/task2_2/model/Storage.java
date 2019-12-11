package com.epam.courses.homework.task2.task2_2.model;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class Storage {
    private static final int SIZE = 12;
    private static final String[] BOOKS_NAME = {
            "The little prince", "Inhabited island", "Dead Souls", "War and Peace Novel", "The Master and Margarita", "The Twelve Chairs", "The Hound of the Baskervilles",
            "In Search of the Castaways", "D'Artagnan and the Three Musketeers", "Crime And Punishment", "The Kobzar", "Viy"
    };
    private static final String[] AUTHORS_NAME = {
            "Kirill Volinskiy", "Antoine de Saint-Exupéry", "Arkady and Boris Strugatsky", "Leo Tolstoy", "Mikhail Bulgakov", "Ilf and Petrov", "Arthur Conan Doyle",
            "Fyodor Dostoevsky", "Jules Verne", "Alexandre Dumas", "Taras Shevchenko", "Nikolai Gogol"
    };
    private static final String[] PUBLISHERS = {"LitRes", "Ecsmo", "Best Publisher Ever"};

    private Book[] bookList;
    private Random rnd;

    public Storage() {
        bookList = new Book[SIZE];
        rnd = new Random();
        fillStorage();
    }

    public Book[] getBookList() {
        return bookList;
    }

    public Book[] getBookListByAuthor(String author) {
        return getBookByFilter(book -> book.getAuthor().equals(author));
    }

    public Book[] getBookListByPublisher(String publisher) {
        return getBookByFilter(book -> book.getPublisher().equals(publisher));
    }

    public Book[] getBookListByPublishYear(int year) {
        return getBookByFilter(book -> book.getPublishYear() > year);
    }

    public String getRandomAuthor() {
        return AUTHORS_NAME[rnd.nextInt(AUTHORS_NAME.length)];
    }

    public String getRandomPublisher() {
        return PUBLISHERS[rnd.nextInt(PUBLISHERS.length)];
    }

    public void sortByPublishers() {
        Arrays.sort(bookList, new BookComparatorPublisher());
    }

    private Book[] getBookByFilter(Predicate<Book> consumer) {
        Book[] subList = new Book[SIZE];
        for (int i = 0; i < SIZE; i++) {
            if (consumer.test(bookList[i])) {
                subList[i] = bookList[i];
            }
        }
        return subList;
    }

    private void fillStorage() {
        for (int i = 0; i < SIZE; ++i) {
            bookList[i] = new BookBuilder()
                    .withAuthor(AUTHORS_NAME[i])
                    .withName(BOOKS_NAME[i])
                    .withPublisher(PUBLISHERS[rnd.nextInt(PUBLISHERS.length)])
                    .withPublishYear((rnd.nextInt(2019)))
                    .withPagesNumber(rnd.nextInt(1000))
                    .build();
        }
    }
}