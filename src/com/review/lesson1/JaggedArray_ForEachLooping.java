package com.review.lesson1;

public class JaggedArray_ForEachLooping {
    public static void main(String[] args) {
        int numbers[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        for (int[] number : numbers) {
            for (int n:number){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
    }
}
