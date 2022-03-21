package com.review.lesson1;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
//        while (a<=6){
//            System.out.println(a);
//            a++;
//        }
        do {
            System.out.print(a +"\t");
            a+=1;
        }while (a<=8);
    }
}
