package com.company;

public class CWH_17_LogicalOperators {
    public static void main(String[] args) {
//        LOGICAL OPERATORS IN JAVA
//        1. && - AND
//        2. || - OR
//        3. ! - NOT
        String name = "Jayan";
        int age = 18;
        if (age>=18 && name=="Jayan"){
            System.out.println("Identity Verified");
        }
        else {
            System.out.println("Verification error");
        }
    }
}
