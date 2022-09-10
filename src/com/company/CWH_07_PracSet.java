package com.company;
import java.util.Scanner;

public class CWH_07_PracSet {
    public static void main(String[] args) {
//        Question 1: Write a program to sum 3 numbers in Java
        int a = 5;
        int b = 7;
        int c = 9;
        int sum = a+b+c;
        System.out.println(sum);

//        Question 2: Write a program to calculate CGPA using marks of 3 subjects out of 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Subject 1");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks in Subject 2");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks in Subject 3");
        float sub3 = sc.nextFloat();
        float totalMarks = sub1+sub2+sub3;
        float perc = (totalMarks/300)*100;
        System.out.println("Total Percentage is: " + perc + "%");


    }
}
