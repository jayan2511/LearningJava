package com.company;
import java.util.Scanner;


public class CWH_15_PracSetCh3 {
    public static void main(String[] args) {
//        Question 1: Write a java program to convert a string to lowercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to lowercase: ");
        String str = sc.nextLine();
        String lowerCaseString = str.toLowerCase();
        System.out.println(lowerCaseString);

//        Question 2: Write a java program to replace spaces with underscores
        String replacedString = str.replace(" ", "_");
        System.out.println(replacedString);

//        Question 3: Write a java program to fill in a letter template which looks like this
//        letter = "Dear <name>, Thanks a lot!"
//        Replace name with a string
        System.out.printf("Dear %s , thanks a lot!\n", str);

//        Question 4: Write a Java program to detect double and triple spaces in a string
        System.out.println("Double spaces are at: "+ str.indexOf("  "));
        System.out.println("Triple spaces are at: "+ str.indexOf("   "));

    }
}
