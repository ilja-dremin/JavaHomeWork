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

        if (stringSingleForm(firstSentence).equalsIgnoreCase(stringSingleForm(secondSentence))){System.out.println("Это анаграмма");}
        else {System.out.println("Это не анаграмма");}
    }

    public static String stringSingleForm(String Sentence){
        //Sentence=Sentence.toLowerCase();
        char[] arrayCharsofSentence = Sentence.toCharArray();
        Arrays.sort(arrayCharsofSentence);
        return String.valueOf (arrayCharsofSentence);
    }
}
