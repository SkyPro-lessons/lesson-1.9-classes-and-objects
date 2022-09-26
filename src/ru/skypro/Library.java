package ru.skypro;

public class Library {
    private final Book[] books;

    public Library(int arrayLength) {
        this.books = new Book[arrayLength];
    }

    public void printBooks() {
        for (Book book : this.books) {
            if (book != null) {
                book.printBookFullName();
            }
        }
    }

    public void printBookByBookName(String bookName) {
        boolean isFoundBook = false;
        Book foundBook = getBookByBookName(bookName);
        if (foundBook != null) {
            isFoundBook = true;
            foundBook.printBookFullName();
        }
        if (!isFoundBook) {
            System.out.println("\"" + bookName + "\": не найдена");
        }
    }

    public Book getBookByBookName(String bookName) {
        for (Book book : this.books) {
            if (book == null) {
                continue;
            }
            String currBookName = book.getName();
            if (currBookName.equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                break;
            }
        }

    }

    public void setPublishedYearByBookName(String bookName, int newPublishedYear) {
        Book foundBook = this.getBookByBookName(bookName);
        if (foundBook != null) {
            System.out.println("Год успешно изменен: Книга \"" + bookName + "\": Был " + foundBook.getPublishedYear() + "; Стал " + newPublishedYear);
            foundBook.setPublishedYear(newPublishedYear);
        }
    }
}
