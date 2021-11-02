package com.pb.Dremin.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Reader[] readers = new Reader[4];

        books[0] = new Book("Книга1", "автор1", 1987);
        books[1] = new Book("Книга2", "автор2", 2000);
        books[2] = new Book("Книга3", "автор3", 2004);
        books[3] = new Book("Книга4", "автор4", 1992);


        readers[0] = new Reader("Бегинс Фродо", "N11111", "исторический", "12.12.2001", "0991548236");
        readers[1] = new Reader("Саурон Иван Николаеви", "N22222", "филологический", "15.01.1999", "0681548236");
        readers[2] = new Reader("Кошпировский Предсказатель Завтрович", "N33333", "юридический", "17.11.1998", "0501548236");
        readers[3] = new Reader("Николаев Васил.", "N44444", "географический", "02.05.2000", "0971548236");

        System.out.println("Список книг:");
        for (Book book: books) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Список читателей:");
        for (Reader reader: readers) {
            System.out.println(reader);
        }
        System.out.println();

        System.out.println("Журнал истории:");
        readers[0].takeBook(2);
        readers[1].takeBook(books[1].getTitle(), books[2].getTitle(), books[3].getTitle());
        readers[2].takeBook(books[2], books[1]);
        readers[0].returnBook(1);
        readers[1].returnBook(books[1].getTitle(), books[2].getTitle());
        readers[2].returnBook(books[1]);
    }
}

// - печатаются все читатели.
// - демонстрируется работа всех вариантов методов takeBook() и returnBook().