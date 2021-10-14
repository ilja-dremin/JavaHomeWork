package com.pb.Dremin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;

        System.out.println("введите значение числа от 1 до 100 и программа определит в какой из промежутков [0 -14] [15 - 35] [36 - 50] [51 - 100] оно входит");
        x = scan.nextInt();

        if (x>=0 && x<=14) {System.out.println("Ваше значение " + x + " относится к промежутку [0 -14]" );}
            else if (x>=15 && x<=35) {System.out.println("Ваше значение " + x + " относится к промежутку [15 - 35]" );}
                else if (x>=36 && x<=50) {System.out.println("Ваше значение " + x + " относится к промежутку [36 - 50]" );}
                    else if (x>=51 && x<=100) {System.out.println("Ваше значение " + x + " относится к промежутку [51 - 100]" );}
                        else {System.out.println("Ваше значение " + x + " находится за пределами промежутка [0 - 100]" );}
    }
}