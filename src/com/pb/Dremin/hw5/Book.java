package com.pb.Dremin.hw5;

public class Book {
    private String bookName; //- название книги
    private String writerName; //- автор книги
    private int publicationYear; //- год издания

    public Book(String bookName, String writerName, int publicationYear) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return bookName + " " + writerName + " " + publicationYear + " ";
    }

    public String getTitle() {
        return bookName;
    }
}
