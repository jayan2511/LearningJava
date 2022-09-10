package com.company;
import java.util.Scanner;

public class CWH_06_CBSEPercProblem {
    public static void main(String[] args) {
//      Question- Create a Java Program to accept marks in 5 subjects from user and calculate aggregate percentage, (Marks are out of 100)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in mathematics: ");
        float math = sc.nextFloat();
        System.out.print("Enter marks in english: ");
        float eng = sc.nextFloat();
        System.out.print("Enter marks in science: ");
        float sci = sc.nextFloat();
        System.out.print("Enter marks in Social Studies: ");
        float sst = sc.nextFloat();
        System.out.print("Enter marks in Hindi: ");
        float hin = sc.nextFloat();
        float sum = eng+math+sci+sst+hin;
        float perc = (sum/500)*100;
        System.out.println("Final Percentage is: ");
        System.out.println(perc + "%");

    }
}
