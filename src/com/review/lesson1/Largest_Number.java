package com.review.lesson1;

public class Largest_Number {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8};
        int largestnumber=0;
        for (int i = 0; i < number.length; i++) {
            if (number[i]>largestnumber){
                largestnumber=number[i];
            }
        }
        System.out.println("largest number is: "+largestnumber);
    }
}
