package com.company;
import java.util.Scanner;

public class CWH_18_SwitchCaseStatements {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experinced");
        }
        else{
            System.out.println("You are not experienced");
        }






//        SWITCH CASE CONTROL INSTRUCTION is used when we have to make a choice between multiple options for a variable.
//        Syntax of Switch Case Statement:
//              switch(var){
//                  case <value>:
//                      statement is value==var;
//                      break;
//                  case <value>:
//                      statement if value == var;
//                      break;
//                  default:
//                      statement if no other statements are true
//              }
//        If break statements are not used, whenever a case matches, all remaing statements will execute until break


        switch(age){
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 21:
            System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are goin to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
        System.out.println("Thanks for using my Java Code");
    }
}
