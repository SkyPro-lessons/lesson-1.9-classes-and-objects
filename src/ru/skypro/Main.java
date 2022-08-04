package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");
        Author duma = new Author("Александр", "Дюма");

        Book threeMusketeers = new Book("Три мушкетера", duma, 2044);
        Book warAndPeace = new Book("Война и мир", tolstoi, 1865);
        Book ruslanAndLudmila = new Book("Руслан и Людмила", pushkin, 1820);

        Book[] books = new Book[5];

        addBook(books, threeMusketeers);
        addBook(books, warAndPeace);
        addBook(books, ruslanAndLudmila);

        printBooksFromArray(books);



        threeMusketeers.setPublishedYear(1844);
    }

    private static void printBooksFromArray(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                book.printBookFullName();
            }
        }
    }

    public static void addBook(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }

    }
}
