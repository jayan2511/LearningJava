package com.company;
import java.util.Scanner;

public class CWH_19_PracSetCh4 {
    public static void main(String[] args) {




//        Question 1: Write a program to find out if a student is going to pass or fail, if it requires total 40% and at least 33% in each subject to pass
//        Assume 3 subjects and take marks as input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();
        System.out.print("\nEnter marks in English: ");
        int eng = sc.nextInt();
        System.out.print("\nEnter marks in Science: ");
        int sci = sc.nextInt();
        int agg = math + eng + sci;

        if(agg/3>=40 && math>=33 && eng>=33 && sci>=33){
            System.out.println("Result: PASS");
        }
        else{
            System.out.println("Result: FAIL");
        }


//        Question 2: Calculate income tax paid by an employer to the government as per the stats mentioned below:
//                      INCOME SLAB                 TAX
//                        0L-2.5L                   0%
//                        2.5L-5L                   5%
//                        5L-10L                    20%
//                       Above 10L                  30%

        System.out.print("Enter income in figures: \n");
        float income = sc.nextFloat();
        float tax=0;
        if (income<250000){
            tax = 0f;
        }
        else if(income>=250000 && income<500000){
            tax=income*0.05f;
        }
        else if(income>=500000 && income<1000000){
            tax = income*0.2f;
        }
        else if(income>=1000000){
            tax = income*0.3f;
        }
        System.out.print("Tax is equal to: ");
        System.out.println(tax);


//        Question 3: Write a program to find out the day of the week given the number. (1 for monday, 2 for tuesday and so on)
        System.out.println("Enter number: ");
        int day = sc.nextInt();
        String weekday = "Monday";
        switch (day){
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Cannot be determined";
                break;
        }
        System.out.printf("Day of the week is %s\n", weekday);



//        Write a java program to find if a year entered is a leap year or not
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("\nYear is a leap year");
            }
        else {
            System.out.println("Year is not a leap year");
        }

//        Write a program to find type of website from the URL
//        .com ----> commercial website
//        .org ----> organisational website
//        .in ----> Indian website
        System.out.println("Enter website URL: ");
        String url = sc.next();
        if (url.endsWith(".com")){
            System.out.println("Website is a commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Website is an organisational website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Website is an indian website");
        }
    }
}
