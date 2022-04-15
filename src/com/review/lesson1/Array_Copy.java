package com.review.lesson1;

public class Array_Copy {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,0};
        int other[]=new int[9];

        System.arraycopy(number,2,other,3,3);
        for (int i = 0; i < other.length; i++) {
            System.out.println(other[i]);
        }
        int another[]=other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i]+"\t");
        }
    }
}
