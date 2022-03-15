package com.review.lesson1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int number1,number2,addition;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number1:");
        number1=sc.nextInt();

        System.out.println("Enter the value of number2:");
        number2=sc.nextInt();

        addition=number1+number2;
        System.out.println("The result for addition of two number is:" + addition);




    }
}
