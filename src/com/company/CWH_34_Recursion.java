package com.company;

public class CWH_34_Recursion {

//    When a function calls itself is called recursion in Java

    static int factorial(int n){
//        factorial(0) = 1
//        factorial = n * n-1 ....
//        factorial(n) = n * factorial (n-1)
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
