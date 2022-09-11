package com.company;
import java.util.Scanner;
public class CWH_13_Strings {
    public static void main(String[] args) {


//        Strings can be declared in the following ways:
        String name = new String("Jayan");
        String name2 = "Jerry";
        System.out.println(name);
//        Strings are immutable


//        DIFFERENT WAYS TO PRINT IN JAVA:
        System.out.print("The name is: ");
        System.out.println(name);

//        System.out.printf can be used to print with format specifiers like %d for int, %f for float %c for char and %s for string
//        System.out.format() works the same as System.out.printf;
        int a = 6;
        float b = 5.458f;
        System.out.printf("The value of a is %d and the value of b is %f \n", a, b);
        System.out.printf("The name is %s \n", name2);

        System.out.println("Enter First Name");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);



    }
}
