package com.company;

public class CWH_32_methodOverloading {

    //        void return type is used when you do not want your method to return anything
    static void tellJoke(){
        System.out.println("I invented a new word! \n" +
                "Plagiarism");
    }


    static void change (int a){
        a = 9;
    }


    static void change2(int [] arr){
        arr[0] = 98;
    }


    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo (int a){
        System.out.println("Good morning " + a + " bro");
    }

    static void foo (int a, int b){
        System.out.println("Good morning " + a + " bro");
        System.out.println("Good morning " + b + " bro");
    }


    public static void main(String[] args) {


        tellJoke();

        int x = 45;
        change(x);
        System.out.println(x);
//        This will not change the value of x as the defined change method will only be able to change its own copy of x and not the original value of x



//        Changing the array
        int [] marks = {100, 94, 100, 85, 62, 72, 83, 99, 91, 80};
        change2(marks);
        System.out.println(marks[0]);
//        This will change the value of the 0 index of the array due to object reference being passed to the method not a copy


//        METHOD OVERLOADING
//        Two or more methods can have the same name but different parameters. This is known as overloading a method
        foo();
        foo(2);
        foo(3, 4);


    }
}
