package ru.skypro;

public class Book {
    private String name;
    private Author author;
    private int publishedYear;

    public Book(String name, Author author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getAuthorFullName() {
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void printBookFullName() {
        System.out.println(this.getAuthorFullName() + ": " + this.getName() + ": " + this.getPublishedYear());
    }
}
