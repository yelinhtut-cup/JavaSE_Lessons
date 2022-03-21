package com.review.lesson1;

public class TwoDimentionalArray_exercise {
    public static void main(String[] args) {
        String fruits[][]={{"Apple","Orange","Mango"},{"Banana","Strawbarry","Bluebarry"},{"Grape","Coconut","Kiwi"}};
        for (int row=0;row<fruits.length;row++){
            for (int column=0;column<fruits[row].length;column++){
            System.out.print(fruits[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
