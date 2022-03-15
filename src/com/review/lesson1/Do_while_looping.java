package com.review.lesson1;

import java.util.Scanner;

public class Do_while_looping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter a number:");
        i=sc.nextInt();

        do {
            System.out.println("The value of i:"+i);
            i=i+1;
        }while (i<=5);
    }
}
