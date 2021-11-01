package com.pb.Dremin.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstSentence;
        String secondSentence;
        System.out.println("Введите первую строку:");
        firstSentence=scan.nextLine();
        System.out.println("Введите вторую строку:");
        secondSentence=scan.nextLine();

        if (stringSingleForm(firstSentence).equals(stringSingleForm(secondSentence))){System.out.println("Это анаграмма");}
        else {System.out.println("Это не анаграмма");}
    }

    public static String stringSingleForm(String Sentence){
        Sentence=Sentence.toLowerCase();
        //String elementofSentence;
        char[] arrayCharsofSentence = Sentence.toCharArray();
        int lengthOnlyText=0;
        // определяю колличество элементов массива для char[] arrayOnlyText;
        for (int i = 0; i < arrayCharsofSentence.length; i++) {
            if (Character.isLetter(arrayCharsofSentence[i])) {lengthOnlyText++;}
        }
        // задаем длинну  массива для char[] arrayOnlyText;
        char[] arrayOnlyText = new char [lengthOnlyText];
        int j=0;
        // проход по массиву, если элемент массива ="букве" присвоить j-му элементу массива arrayOnlyText i-й элемент массива arrayCharsofSentence
        for (int i = 0; i < arrayCharsofSentence.length; i++) {
            if (Character.isLetter(arrayCharsofSentence[i])) {arrayOnlyText[j]=arrayCharsofSentence[i]; j++;}
            }
        // сортируем полученный массив arrayOnlyText
        Arrays.sort(arrayOnlyText);
        // возвращаем массив arrayOnlyText в стринге
        return String.valueOf(arrayOnlyText);
        }
    }
