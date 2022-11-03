package com.company;

//There can only be one public class in one java file
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_38_CustomClasses {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

//        Instantiating a new object called jayan
        Employee Jayan = new Employee();
        Employee John = new Employee();

//        Setting Attributes for the object
        Jayan.id=12;
        Jayan.name=("Jayan Almadi");
        John.id=17;
        John.name=("John Yadav");
        Jayan.salary=100000;
        John.salary=10000;


        Jayan.printDetails();
        John.printDetails();

        int salary = Jayan.getSalary();
        System.out.println(salary);
    }
}
