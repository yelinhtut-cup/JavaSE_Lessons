package com.review.lesson1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1 = 0;
        int number2= 0;
        int result,choose;
        System.out.println("Enter the value of number1:");
        number1=sc.nextInt();

        System.out.println("Enter the value of number2:");
        number2=sc.nextInt();

        System.out.println("Please enter 1 for addition (OR) 2 for subtraction (OR) 3 for multiply (OR) 4 for division ");
        choose=sc.nextInt();

        switch (choose){
            case 1:
                result= number1+number2;
                System.out.println("The addition of two number is:" + result);
                break;
            case 2:
                result= number1-number2;
                System.out.println("The subtraction of two number is:" + result);
                break;
            case 3:
                result= number1*number2;
                System.out.println("The mulciply of two number is:" + result);
                break;
            case 4:
                result= number1/number2;
                System.out.println("The division of two number is:" + result);
                break;
            default:
                System.out.println("Please try again!");

        }


    }
}
