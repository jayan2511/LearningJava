package com.company;
import java.util.Scanner;

public class CWH_25_PracSetCh5 {
    public static void main(String[] args) {
//        Question 1: Write a program to print the following pattern:
//        ****
//        ***
//        **
//        *
        int n = 4;
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            }



//        Question 2: Write a program to sum first n even numbers using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of even numbers: ");
        int x = sc.nextInt();
        x = x+1;
        int sum=0;
        for(int i=0; i<x; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of first "+ (x-1)+ " even numbers is "+sum);

//        Question 3: Write a program to print multiplication table of a given number n
        System.out.println("enter number for multiplication table: ");
        int l = sc.nextInt();
        int i = 1;
        while (i<=10){
            int y = (l*i);
            System.out.println(y);
            i++;

        }

//        Question 4: Write a program to find factorial of a number using for loops

        System.out.println("Enter number for factorial: ");
        int s = sc.nextInt();
        int d = 1;
        int factorial = 1;
        while (d<=s) {
            factorial *= d;
            System.out.println(factorial);
            d++;
        };
    }
}
