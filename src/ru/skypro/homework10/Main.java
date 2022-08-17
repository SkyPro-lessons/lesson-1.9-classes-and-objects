package ru.skypro.homework10;

public class Main {

    public static void main(String[] args) {

        printHomeworkNumber(9);

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
        library.printBookByBookName("Три мушкетера");
        library.printBookByBookName("Красная шапочка");
        library.setPublishedYearByBookName("Три мушкетера", 1845);

        printHomeworkNumber(10);

        System.out.println("Реализация методов toString, equals и hashCode для класса Author:");
        Author tolstoi2 = new Author("Лев", "Толстои");
        Author tolstoi3 = new Author("Лев", "Толстой");
        System.out.println("   " + tolstoi);
        System.out.println("   Проверка equals, ожидается false: " + tolstoi.equals(tolstoi2));
        System.out.println("   Проверка equals, ожидается true: " + tolstoi.equals(tolstoi3));
        System.out.println("   Проверка работы метода hashCode: " + tolstoi.hashCode());
        System.out.println("   Проверка работы метода hashCode: " + tolstoi3.hashCode());

        System.out.println("Реализация методов toString, equals и hashCode для класса Book:");
        Book warAndPeace2 = new Book("Война и мир", tolstoi2, 1865);
        Book warAndPeace3 = new Book("Война и мир", tolstoi, 1865);
        System.out.println("   " + warAndPeace);
        System.out.println("   Проверка equals, ожидается false: " + warAndPeace.equals(warAndPeace2));
        System.out.println("   Проверка equals, ожидается true: " + warAndPeace.equals(warAndPeace3));
        System.out.println("   Проверка работы метода hashCode: " + warAndPeace.hashCode());
        System.out.println("   Проверка работы метода hashCode: " + warAndPeace3.hashCode());



    }

    private static void printHomeworkNumber(int number) {
        String signs = "****************";
        System.out.println();
        System.out.println(signs + " Homework" + number + ": " + signs);
    }


}
