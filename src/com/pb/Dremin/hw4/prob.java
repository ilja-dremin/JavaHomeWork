package com.pb.Dremin.hw4;

import java.util.Scanner;

public class prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString, outputString;

        System.out.println("Введите строку для обработки:");
        inputString = scan.nextLine();
        outputString = toProperCase(inputString);

        System.out.println("Строка после обработки:");
        System.out.println(outputString);
    }

    public static String toProperCase(String text) {
        char[] textArray = text.toCharArray();
        final String separators = " \t,.!?\"";
        boolean prevCharIsSeparator = true;

        for (int i = 0; i < textArray.length; i++) {
            char curChar = textArray[i];

            if (Character.isLowerCase(curChar) && prevCharIsSeparator) {
                textArray[i] = Character.toUpperCase(curChar);
            }

            prevCharIsSeparator = (separators.indexOf(curChar) != -1);
        }

        return String.valueOf(textArray);
    }
}

