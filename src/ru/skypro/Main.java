package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author duma = new Author("Александр", "Дюма");
        Author tolstoi = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");

        Book threeMusketeers = new Book("Три мушкетера", duma, 2044);
        Book warAndPeace = new Book("Война и мир", tolstoi, 1865);
        Book ruslanAndLudmila = new Book("Руслан и Людмила", pushkin, 1820);
        threeMusketeers.setPublishedYear(1844);
    }
}
