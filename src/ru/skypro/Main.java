package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");
        Author duma = new Author("Александр", "Дюма");

        Book threeMusketeers = new Book("Три мушкетера", duma, 2044);
        Book warAndPeace = new Book("Война и мир", tolstoi, 1865);
        Book ruslanAndLudmila = new Book("Руслан и Людмила", pushkin, 1820);
        threeMusketeers.setPublishedYear(1844);

        Library library = new Library(5);

        library.addBook(threeMusketeers);
        library.addBook(warAndPeace);
        library.addBook(ruslanAndLudmila);

        library.printBooks();
        System.out.println();

        library.printBookByBookName("Три мушкетера");
        library.printBookByBookName("Красная шапочка");
        System.out.println();

        library.setPublishedYearByBookName("Три мушкетера", 1845);




    }


}
