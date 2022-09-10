package com.company;

public class CWH_09_OpPrecedence {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        System.out.println(a);
        /*
        * =30-34/2
        * =30-17
        * =13
        * */


        int b = 60/5-34*2;
        /*
        * =12-34*2
        * =12-68
        * =-56
        *
        * STAR IS EVALUATED LATER BECAUSE ASSOCIATIVITY IS LEFT TO RIGHT
        * */
        System.out.println(b);
        //Precedence and Associativity will decide which operators will be evaluated first

    }
}
