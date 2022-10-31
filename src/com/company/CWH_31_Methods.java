package com.company;

public class CWH_31_Methods {

//    This is a method
//When the static keyword is not used, each class will need to have its own copy of the method using object creation. Static creation will share the function amongst all classes.
    static int logic(int a, int b){
        int c;
        if(a>b){
            c = a+b;
        }
        else{
            c = ((a+b)*5);
        }
        return c;
    }


    public static void main(String[] args) {
//        Methods are used like def in python
//        They are used to avoid repeating a logic
//        Syntax:
//
//        dataType name(){
//
//        Method Body
//
//        }


//        Now, I can call the above method in the following way:
        int x = 10;
        int y = 20;
        int z = logic(x, y);
        System.out.println(z);
//        This will put the values of x and y in a and b and the method will return the value of c to z



    }
}
