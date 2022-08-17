package ru.skypro.homework10;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Автор: " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) other;
        return firstName.equals(otherAuthor.firstName) && lastName.equals(otherAuthor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}
