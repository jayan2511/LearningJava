package com.company;

public class CWH_26_Arrays {
    public static void main(String[] args) {
        /*Class of 500 students: You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        OR
        2. Create an array
        */
//        To create an array:
//        Data Type [] "Array Name"
//        here, i am creating a new array called marks with 5 spaces in it to store data
        int [] marks = new int[5];

//        Data in the array can be accessed by using indexing. index starts from 0 to whenever the array ends.
        marks [0] = 100;
        marks [1] = 70;
        marks [4] = 90;
        marks [3] = 30;
        marks [2] = 10;

        System.out.println(marks[2]);


//        Arrays are mutable, so the values can be changed
        marks [4] = 96;
        System.out.println(marks[4]);
    }
}
