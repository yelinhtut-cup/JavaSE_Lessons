package com;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //int numbers[][]=new int[4][4];

       int numbers1[][]={{1,2,3,4},{3,4,5,6},{8,1,6,4},{9,0,1,4}};
//        System.out.println(numbers1[2][0]);
//        System.out.println(numbers1[0].length);
//        for (int i = 0; i < numbers1[0].length; i++) {
//            System.out.print(numbers1[0][i]+"\t");
//        }
        for (int row=0;row<numbers1.length;row++){
            for (int column=0;column<numbers1[row].length;column++) {
                System.out.print(numbers1[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
