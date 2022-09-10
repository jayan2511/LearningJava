package com.company;

//IMPORTING JAVA SCANNER CODE
import java.util.Scanner;

public class CWH_05_UserInput {
    public static void main(String[] args) {
//        In order to read from the keyboard, Java has a scanner class
        System.out.println("Taking input from the user");

//      Declaring new scanner, system.in makes scanner read from keyboard
        Scanner sc = new Scanner(System.in);



//      Scanned data  will be added to var a
//        NEXT FUNCTION WILL IGNORE WHITESPACE AND ONLY READ FIRST WORD
//        TO READ WHOLE LINE USE nextLine
//      nextInt will only accept integers
//      nextFloat will accept floating point values
//      next will take any data type in the form of a string object
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum=(a+b);

        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);

//        String str = sc.nextLine();
//        System.out.println(str);

//        System.out.println("Enter a string: ");
//        String str = sc.next();
//        System.out.println(str);




//      hasNextInt will ask for input and check if integer value has been entered or not
        System.out.println("Enter a value to check if integer: ");
        boolean b1= sc.hasNextInt();
        System.out.println(b1);

    }
}
