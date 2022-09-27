package ru.skypro.homework09;

public class Book {
    private final String name;
    private final Author author;
    private int publishedYear;

    public Book(String name, Author author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorFullName() {
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void printBookFullName() {
        System.out.println(this.getAuthorFullName() + ": " + this.getName() + ": " + this.getPublishedYear());
    }

    public void printBookFullNamePublicStyle() {
        System.out.println(this.getName() + " by " + this.getAuthorFullName() + " was published in " + this.getPublishedYear());
    }
}
