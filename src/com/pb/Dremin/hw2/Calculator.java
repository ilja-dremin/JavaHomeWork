package com.pb.Dremin.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operand1;
        int operand2;
        String sign;

        System.out.println("введите значение (целое число) operand1=");
        operand1 = scan.nextInt();
        System.out.println("Какую операцию хотите выполнить (доступны - сумирование, отнимание, умножение, деление)");
        sign = scan.next();
        System.out.println("введите значение (целое число) operand2=");
        operand2 = scan.nextInt();

        switch (sign) {
            case "+":
                System.out.println("Результат: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат: " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Делить на 0 нельзя");
                } else {
                    System.out.println("Результат: " + (operand1 * operand2));
                }
                break;
            default:
                System.out.println("Вы выбрали недоспустимую операцию");
        }
    }
}