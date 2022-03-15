package com.review.lesson1;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,result;
        System.out.println("Enter a number");
        number=sc.nextInt();

        if (number %2==0){
            System.out.println("The number you write is Even");
        }
        else {
            System.out.println("The number you write is Odd");
        }

    }
}
