package com.company;

public class CWH_10_IncDecOps {
    public static void main(String[] args) {
//        INCREMENT AND DECREMENT OPERATORS

//        i++ will use i variable first and then increment it whereas ++i will first increment i variable and then use it
        int i = 56;
        System.out.println(i++);
        System.out.println(++i);

//        Similarly, j-- will first use j and then decrement it while --j wil first decrement j and then use it
        int j = 100;
        System.out.println(j--);
        System.out.println(--j);

//        Increment and Decrement Operators can also work on character literals
        char ch = 'a';
        System.out.println(++ch);
    }
}