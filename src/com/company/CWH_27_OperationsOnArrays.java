package com.company;

public class CWH_27_OperationsOnArrays {
    public static void main(String[] args) {


        int [] marks = {96, 45, 30, 100, 45};
//        Length function of arrays
        System.out.println(marks.length);


//        Arrays can be made string and floating point as well
        String [] students = {"Jayan", "Harry", "Rohan", "Aarav"};
        System.out.println(students.length);
        System.out.println(students[2] + "\n");


//        Displaying an array
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }


        System.out.println("\nDisplaying in reverse order");
        for(int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

//        Displaying the array using for-each loop
//        this wil substitute the value of "mark" with each value of the array "marks" in every iteration and print it
        System.out.println("\nPrinting using for-each loop");
        for(int mark : marks){
            System.out.println(mark);
        }
    }
}
