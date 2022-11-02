package com.company;
import java.util.Scanner;
public class CWH_33_varArgs {


//    ...arr This will put all arguments given to the method sum into an array called arr
    static int sum(int x, int ...arr){
        int result= 0;
        for(int a: arr){
            result+=a;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println("Enter another number: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum of given numbers is " + sum(a, b) );
    }
}
