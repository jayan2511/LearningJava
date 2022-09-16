package com.company;

public class CWH_23_ForLoops {
    public static void main(String[] args) {
//        Syntax of a for loop:
//        for (initialization; check_bool_condition; update){
//              statements
//        }

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("\n");
//        2n = EVEN NUMBERS = 0,2,4,6....
//        2n+1 = ODD NUMBERS = 1,3,5,7,9....
//        Quiz- Write a program to print n odd numbers
        System.out.println("First n odd numbers");
        int n = 3;
        for (int i = 0; i<n; i++){
            System.out.println(2*i+1);
        }

        System.out.println("\nUsing Decrement Operator in For Loop");
        for (int i=5; i>0; i--){
            System.out.println(i);
        }

    }
}
