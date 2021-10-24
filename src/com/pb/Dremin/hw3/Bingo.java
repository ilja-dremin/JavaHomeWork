package com.pb.Dremin.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int attempt = 1;
        int userNumber = 1;
        Scanner scan = new Scanner(System.in);
        Random valueOfBrainteaserNumber = new Random();
        int upperBound = 100;
        int brainteaserNumber=valueOfBrainteaserNumber.nextInt(upperBound +1);

        System.out.println("Привет. Программа загадала произвольное целое число от 0 до " + upperBound + ". Попробуйте его отгадать.");

        do {
            System.out.println("Введите Ваш вариант, если не хотите продолжать введите значение 200. Попытка " + attempt);
            userNumber = scan.nextInt();
            if (userNumber == 200) {break;}
                else if (userNumber<0 || userNumber>100) {System.out.println("Число " + userNumber + " не входит в промежуток [0-100]");}
                    else if (userNumber<brainteaserNumber) {System.out.println("Число " + userNumber + " меньше чем загаданное программой");}
                        else if (userNumber>brainteaserNumber) {System.out.println("Число " + userNumber + " больше чем загаданное программой");}
            attempt++;
            if (attempt>=100) {System.out.println("За количество попыток " + attempt + " вы могли отгадать загаданное число " + brainteaserNumber + " но не сделали это"); break;}
        }
        while (userNumber!=brainteaserNumber);

        if (userNumber==brainteaserNumber) {System.out.println("Поздравляем Ваше число " + userNumber + " равно загаданному программой " + brainteaserNumber + " количество использованных попыток " + attempt);}
                else {System.out.println("Вы закончили на попытке " + attempt + " Загаданное число было " + brainteaserNumber);}
        System.out.println("Игра закончена");
    }
}