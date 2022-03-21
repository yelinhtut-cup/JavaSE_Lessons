package com.review.lesson1;

public class Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        String names[]=new String[]{"Ye lin Htut","Mg Mg","Kyaw Kyaw"};
//        System.out.println(names[0]);
        String cars[]=new String[4];
        cars[0]="Toyota";
        cars[1]="Honda";
        cars[2]="Mazada";
        cars[3]="Marcidy";
//        System.out.println(cars[2]);
//        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
