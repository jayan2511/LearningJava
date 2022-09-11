package com.company;

//public class com.company.Main creates the main class which holds the main method
public class CWH_03_VariablesAndDataTypes {
    // public static void main defines the main method in java as a void function
    public static void main(String[] args) {

        //Data types in Java:
        //A)Primitive Data Types:-
        //  1. int
        //  2. char
        //  3. double
        //  4. bool
        //  5. float
        //  6. short
        //  7. long
        //  8. byte
        //B) Non-Primitive Data Types:
        //  1. Array
        //  2. Class
        //  3. Interfaces
        //  4. String
        //  5. Enum

        //Java is statically typed, so variables must be declared before usage
        //Variable Declaration in JAVA
        // Data_type variable = value;
        // For eg: int var = 5;

        //System.out.print() will print without adding another line while System.out.println will add a line after printing

        System.out.print("The sum of the numbers is: ");
        int num1 = 5;
        int num2 = 7;
        int num3 = 7;
        int sum = num1+num2+num3;
        System.out.println(sum);
    }
}