package com.pb.Dremin.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputSentence;
        String outputSentence;
        System.out.println("Введите любое предложение и программы выведет его так, чтобы первые буквы каждого слова будут в верхнем регистре:");
        inputSentence=scan.nextLine();
        outputSentence=firstLetterToUppercase(inputSentence);
        System.out.println("Результат: " + outputSentence);
    }


    public static String firstLetterToUppercase(String Sentence) {
        char[] Array = Sentence.toCharArray();
        final String separators = " \t,.!?\"";
        boolean prevCharIsSeparator = true;

        for (int i = 0; i < Array.length; i++) {
            char curChar = Array[i];

            if (Character.isLowerCase(curChar) && prevCharIsSeparator) {
                Array[i] = Character.toUpperCase(curChar);
            }

            prevCharIsSeparator = (separators.indexOf(curChar) != -1);
        }

        return String.valueOf(Array);
    }

}