package com.review.lesson1;

public class Smallesta_number {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8};
        int smallest_number=0;
        for (int i =numbers.length-1; i <= numbers.length-1; i--) {
          if (numbers[i]>= numbers[i-1]){
              smallest_number=numbers[i];
          }
        }
        System.out.println("Smallest number: "+smallest_number);
    }
}
