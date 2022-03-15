package com.review.lesson1;

import java.util.Scanner;

public class Swapping_variables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();

        System.out.println("Enter the value of y: ");
        int y=sc.nextInt();

        int temp;
        temp=y;
        y=x;
        x=temp;
        System.out.println("The value of x is:" + x);
        System.out.println("The value of y is:" + y);


    }

}
