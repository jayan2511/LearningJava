package com.company;
import java.util.Scanner;

public class CWH_12_PracSetCh2 {
    public static void main(String[] args) {


//        Question 1: What will be the result of the following expression:
        float a = 7/4*9/2;
//        Solution: 4 because precedence is equal and associativity is left to right, also 7/4 will yield an int value not a float value

//        Question 2: Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println("Encrypted grade is: "+ grade);

        grade=(char)(grade-8);
        System.out.println("Decrypted Grade is: "+ grade);


//        Question 3: Use comparison operators to find out if number entered by a user is greater than a number or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to be checked: ");
        int x = sc.nextInt();
        int y = 10;
        System.out.println(x>y);

//        Question 4: Find the value of c in the following expression:
        int z = 7;
        int c = 7*49/7+35/7;
//        Solution: 54



    }
}
