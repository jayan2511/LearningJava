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

//        Question 3: Write a Java program to get a user to enter his/her name and and greets them with hello <name>, have a good day text
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello "+name+"! Have a good day!");

//        Question 4: Write a java program to convert kilometers to miles
        System.out.println("Enter no. of kilometers to convert");
        float km = sc.nextFloat();
        double miles =  km*0.621;
        System.out.println(miles);

//        Question 5: Write a java program to check if number entered by a user is integer or not
        System.out.println("Enter a number to check if integer");
        boolean x = sc.hasNextInt();
        System.out.println(x);
    }
}
