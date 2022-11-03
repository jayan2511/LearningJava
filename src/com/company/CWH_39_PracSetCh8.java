package com.company;
import java.util.Scanner;





//  Q1: Create a class Employee with following methods and attributes:
/*
* Salary(property)(int)
* getSalary(method returning int)
* name(Property)(String)
* getName(method returning String)
* setName(method changing name)
* */
class Emp{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to be set");
        name = sc.nextLine();
    }
}



// Q2) Create a class cellphone with methods to print "ringing...", "Vibrating..." etc
class Cellphone{
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callFriend(){
            System.out.println("Calling Vipul");
        }
}



// Q3) Create a class square with methods to initialize side, calculate area, perimeter etc
class square {
    int side;
    int area;
    int perimeter;
    public void setSide(){
        side = 5;
    }
    public int calcArea(){
        area = side*side;
        return area;
    }
    public int calcPerimeter(){
        perimeter = side * 4;
        return perimeter;
    }
}


// Q4) Create class rectangle and repeat Q3
class rectangle {
    int recSide;
    int recArea;
    int recPerimeter;

    public void setSide() {
        recSide = 5;
    }

    public int calcArea() {
        recArea = recSide * recSide;
        return recArea;
    }

    public int calcPerimeter() {
        recPerimeter = recSide * 4;
        return recPerimeter;
    }
}
public class CWH_39_PracSetCh8 {
    public static void main(String[] args) {


//        Q1 Usage)
        Emp Jayan = new Emp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary");
        Jayan.salary = scanner.nextInt();
        Jayan.setName();
        System.out.println(Jayan.getName());
        System.out.println(Jayan.getSalary());




//        Q2 Usage)
        Cellphone iphone = new Cellphone();
        iphone.ring();
        iphone.vibrate();
        iphone.callFriend();

//        Q3 Usage)
        square sq = new square();
        sq.setSide();
        System.out.println("Area of square with side 4 is: " + sq.calcArea());
        System.out.println("Perimeter of square with side 4 is: " + sq.calcPerimeter());

//        Q4 Usage)
        rectangle rec = new rectangle();
        rec.setSide();
        System.out.println("Area of rectangle with side 5 is: " + rec.calcArea());
        System.out.println("Perimeter of rectangle with side 5 is: " + rec.calcPerimeter());

    }
}

