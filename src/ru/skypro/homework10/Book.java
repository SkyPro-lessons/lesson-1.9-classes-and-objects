package ru.skypro.homework10;

import java.util.Objects;

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
        System.out.println(getBookFullNamePublicStyle());
    }

    public String getBookFullNamePublicStyle() {
        return this.getName() + " by " + this.getAuthorFullName() + " was published in " + this.getPublishedYear();
    }

    public String getBookNameWithAuthor() {
        return this.getName() + " by Author: " + this.getAuthorFullName();
    }

    @Override
    public String toString() {
        return "Book: " + getBookNameWithAuthor();
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return (name.equals(otherBook.name)) && (author.equals(otherBook.author)) && (publishedYear == otherBook.publishedYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishedYear);
    }
}
