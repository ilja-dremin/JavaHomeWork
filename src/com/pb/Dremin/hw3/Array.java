package com.pb.Dremin.hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int sumElementsOfMass = 0;
        int amountPositiveElementsOfMass = 0;
        int[] array = new int[10];
        int x = array.length;
        int temp = 0;
        Scanner scan = new Scanner(System.in);

        // Ввод значений массива
        System.out.println("Программа предлагает заполнить вам однгомерный массив длинной в 10 элементов: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + "-й элемент массива");
            array[i] = scan.nextInt();
            if (array[i]>0) {amountPositiveElementsOfMass++;}
            sumElementsOfMass= sumElementsOfMass + array[i];
        }

            // Вывод значений массива
        System.out.println("Вывод значений введенного массива");
        System.out.println(Arrays.toString(array));
            // Вывод колличества позитивных элементов массива
        System.out.println("Вывод колличества позитивных элементов массива " + amountPositiveElementsOfMass);
            // Вывод суммы всех элементов массива
        System.out.println("Вывод суммы всех элементов массива " + sumElementsOfMass);

        for (int i = 0; i < x; i++) {
            for (int j = 1; j < (x - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }

        }
        // Вывод значений отсортированного массива
        System.out.println("Вывод значений отсортированного массива");
        System.out.println(Arrays.toString(array));
    }
}
