package com.review.lesson1;

public class ClassExample {
    String name = "Honda";
    String color = "White";
    static void myMethod(){
        System.out.println("This is object example");
    }

    public static void main(String[] args) {
        ClassExample Car= new ClassExample();
        System.out.println(Car.name);
        System.out.println(Car.color);
        myMethod();

    }
}
