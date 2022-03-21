package com.review.lesson1;

public class JaggedArray {
    public static void main(String[] args) {
        String names[][]={{"Mg Mg","Ye Lin Htut"},{"Hein Si Thu","Sai Htet Lin"},{"Soe Wai Phyo","Aung Si Win"}};
//        for (int i=0;i<names.length;i++){
//            System.out.println(names[i]);
//        }

//        for (String name : names) {
//            System.out.println(name);
//        }//for each loop
//        for (int i = names.length - 1; i >= 0; i--) {
//            System.out.println(names[i]);
//        }//for reverse loop
        for (String[] name : names) {
            for (String n:name){
                System.out.println(n);
            }
        }
    }
}
