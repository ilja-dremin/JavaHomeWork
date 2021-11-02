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