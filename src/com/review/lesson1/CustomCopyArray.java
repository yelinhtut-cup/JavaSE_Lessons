package com.review.lesson1;

public class CustomCopyArray {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};

        int copy[]=new int[number.length ];
        for (int i = 0; i < number.length; i++) {
            copy[i]=number[i];
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(copy[i]+"\t");
        }
    }
}
