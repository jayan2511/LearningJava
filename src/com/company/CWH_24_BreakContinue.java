package com.company;

public class CWH_24_BreakContinue {
    public static void main(String[] args) {
//        Break and continue using loops

//        Break statement is used to break the loop regardless of whether the condition is true or false.


        for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        int j = 0;
        while(j<5){
            System.out.println(j);
            System.out.println("Java is great!");
            if (j==2) {
                break;
            }
            j++;
        }

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");


//        Continue statements break the current iteration and directly move to the next iteration

        for (int i=0; i<5; i++){
            if (i==2){
                System.out.println("\n");
                System.out.println("Skipping 2");
                System.out.println("\n");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}

