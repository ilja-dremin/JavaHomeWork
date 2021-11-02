package com.pb.Dremin.hw5;

public class Reader {
     private String readerName; //- ФИО
     private String numberLibraryCard; //- номер читательского билета
     private String faculty; //- факультет
     private String dateofBirth; //- дата рождения
     private String phoneNumber; //- телефон

     public Reader(String readerName, String numberLibraryCard, String faculty, String dateofBirth, String phoneNumber) {
          this.readerName = readerName;
          this.numberLibraryCard = numberLibraryCard;
          this.faculty = faculty;
          this.dateofBirth = dateofBirth;
          this.phoneNumber = phoneNumber;
     }
     public String toString() {
          return readerName + ", читательский № " + numberLibraryCard + ", факультет: " + faculty + ", дата рождения: " + dateofBirth + ", телефон: " + phoneNumber;
     }
     private void booksAction(String action, int bookCount) {
          System.out.println(readerName + " " + action +" " + bookCount + " книг");
     }

     private void booksAction(String action, String[] bookNames) {
          System.out.println(readerName + " " + action + " книги: " + String.join(", ", bookNames));
     }

     private void booksAction(String action, Book[] books) {
          StringBuilder textList = new StringBuilder();

          for (int i = 0; i < books.length; i++) {
               if (i > 0) {
                    textList.append(", ");
               }
               textList.append(books[i]);
          }
          System.out.println(readerName + " " + action + " книги: " + textList);
     }

     public void takeBook(int bookCount) {
          booksAction("взял", bookCount);
     }

     public void takeBook(String... bookNames) {
          booksAction("взял", bookNames);
     }

     public void takeBook(Book... books) {
          booksAction("взял", books);
     }

     public void returnBook(int bookCount) {
          booksAction("вернул", bookCount);
     }

     public void returnBook(String... bookNames) {
          booksAction("вернул", bookNames);
     }

     public void returnBook(Book... books) {
          booksAction("вернул", books);
     }
}


//  Имеет перегруженные методы takeBook(), returnBook():
//  - takeBook, который будет принимать количество взятых книг.
//  Выводит на консоль сообщение
//  "Петров В. В. взял 3 книги".

//  - takeBook, который будет принимать переменное количество названий книг.
//  Выводит на консоль сообщение
//  "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

// - takeBook, который будет принимать переменное количество объектов класса Book.
//  Выводит на консоль сообщение
//  "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".

//  Аналогичным образом перегрузить метод returnBook().
//  Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
// - "Петров В. В. вернул 3 книги"
// - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
// - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".